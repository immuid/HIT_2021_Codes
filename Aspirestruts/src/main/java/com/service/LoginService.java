package com.service;

import com.dao.User;

public interface LoginService {
	public boolean checkUser(String uname,String upass);
	public boolean checkFlag(String uname);
	public boolean logout(String uname);
	public boolean register(User user);
	public void updateFlag(String uname);

}
