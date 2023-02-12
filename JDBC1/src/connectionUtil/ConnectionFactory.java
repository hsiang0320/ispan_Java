package connectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String URL = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
	private String user = "huang";
	private String pwd = "1234";

	public Connection getConnection() throws SQLException {

		return DriverManager.getConnection(URL, user, pwd);
		
	}
}
