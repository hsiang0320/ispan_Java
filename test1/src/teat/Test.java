package teat;

import bean.User;
import userDao.UserDataAccessObject;

public class Test {

	public static void main(String[] args) {
		UserDataAccessObject uDAO = new UserDataAccessObject();
		User user =uDAO.findUserById(1);
		System.out.println(user.getId());
		System.out.println(user.getAcc());
		System.out.println(user.getPwd());
		
		
	}

}
