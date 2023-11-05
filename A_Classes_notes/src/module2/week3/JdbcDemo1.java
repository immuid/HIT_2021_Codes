package module2.week3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/aspire", "root", "root" );
		System.out.println(con);
		
		Statement stmt = con.createStatement();
		stmt.execute("insert into students values(201,'sadiq','root','10th',200)");
	}

}
