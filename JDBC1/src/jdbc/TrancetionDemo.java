package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TrancetionDemo {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String acc = "huang";
		String pwd = "1234";
		int count = 0;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, acc, pwd);
			conn.setAutoCommit(false);
			String sql = "update userMoneyTable set myMoney=? where myUser=?";
			String str = JOptionPane.showInputDialog("輸入金額");
			int money = Integer.parseInt(str);
			String selectmoneyA = "select mymoney from userMoneyTable where Myuser='A'";
			String selectmoneyB = "select mymoney from userMoneyTable where Myuser='B'";
			PreparedStatement pstmt1 = conn.prepareStatement(selectmoneyA);
			ResultSet rs = pstmt1.executeQuery();
			rs.next();
			int amoney = rs.getInt(1);

			PreparedStatement pstmt2 = conn.prepareStatement(sql);
			pstmt2.setInt(1, amoney - money);
			pstmt2.setString(2, "A");
			pstmt2.executeUpdate();
			PreparedStatement pstmt3 = conn.prepareStatement(selectmoneyB);
			ResultSet rs2 = pstmt3.executeQuery();
			rs2.next();
			int bmoney = rs2.getInt(1);
			if (bmoney + money > 800)
				throw new SQLException("數額超出");
			pstmt2.setInt(1, bmoney + money);
			pstmt2.setString(2, "B");
			pstmt2.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
