package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(
				"jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false", "huang", "1234")) {
			System.out.println("成功");
			// conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
