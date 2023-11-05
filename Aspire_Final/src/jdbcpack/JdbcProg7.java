package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcProg7 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
		System.out.println("Connection : "+con);
		
		String sql="select* from users where uid=?";
		PreparedStatement stmt=con.prepareStatement(sql); // Prepared statement is used for dynamic queries 
														 //  Statement is used for static queries...
		
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an id : ");
		int uid=scan.nextInt();
		
		/*
		String sql="select* from users where uid ="+uid;//This type of dynamism is not allowed ...
		//This can lead to a problem called sql injection - A security Problem...
		
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		*/
		
		stmt.setInt(1, uid);
		ResultSet rs=stmt.executeQuery();
		
		while(rs.next()) {
		System.out.println(rs.getString(2));
		}
		}
	}

}
