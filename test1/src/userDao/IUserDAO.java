package userDao;

import java.util.ArrayList;

import bean.User;

public interface IUserDAO {

	// C
	boolean createUser(User user);

	// R
	User findUserById(int id);

	ArrayList<User> findAllUser();

	// U
	boolean updateUser(User user);

	// D
	boolean deleteUserById(int id);

}