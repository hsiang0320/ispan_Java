package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class BatchDemo {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String acc = "huang";
		String pwd = "1234";
		int count = 0;
		try (Connection conn = DriverManager.getConnection(url, acc, pwd)) {
			Statement stmt = conn.createStatement();
			String sql = "insert into MyCustomer(name) values(?)";
			stmt.addBatch(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			String nameString = "";
			while ((nameString = JOptionPane.showInputDialog("name")) != null) {
				pstmt.setString(1, nameString);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
			System.out.println("ok");

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
