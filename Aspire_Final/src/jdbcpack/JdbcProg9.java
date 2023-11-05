package jdbcpack;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcProg9{
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");
		System.out.println("Connection..: "+con);
		
		String sql = " update users set flag = ? where uname = ?";
		PreparedStatement stmt= con.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter flag 0 or 1 = ");
		int flag =scan.nextInt();
		System.out.println(" Enter name = ");
		String name= scan.next();
		
		stmt.setInt(1, flag);
		stmt.setString(2, name);
		
		int no =stmt.executeUpdate();
		System.out.println(no+ " records updated ...\n");
		
		sql="select * from users";
		ResultSet rs= stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("\n uid: "+rs.getInt(1)+"\n uname: "+rs.getString(2)+"\n City: "+rs.getString(4)+"\n Flag: "+rs.getInt(5));
		}
		
	
	}
}