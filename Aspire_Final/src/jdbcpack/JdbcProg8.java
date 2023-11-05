package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcProg8 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
		System.out.println("Connection : "+con);
		
		String sql="insert into users values(?,?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an id : ");
		int uid=scan.nextInt();
		System.out.println("Please enter user name : ");
		String uname=scan.next();
		System.out.println("Please set user password : ");
		String upass=scan.next();
		System.out.println("Please enter user city : ");
		String city=scan.next();
		int flag=0;
		
		/*
		String sql="select* from users where uid ="+uid;//This type of dynamism is not allowed ...
		//This can lead to a problem called sql injection - A security Problem...
		
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		*/
		
		stmt.setInt(1, uid);
		stmt.setString(2, uname);
		stmt.setString(3, upass);
		stmt.setString(4, city);
		stmt.setInt(5, flag);
		int no =stmt.executeUpdate();
		
		System.out.println(no+" records inserted ...");
		}
	}

}
