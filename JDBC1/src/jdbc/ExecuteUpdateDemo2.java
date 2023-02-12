package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ExecuteUpdateDemo2 {

	public static void main(String[] args) {
		String sql = "insert into AAA values(?,?,?)";
//		
		ConnectionFactory connF = new ConnectionFactory();
		try (Connection conn = connF.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "002");
			stmt.setString(2, "aaa");
			stmt.setString(3, "123");
			int updateCount = stmt.executeUpdate();
			System.out.println("新增了"+updateCount+"筆資料");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
