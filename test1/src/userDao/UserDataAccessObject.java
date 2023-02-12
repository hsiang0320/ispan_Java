package userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import bean.User;
import connUtil.ConnectionFactory;

public class UserDataAccessObject implements IUserDAO {// DAO
	// C
	@Override // 檢查介面有沒有這個方法
	public boolean createUser(User user) {
		String sql = "insert into [user] (acc,pwd) values(?,?)";
		ConnectionFactory connF = new ConnectionFactory();
		try (Connection conn = connF.getConnection();) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getAcc());
			pstmt.setString(2, user.getPwd());
			int updateCount=pstmt.executeUpdate();
			if(updateCount<1) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	// R
	@Override
	public User findUserById(int id) {

		String sql = "SELECT id,acc,pwd FROM [user] WHERE id=?";// user是關鍵字 用中括號括起來
		ConnectionFactory connF = new ConnectionFactory();
		try (Connection conn = connF.getConnection();) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			User user = new User();
			user.setId(rs.getInt(1));
			user.setAcc(rs.getString(2));
			user.setPwd(rs.getString(3));

			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public ArrayList<User> findAllUser() {
		return null;
	}

	// U
	@Override
	public boolean updateUser(User user) {
		return false;
	}

	// D
	@Override
	public boolean deleteUserById(int id) {
		return false;
	}
}
