package test;

import java.sql.Connection;
import java.sql.SQLException;

import connUtil.ConnectionFactory;

public class TestConnection {

	public static void main(String[] args) {
		ConnectionFactory connF = new ConnectionFactory();
		try (Connection conn = connF.getConnection()) {
			System.out.println("ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}
	}

}
