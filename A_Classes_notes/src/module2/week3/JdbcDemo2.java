package module2.week3;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JdbcDemo2 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/aspire","root","root"); 
		DatabaseMetaData dmd= con.getMetaData();
		
		System.out.println("Product Name : "+ dmd.getDatabaseProductName());
		System.out.println("Product Version : "+ dmd.getDatabaseProductVersion());
		System.out.println("Driver Name : "+ dmd.getDriverName());
		System.out.println("Driver Version : "+ dmd.getDriverVersion());
		
		System.out.println(dmd.supportsTransactionIsolationLevel(4));
		con.setTransactionIsolation(8);
		dmd=con.getMetaData();
		System.out.println("Default Isolation level set is : "+dmd.getDefaultTransactionIsolation());
		System.out.println("Current Isolation level is : "+con.getTransactionIsolation());
		
		System.out.println(con.getAutoCommit());
		con.setAutoCommit(false);
		System.out.println(con.getAutoCommit());
	}

}
