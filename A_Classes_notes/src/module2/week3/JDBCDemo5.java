package module2.week3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCDemo5 {
	public static void main(String[] args) {
		JDBCDemoo obj= JDBCDemoo.getJDBCDemo();
		//obj.doOperation1_InsertDynamically(108, "arif", "root","java", 150);
		//obj.doOperation2_UpdateDynamically(500);
		//obj.doOperation3_DeleteDynamically(105);
	}
}
class JDBCDemoo{
	// Singleton pattern; 
	private JDBCDemoo() {
		System.out.println("JDBCDemo Object created...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static JDBCDemoo jdbcDemo;
	public static JDBCDemoo getJDBCDemo() {
		if(jdbcDemo==null) {
			jdbcDemo=new JDBCDemoo();
		}
		return jdbcDemo;
	}
	public void doOperation1_InsertDynamically(int sid,String s_name,String s_pwd,String s_course, float s_fees) {
		Connection con=null;PreparedStatement stmt=null;//Used Prepared statements 
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aspire","root","root");
			con.setAutoCommit(false);
		    stmt=con.prepareStatement("insert into students values(?,?,?,?,?)");
		    stmt.setInt(1, sid);
		    stmt.setString(2, s_name);
		    stmt.setString(3, s_pwd);
		    stmt.setString(4, s_course);
		    stmt.setFloat(5, s_fees);
			//String sql=("insert into students values("+ sid +",'"+ s_name +"','" +s_pwd +"','"+ s_course +"',"+ s_fees+")");
			//stmt.execute(sql);
		    int noOfRowsUpdated=stmt.executeUpdate();
		    System.out.println("NO of rows inserted = "+noOfRowsUpdated);
			
		}catch(Exception e) {
			try {con.rollback();}catch(Exception ee) {ee.printStackTrace();}
			e.printStackTrace();
		}
		finally {
			try { con.commit();con.close();stmt.close();}catch(Exception e) {e.printStackTrace();}
		}
	}
	public void doOperation2_UpdateDynamically(float s_fees) {
		Connection con=null;
		PreparedStatement stmt=null;//used statements
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aspire","root","root");
			con.setAutoCommit(false);
			String sql=("update students set s_fees=?");
		    stmt=con.prepareStatement(sql);
			stmt.setFloat(1, s_fees);
			
			int noOfRowsUpdated=stmt.executeUpdate();
			System.out.println("NO of rows updated = "+noOfRowsUpdated);
			
		}catch(Exception e) {
			try {con.rollback();}catch(Exception ee) {ee.printStackTrace();}
			e.printStackTrace();
		}
		finally {
			try { con.commit();con.close();stmt.close();}catch(Exception e) {e.printStackTrace();}
		}
	}
	public void doOperation3_DeleteDynamically(int sid) {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aspire","root","root");
			con.setAutoCommit(false);
			String sql=("delete from students where sid = ?");
		    stmt=con.prepareStatement(sql);
		    stmt.setInt(1, sid);
			int noOfRowsUpdated=stmt.executeUpdate();
			System.out.println("NO of rows Deleted = "+noOfRowsUpdated);
			
		}catch(Exception e) {
			try {con.rollback();}catch(Exception ee) {ee.printStackTrace();}
			e.printStackTrace();
		}
		finally {
			try { con.commit();con.close();stmt.close();}catch(Exception e) {e.printStackTrace();}
		}
	}
}
	