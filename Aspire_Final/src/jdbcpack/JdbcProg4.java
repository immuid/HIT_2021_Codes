package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcProg4{
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
		System.out.println("Connection..: "+con);
		
		String sql1="create table department(did int(5),dname varchar(40))";
		String sql2="insert into department values(1,'purchase')";
		String sql3="insert into department values(2,'sales')";
		String sql4="delete from department where did=2";
		Statement stmt=con.createStatement();
		
		System.out.println(stmt.executeUpdate(sql1));
		System.out.println(stmt.executeUpdate(sql2));
		System.out.println(stmt.executeUpdate(sql3));
		System.out.println(stmt.executeUpdate(sql4));
		
	}
}