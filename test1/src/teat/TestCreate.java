package teat;

import bean.User;
import userDao.UserDataAccessObject;

public class TestCreate {

	public static void main(String[] args) {
		UserDataAccessObject uDAO = new UserDataAccessObject();
		User user = new User("dsagsd", "hdfhd");
		System.out.println(uDAO.createUser(user));

	}

}
