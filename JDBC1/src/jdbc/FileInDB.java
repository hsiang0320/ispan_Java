package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileInDB {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String acc = "huang";
		String pwd = "1234";
		int count=0;
		try (Connection conn = DriverManager.getConnection(url, acc, pwd)) {
			String sql = "insert into fileTable(fileName,MyFile) values(?,?)";
		FileInputStream fis = new FileInputStream("C:/Users/h8803/OneDrive/圖片/3.jpg");
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "3.jpg");
			pstmt.setBinaryStream(2, fis);
		 	count= pstmt.executeUpdate();
		 	System.out.println("ok"+count );
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
