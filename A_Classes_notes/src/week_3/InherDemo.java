package week_3;

public class InherDemo {
	public static void main(String[] args) {
		Employee emp= new Engineer();
		Engineer eng= new Engineer();
		//Employee att = new Attender();
		emp.met(2);
		eng.met(2);
		//att.met(3);
		
		
	}		
}

class Human{
	public void blabla() {
		System.out.println(" blabla method called...");
	}
}

class Employee extends Human{                     // parent class i known as super class	
	protected int met(int i) {
		System.out.println(" met method of employee called ....");
		return i;
	}
	
}
class Engineer extends Employee{
	public int met(int i) { // method Overriding...
		System.out.println("Engineer met method called ..."); 
		super.met(4);// super is a keyword which refer parent class...
		super.blabla();
		return i;
	}
}
class Attender extends Employee{
	
}




//	public static void main(String[] args) {
//		Employee emp = new Attender();
//		Engineer eng = new Engineer();
//	}
//
//}
//// This is called Inheritance or generalization
//class Employee{
//	
//}
//class Engineer extends Employee{
//	
//}
//class Attender extends Employee{
//	
//}
 