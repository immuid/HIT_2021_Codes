package lab.work2;

public class Employee {
	int empId;
	String empName;
	Employee(int id,String name){
		this.empId= id;
		this.empName= name;
	}
	void info() {
		System.out.println("Id = "+empId+" Name = "+empName);
	}
	public static void main(String[] args) {
		Employee obj1=new Employee(21222, "Imran Ahmed");
		obj1.info();
		Employee obj2=new Employee(21211, " shoid mohammed");
		obj2.info();
	}
		

}
