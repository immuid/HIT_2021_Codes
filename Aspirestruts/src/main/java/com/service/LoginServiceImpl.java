package com.service;

import com.dao.User;
import com.dao.UserDAO;
import com.dao.UserDAOImpl;

public class LoginServiceImpl implements LoginService {
	UserDAO dao;
	public LoginServiceImpl() {
		dao=new UserDAOImpl();
	}

	@Override
	public boolean checkUser(String uname, String upass) {
		if(dao.checkUser(uname, upass)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean checkFlag(String uname) {
		User user=dao.getUserByName(uname);
		if(user.getFlag()==0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean logout(String uname) {
		User user=dao.getUserByName(uname);
		user.setFlag(0);
		dao.updateUser(user, user.getUid());
		return true;
	}
	
@Override
	public void updateFlag(String uname) {
	User user=dao.getUserByName(uname);
	user.setFlag(1);
	dao.updateUser(user, user.getUid());
	
	}

	@Override
	public boolean register(User user) {
		dao.insertUser(user);
		return true;
	}
	public static void main(String[] args) {
		LoginServiceImpl obj=new LoginServiceImpl();
		System.out.println(obj.checkUser("ram","spider"));
		System.out.println(obj.checkFlag("ram" ));
		obj.logout("ram");
		}

}
