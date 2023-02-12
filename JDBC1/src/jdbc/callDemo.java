package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class callDemo {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String acc = "huang";
		String pwd = "1234";
		try (Connection conn = DriverManager.getConnection(url, acc, pwd)) {
			CallableStatement prepareCall = conn.prepareCall("{call get_customerid_and_order_date(?,?,?)}");// 呼叫預存程序
			prepareCall.setInt(1, 10438);
			prepareCall.registerOutParameter(2, java.sql.Types.NCHAR);
			prepareCall.registerOutParameter(3, java.sql.Types.DATE);
			prepareCall.execute();//執行
			//prepareCall.executeQuery();
			System.out.println(prepareCall.getString(2));
			System.out.println(prepareCall.getString(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
