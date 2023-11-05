package module2_week7;

import java.util.ArrayList;
import java.util.List;

public class XmlDemo {
	public static void main(String[] args) {
		Employee emp1=new Employee(1,"ramu",2000);
		Employee emp2=new Employee(1,"ramu",2000);
		setEmployee(emp1);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		
		setEmployees(employees);
	}
	
	public static void setEmployee(Employee e) {
		System.out.println(e);
	}
	
	public static void setEmployees(List<Employee> emps) {
		System.out.println(emps);
	}
}

