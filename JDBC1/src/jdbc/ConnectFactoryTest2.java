package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;

public class ConnectFactoryTest2 {

	public static void main(String[] args) {
		// String lastname = JOptionPane.showInputDialog("Lastname");
		// String firstname = JOptionPane.showInputDialog("Firstname");
		ConnectionFactory connF = new ConnectionFactory();
		String sql = "SELECT [EmployeeID]" + ",[LastName]" + ",[FirstName]" + "FROM [dbo].[Employees]";
		try (Connection conn = connF.getConnection();) {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// 預設為FORWARD ONLY 相當於只能用RS.NEXT參數 前者為滾動 後者為唯讀
			
			ResultSet rs = stmt.executeQuery(sql);// 執行select 有回傳結果 RS為結果集 Result set
			while (rs.next()) {// rs.next()找下一筆資料 回傳boolean 有則return true 否則false
				System.out.printf("%3s  %10s  %10s%n", rs.getString(1), rs.getString(2), rs.getString(3));
			}
			System.out.println("ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
