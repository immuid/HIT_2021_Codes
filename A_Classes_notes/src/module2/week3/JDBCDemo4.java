package module2.week3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo4 {
	public static void main(String[] args) {
		JDBCDemo obj= JDBCDemo.getJDBCDemo();
		//obj.doOperation1_Insert();
		//obj.doOperation2_Update(500);
		//obj.doOperation3_Delete(108);
	}
}
class JDBCDemo{
	// Singleton pattern; 
	private JDBCDemo() {
		System.out.println("JDBCDemo Object created...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static JDBCDemo jdbcDemo;
	public static JDBCDemo getJDBCDemo() {
		if(jdbcDemo==null) {
			jdbcDemo=new JDBCDemo();
		}
		return jdbcDemo;
	}
	public void doOperation1_Insert() {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aspire","root","root");
			con.setAutoCommit(false);
		    stmt=con.createStatement();
			String sql=("insert into students values(108, 'sadiq', 'root','java', 150)");
			stmt.execute(sql);		
			
		}catch(Exception e) {
			try {con.rollback();}catch(Exception ee) {ee.printStackTrace();}
			e.printStackTrace();
		}
		finally {
			try { con.commit();con.close();stmt.close();}catch(Exception e) {e.printStackTrace();}
		}
	}
	public void doOperation2_Update(float s_fees) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aspire","root","root");
			con.setAutoCommit(false);
		    stmt=con.createStatement();
			//String sql=("insert into students values("+ sid +",'"+ s_name +"','" +s_pwd +"','"+ s_course +"',"+ s_fees+")");
			int noOfRowsUpdated=stmt.executeUpdate("update students set s_fees="+s_fees);
			System.out.println("NO of rows updated = "+noOfRowsUpdated);
			
		}catch(Exception e) {
			try {con.rollback();}catch(Exception ee) {ee.printStackTrace();}
			e.printStackTrace();
		}
		finally {
			try { con.commit();con.close();stmt.close();}catch(Exception e) {e.printStackTrace();}
		}
	}
	public void doOperation3_Delete(int sid) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aspire","root","root");
			con.setAutoCommit(false);
		    stmt=con.createStatement();
			//String sql=("insert into students values("+ sid +",'"+ s_name +"','" +s_pwd +"','"+ s_course +"',"+ s_fees+")");
			int noOfRowsUpdated=stmt.executeUpdate("delete from students where sid = "+sid);
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
	