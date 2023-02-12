package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;

public class ConnectFactoryTest3 {

	public static void main(String[] args) {
		String lastname = JOptionPane.showInputDialog("Lastname");
		String firstname = JOptionPane.showInputDialog("Firstname");
		ConnectionFactory connF = new ConnectionFactory();
		String sql = "SELECT [EmployeeID]" + ",[LastName]" + ",[FirstName]"
				+ "FROM [dbo].[Employees] WHERE Lastname=? and Firstname=?";//動態SQL指令
		System.out.println(sql);
		try (Connection conn = connF.getConnection();) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lastname);// 1代表第一個問號
			pstmt.setString(2, firstname);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.printf("%3s  %10s  %10s %n", rs.getString(1), rs.getString(2), rs.getString(3));// 2代表LastName
			}
			
			System.out.println("ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
