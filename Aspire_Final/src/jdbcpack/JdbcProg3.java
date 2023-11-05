package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcProg3{
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
		System.out.println("Connection..: "+con);
		
		//Update Query
		
		String sql="insert into users values(4,'hami','secret','Trichy',0)";
		
		String sql1="update users set flag =1";
		Statement stmt=con.createStatement();
		
		int no=stmt.executeUpdate(sql);// The update query returns how many rows affected it returns a number so we use executeUpdate.
		System.out.println("The number of records updated : "+no);
		System.out.println(stmt.executeUpdate(sql1));
		
	}
}