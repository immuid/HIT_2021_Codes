package module2.week3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo3 {
	public JdbcDemo3() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	}	
	public static void main(String[] args) throws Exception{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/aspire","root","root");
		try {
			con.setAutoCommit(false);
			
			Statement stmt= con.createStatement();
			stmt.execute("insert into students values(101,'abdul','root','system',300)");
			stmt.execute("insert into students values(102,'root','system',300)");
			
		}catch(Exception e) {
			System.out.println(e);
			con.rollback();
		}finally {
			con.commit();
		}
		
	}

}
