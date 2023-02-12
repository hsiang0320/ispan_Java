package test;

import bean.User;
import userDao.UserDataAccessObject;

public class Test {

	public static void main(String[] args) {
		UserDataAccessObject userDao=new UserDataAccessObject();
//		User user = userDao.findUserById(1);
//		System.out.println(user.getId());
//		System.out.println(user.getAccount());
//		System.out.println(user.getPwd());
		
//		User user=new User();
//		user.setId(2);
//		user.setAccount("banana");
//		user.setPwd("papanana");
		System.out.println(userDao.deleteUserById(2));
		
		
	}

}
