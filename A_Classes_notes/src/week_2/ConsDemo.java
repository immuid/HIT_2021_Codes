package week_2;

public class ConsDemo {
	public ConsDemo() {
		System.out.println("The cons called..");
	}
	public ConsDemo(int i) {
		System.out.println("Overloaded consDemo is called..."); 
		
	}
	public ConsDemo(String s) {
	System.out.println("String Cons is called... ");
	}
	public ConsDemo(int r, String str) {
		System.out.println("Multiparameter cons called...");
	}
	public static void main(String[] args) {
//		new ConsDemo(5,"hello");
//		new ConsDemo(1);
		ConsDemo obj1= new ConsDemo();
		ConsDemo obj2= new ConsDemo(5,"hello");
		obj1.met();
		obj1.met(1);
		
		obj2.met(1);
		obj2.met();
		
	}
	void met() {
		System.out.println("method with out parameter called ..");
	}
	void met(int i) {
		System.out.println("method with parameter is called ....");
	}
	
	
}
// The name of the concept is - virtual method invocation(VMI)
// only one constructor can be called when one object is created ...
 



/*// constructor demo //

	public static void main(String[] args) {
		new Human1();
	}
	
	
}
class Human1{
	public Human1(){
		
		System.out.println("Crying is tought before Birth....");
	}
}
*/