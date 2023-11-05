package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	private static DBConnection dbcon;
	synchronized public static DBConnection getDBCon() {
		
		if(dbcon==null) {
			dbcon=new DBConnection();
		}
		return dbcon;
		
	}
	
	synchronized Connection getConnection() {
		try {
			  Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/aspire", "root", "root");
			  return con;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
	}
}
