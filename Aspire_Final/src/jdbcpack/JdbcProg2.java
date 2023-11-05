package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcProg2 {
	public static void main(String[] args) throws Exception {
		/*
		 * 1.Load or register the driver - note this should be done only once..
		 * 
		 * 2.Establish a connection
		 * 
		 * 3.Prepare and execute a statement
		 * 
		 * 4.Process the result
		 *  
		 */
		
//Load or register the driver...
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//Establish a connection ...
		
		 //for that java has a separate package called sql in java whose classes will be used 
		//The return type of the connection program will be a connection object...
	  
		//Connection con=DriverManager.getConnection("url","userid","password"); url=protocol:database://ipaddress/dbname
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");  
		
		System.out.println("Connection...: "+con);
		
//Reading values form the database Table.
		
		String sql="select * from users";
		
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);// stmt.execute connects to db and execute and returns an object of type Resultset...it is a collection
											 //This collection has to be read inorder to read the values...
		while(rs.next()) {
			System.out.println("Uid : "+rs.getInt(1)+" Uname : "+rs.getString(2)+" : City : "+rs.getString(4));
		}
		System.out.println(".................................................");
		sql="select * from users where city='chennai'";
		
		stmt=con.createStatement();
		rs = stmt.executeQuery(sql);// stmt.execute connects to db and execute and returns an object of type Resultset...it is a collection
											 //This collection has to be read inorder to read the values...
		if(rs.next()) {				//use if stmt if only one statement...
			System.out.println("Uid : "+rs.getInt(1)+" Uname : "+rs.getString(2)+" : City : "+rs.getString(4));
		}
		else {
			System.out.println("No Records.......");
		}
	}

}
