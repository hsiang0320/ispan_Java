package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ExecuteUpdateDemo {

	public static void main(String[] args) {
		String sqlString ="insert into AAA values('001','Bob','45613789')" ;
//		String sql = "CREATE TABLE AAA2\r\n" + "(\r\n" + "id int primary key not null, \r\n"
//				+ "username nvarchar(30)not null,\r\n" + "pwd nvarchar(30)not null,\r\n" + "\r\n" + ")";
		//String sql="SELECT * FROM [Northwind].[dbo].[Employees]";
		ConnectionFactory connF = new ConnectionFactory();
		try (Connection conn = connF.getConnection()) {
			Statement stmtStatement = conn.createStatement();
			// stmtStatement.executeUpdate(sqlString);
			// stmtStatement.executeUpdate(sql);
			// int updateCount = stmtStatement.executeUpdate(sql);
			// System.out.println("新增了" + updateCount + "筆資料");
			// System.out.print("新增了一筆資料");
			boolean execute = stmtStatement.execute(sqlString);
			System.out.println("是否有Resultset " + execute);
			ResultSet rs = stmtStatement.getResultSet();
			if(execute) {
				while (rs.next()) {
				System.out.println(rs.getString(3));
			}
			}else {
				int updateCount = stmtStatement.getUpdateCount();
				 System.out.println("新增了" + updateCount + "筆資料");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
