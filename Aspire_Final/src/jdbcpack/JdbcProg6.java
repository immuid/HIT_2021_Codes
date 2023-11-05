package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcProg6 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
		System.out.println("Connection ... "+con);
		
		con.setAutoCommit(false);//removes the auto commit option..
		
		String str="update users set flag= 1";
		String str1="update users set flag= 0";
		Scanner scan=new Scanner(System.in);
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate(str);
		System.out.println("Press 0 to commit or 1 to rollback ");
		
		int n=scan.nextInt();
		
		if(n==0) {
			con.commit();
			System.out.println("commit successful...");
		}else {
			con.rollback();
			System.out.println("roll backed...");
		}
	}

}
