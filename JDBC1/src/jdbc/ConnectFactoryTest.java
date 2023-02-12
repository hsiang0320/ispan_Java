package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;

public class ConnectFactoryTest {

	public static void main(String[] args) {
		String lastname = JOptionPane.showInputDialog("Lastname");
		String firstname = JOptionPane.showInputDialog("Firstname");
		ConnectionFactory connF = new ConnectionFactory();
		String sql = "SELECT [EmployeeID]" + ",[LastName]" + ",[FirstName]" + "FROM [dbo].[Employees] WHERE Lastname='"
				+ lastname + "'and Firstname='" + firstname + "'";
		try (Connection conn = connF.getConnection();) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);//執行select 有回傳結果
			while (rs.next()) {
				System.out.println(rs.getString(2));// 2代表LastName
			}
			System.out.println("ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
