package connUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String url = "jdbc:sqlserver://localhost:1433;databasename=mytest;encrypt=false";
	String username = "huang";
	String pwd = "1234";

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, pwd);
	}
}
