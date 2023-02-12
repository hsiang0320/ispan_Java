package jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.spec.MGF1ParameterSpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FileReadDB {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String acc = "huang";
		String pwd = "1234";
		int count = 0;
		try (Connection conn = DriverManager.getConnection(url, acc, pwd)) {
			String sql = "select fileName,MyFile from fileTable where fileName='3.jpg'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				FileOutputStream fos = new FileOutputStream("c:/Users/h8803/OneDrive/圖片/5.jpg");
				InputStream binaryStream = rs.getBinaryStream(2);
				int data = 0;
				while ((data = binaryStream.read()) != -1) {
					fos.write(data);
				}
				fos.flush();// 沖出=>把記憶體的資料沖出到檔案中 關閉前避免資料殘留在記憶體中 舊式寫法 現在close就會做了 可以不用做
				fos.close();
				binaryStream.close();
				System.out.println("ok");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
