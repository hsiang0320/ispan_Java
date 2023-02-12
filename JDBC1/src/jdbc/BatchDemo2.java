package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo2 {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String acc = "huang";
		String pwd = "1234";
		int count = 0;
		try (Connection conn = DriverManager.getConnection(url, acc, pwd)) {
			Statement stmt = conn.createStatement();
			stmt.addBatch("insert into MyCustomer(name) values('Bob5')");
			stmt.addBatch("insert into MyCustomer(name) values('Bob6')");
			stmt.addBatch("insert into MyCustomer(name) values('Bob7')");
			stmt.addBatch("insert into MyCustomer(name) values('Bob8')");
			stmt.addBatch("update MyCustomer set name='Bob10' where id=2");
			stmt.addBatch("update MyCustomer set name='Bob10' where id=3");
			stmt.addBatch("Delete from MyCustomer  where id=1");
			
			int[] executeBatch = stmt.executeBatch();
			for(int e :executeBatch) {
				System.out.println(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
