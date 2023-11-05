package jdbcpack;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcProg5{
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
		System.out.println("Connection..: "+con);
		
		/*
		 * ResultsetMetaData - returns the Table information 
		 * Resultset 		 - returns the Table data 
		 * DatabaseMetaData  - returns the Database Infromation
		 */
	
		
		con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED );
		System.out.println("For IRCTC ...");
		System.out.println("This is my connection Isolation : "+con.getTransactionIsolation());
		System.out.println("For Reservation counter ...");
		con.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
		System.out.println("Reservation Counter connection :"+con.getTransactionIsolation());
		
		DatabaseMetaData dmd =con.getMetaData();
		
		
		System.out.println(dmd.getDatabaseProductName());		
		System.out.println("This is default database connection Isolation : "+dmd.getDefaultTransactionIsolation());
		/*
			Default Transaction Isolation degree is 2
			 We can change the Isolation degree as  1 , 2 , 4 and 8
			 
			 TRANSACTION_READ_UNCOMMITTED           = 1
			 TRANSACTION_READ_COMMITTED             = 2
			 TRANSACTION_REPEATABLE_READ            = 4
			 TRANSACTION_SERIALIZABLE               = 8
			 
		*/
		
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getUserName());
		System.out.println(dmd.getDriverVersion());
	}
}
	