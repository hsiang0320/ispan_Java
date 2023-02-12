package jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Iterator;

public class RegDriver2 {

	public static void main(String[] args) {
		//System.setProperty("jdbc.drivers", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//自動載入
		Enumeration<Driver> drivers=DriverManager.getDrivers();
		Iterator<Driver> driIter = drivers.asIterator();//alt shift l
		driIter.forEachRemaining(System.out::println);
	}

}
