package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ExecuteUpdateDemo3 {
//一次新增多筆資料
	public static void main(String[] args) {
		String sql = "insert into AAA values(?,?,?)";
		String[] id = { "001", "002", "003" };
		String[] name = { "Tom", "Roger", "Leo" };
		String[] pwd = { "123", "456", "789" };
		int updateCount = 0;
		ConnectionFactory connF = new ConnectionFactory();
		try (Connection conn = connF.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(sql);
			for (int i = 0; i < id.length; i++) {
				stmt.setString(1, id[i]);
				stmt.setString(2, name[i]);
				stmt.setString(3, pwd[i]);
				updateCount += stmt.executeUpdate();
			}

			System.out.println("新增了" + updateCount + "筆資料");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
