package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class JdbcProg11 {
	public static void main(String[] args) throws Exception {
				
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","root");  
		
		System.out.println("Connection...: "+con);
		
//		CallableStatement cs= con.prepareCall("{call proc1()}");		
//		int n=cs.executeUpdate();		
//		System.out.println("updated... "+n);
//		
//		
//		cs=con.prepareCall("{call proc2(?,?)}");
//		cs.setString(1, "hari");
//		cs.setInt(2, 1);
//		n=cs.executeUpdate();
//		System.out.println("updated... "+n);
		
		CallableStatement cs3=con.prepareCall("{call proc3(?,?)}");
		cs3.setString(1, "hari");
		cs3.registerOutParameter(2, Types.INTEGER);
		
		boolean b=cs3.execute();//the execute is always returns false
		System.out.println("Result... "+b);// Note : The execute() method  returns true only when the reture type of sql is a resultset
		
		int flag=cs3.getInt(2);
		System.out.println("The flag value is : "+flag);
		
	//	Note : The execute() method  returns true only when the reture type of sql is a resultset
		
		Statement st=con.createStatement();// the statement returs the resultset...
		b= st.execute("select*from users ");
		System.out.println("Result ..."+b);
		
		
		
		
	}

}
