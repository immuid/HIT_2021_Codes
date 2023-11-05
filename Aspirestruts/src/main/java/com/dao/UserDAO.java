package com.dao;

import java.util.List;

public interface UserDAO {
	
	public boolean checkUser(String uname, String upass);
	public void insertUser(User user);
	public void updateUser(User user,int uid);
	public void deleteUser(int uid);
	public void deleteUser(User user);
	public User getUser(int uid );
	public User getUserByName(String uname);
	public List<User> getAllUsers();

}
