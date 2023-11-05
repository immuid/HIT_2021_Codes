package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBcon {
	 public DBcon() {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch (Exception e) {
			 e.printStackTrace();
		}
	}
	 
	 public boolean checkUser(String uname,String upass) {
		 try {
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
			 PreparedStatement ps=con.prepareStatement("select * from user where uname=? and upass=?");
			 ps.setString(1, uname);
			 ps.setString(2, upass);
			 ResultSet rs=ps.executeQuery();
			 if(rs.next()) {
				 return true;
			 }else{
				 return false;
			 }
			}
		 catch (Exception e) {
				e.printStackTrace();	
		 }
		 return false;
	 }
	 
	 public int register(int uid,String uname,String upass,int flag) {
		 try {
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
			 PreparedStatement ps= con.prepareStatement("insert into user value(?,?,?,?)");
			 ps.setInt(1, uid);
			 ps.setString(2, uname);
			 ps.setString(3, upass);
			 ps.setInt(4, flag);
			 int i=ps.executeUpdate();
			 return i;
		 }
		 catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	 }
	 
	 public static void main(String[] args) {
		DBcon dbcon=new DBcon();
		int add=dbcon.register(2,"sadham","secret", 0);
		System.out.println(add+" user added... ");
		System.out.println(dbcon.checkUser("imran","secret"));
	}

}
