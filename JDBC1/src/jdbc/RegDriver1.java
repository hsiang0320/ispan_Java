package jdbc;

public class RegDriver1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("執行成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
