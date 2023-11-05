package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcProg1{
	public static void main(String[] args) throws Exception{
		
		//Create or register connection 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
		 
		System.out.println("Connection...: "+con);
		
	}
}