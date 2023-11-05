package week_2;

public class VariableTypesOOA {
		public static void main(String[] args) {
			TrainingRoom c1= new TrainingRoom();
			c1.teach();c1.teach();c1.teach();
			TrainingRoom c2 = new TrainingRoom();
			c2.teach();c2.teach();
		}
}
class TrainingRoom{
	public TrainingRoom() {
		System.out.println("TrainingRoom is created....");
	}
		Projector pro = new Projector();
		static Toilet toilet = new Toilet();
	public void teach() {
		Student s1= new Student();
			
		}
		
	}
	

class Projector{
	public Projector() {
		System.out.println("Projector is created........");
	}
	
}
class Student{
    public Student() {
    	System.out.println("Stuent object is created.......");    	
		
	}
}
class Toilet{
public Toilet() {
	System.out.println("Toilet Object is Created.....");
}
}























//	public static void main(String[] args) {
//		
//		TrainingRoom container1= new TrainingRoom();
//		container1.memb();container1.memb();container1.memb();
//		TrainingRoom container2=new TrainingRoom();
//		container2.memb();container2.memb();
//	}
//	
//	
//}
//
//class TrainingRoom{
//	public TrainingRoom() {
//		System.out.println(" TrainingRoom Object is Created......");
//	}
//		Projector Pro=new Projector();
//		static Toilet toilet = new Toilet();
//		void memb() {
//			Student s1= new Student();
//		
//	}
//}
//class Projector{
//	public Projector() {
//		System.out.println(" Projector Object is Created....");
//	}
//}
//class Student{
//	public Student() {
//		System.out.println(" Student Object is Created....");
//	}
//}
//class Toilet{
//	public Toilet() {
//		System.out.println("Toilet Object is Created.....");
//	}
//}
//	int i=10;         // instance variable
//	static int s=10;  // class variable
//	void met() {
//		int j=20;     // local variable
//	}
//	public static void main(String[] args) {
//		TrainingRoom c1 = new TrainingRoom();
//		c1.memb();c1.memb();c1.memb();
//		TrainingRoom c2 = new TrainingRoom ();
//		c2.memb();c2.memb();
//		
//	}
//	
//
//}
//class TrainingRoom{
//	public TrainingRoom() {
//		System.out.println(" TrainingRoom Object is created ......");
//	}
//	Projector pro = new Projector() ;    //instance variable
//	static Toilet boys = new Toilet();  // class variable
//	void memb() {
//		Student s1 =new Student();    // local variable
//	}
//	
//	
//}
//class Projector{
//	public Projector(){
//		System.out.println(" Projector object is created ........ ");
//	}
//}
//class Toilet{
//	public Toilet() {
//		System.out.println("Toilet object is created ........");
//	}
//}
//class Student{
//	public Student() {
//		System.out.println("Student object is created...........");
//	}
//}
