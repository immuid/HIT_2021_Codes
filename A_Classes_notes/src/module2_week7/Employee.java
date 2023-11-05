package module2_week7;

public class Employee {
	private int eid;
	private String ename;
	private int esalary;
	
	
	public Employee(int eid, String ename, int esalary) {
		
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	

}
