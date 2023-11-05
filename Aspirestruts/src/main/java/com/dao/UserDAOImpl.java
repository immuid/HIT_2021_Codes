 package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserDAOImpl implements UserDAO {
	DBConnection dbcon;
	public UserDAOImpl() {
		dbcon=DBConnection.getDBCon();
		//System.out.println(dbcon);
	}
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	@Override
	public boolean checkUser(String uname, String upass) {
		
		try {
			con=dbcon.getConnection();
			ps=con.prepareStatement("select * from users where uname=? and upass=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			try {con.close();rs.close();ps.close();}catch(Exception ee) {ee.printStackTrace();}
			return false;
		}
		
		
	}

	@Override
	public void insertUser(User user) {
		try {
			con=dbcon.getConnection();
			ps=con.prepareStatement("insert into users values(?,?,?,?)");
			ps.setInt(1, user.getUid());
			ps.setString(2, user.getUname());
			ps.setString(3, user.getUpass());
			ps.setInt(4, user.getFlag());
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			try {con.close();ps.close();}catch(Exception ee) {ee.printStackTrace();}		
		}		
	}

	@Override
	public void updateUser(User user,int uid) {
		try {
			con=dbcon.getConnection();
			ps=con.prepareStatement("update users set uid=?,uname=?,upass=?,flag=? where uid=?");
			ps.setInt(1, user.getUid());
			ps.setString(2, user.getUname());
			ps.setString(3, user.getUpass());
			ps.setInt(4, user.getFlag());
			ps.setInt(5, uid);
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			try {con.close();ps.close();}catch(Exception ee) {ee.printStackTrace();}		
		}		

		
	}

	@Override
	public void deleteUser(int uid) {
		try {
			con=dbcon.getConnection();
			ps=con.prepareStatement("delete from  users where uid=?");
			ps.setInt(1, uid);			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			try {con.close();ps.close();}catch(Exception ee) {ee.printStackTrace();}		
		}	
		
	}

	@Override
	public void deleteUser(User user) {
		try {
			con=dbcon.getConnection();
			ps=con.prepareStatement("delete from  users where uid=?");
			ps.setInt(1, user.getUid());			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			try {con.close();ps.close();}catch(Exception ee) {ee.printStackTrace();}		
		}		

		
		
	}

	@Override
	public User getUser(int uid) {
		User user=null;
		try {
			con=dbcon.getConnection();
			ps=con.prepareStatement("select * from users where uid=?");
			ps.setInt(1, uid);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				user=new User();	
				user.setUid(uid);
				user.setUname(rs.getString("uname"));
				user.setUpass(rs.getString("upass"));
				user.setFlag(rs.getInt("flag"));
				return user;
			}
			else {
				return null;
			}
		}catch(Exception e) {
			e.printStackTrace();
			try {con.close();rs.close();ps.close();}catch(Exception ee) {ee.printStackTrace();}
			return null;
		}
	}
	@Override
	public User getUserByName(String uname) {
		User user=null;
		try {
			con=dbcon.getConnection();
			ps=con.prepareStatement("select * from users where uname=? ");
			ps.setString(1, uname);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				user=new User();	
				user.setUid(rs.getInt("uid"));
				user.setUname(rs.getString("uname"));
				user.setUpass(rs.getString("upass"));
				user.setFlag(rs.getInt("flag"));
				return user;
			}
			else {
				return null;
			}
		}catch(Exception e) {
			e.printStackTrace();
			try {con.close();rs.close();ps.close();}catch(Exception ee) {ee.printStackTrace();}
			return null;
		}
		
	}

	@Override
	public List<User> getAllUsers() {
		 List<User> list= new ArrayList<>();
		try {
			con=dbcon.getConnection();
			ps=con.prepareStatement("select * from users");						
			rs=ps.executeQuery();
			while(rs.next()) {
				User user=new User();	
				user.setUid(rs.getInt("uid"));
				user.setUname(rs.getString("uname"));
				user.setUpass(rs.getString("upass"));
				user.setFlag(rs.getInt("flag"));
				list.add(user);
			}			
		}catch(Exception e) {
			e.printStackTrace();
			try {con.close();rs.close();ps.close();}catch(Exception ee) {ee.printStackTrace();}
			return null;
		}
		return list;

	}
	
	public static void main(String[] args) {
		UserDAOImpl obj=new UserDAOImpl();
		System.out.println(obj.checkUser("rahi","spider"));
		//User user=new User(3,"shamsudhin","secret", 0);
		//obj.updateUser(user,3);
		//obj.insertUser(user);
		//obj.deleteUser(3);
		//System.out.println(obj.getUser(1));
		//System.out.println(obj.getAllUsers());
		User user=obj.getUserByName("ram");
		System.out.println(user);
	}

}
