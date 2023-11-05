package multi_Threading;
/*
 * Single Thread
 */
public class ThreadDemo {
	public static void main(String[] args) {
		
		Thread g=Thread.currentThread();
		System.out.println(g);
		
		System.out.println("Welcome to MultiThreading....");
		System.out.println("Example.... Train and its Stopings...");
		
		egmore();
		tambaram();
		chengalpattu();
	}
	public static void egmore() {
		System.out.println("Arrived at Egmore Station...");
		try {Thread.sleep(5000);}catch(Exception e) {System.out.println(e);}
			
		System.out.println("Dispatched from Egmore Station...\n");
	}
	public static void tambaram() {
		System.out.println("Arrived at Tambaram Station...");
		try {Thread.sleep(5000);}catch(Exception e) {System.out.println(e);}
			
		System.out.println("Dispatched from Tambaram Station...\n");
	}
	public static void chengalpattu() {
		System.out.println("Arrived at Chengalpattu Station...");
		try {Thread.sleep(5000);}catch(Exception e) {System.out.println(e);}
			
		System.out.println("Dispatched from Chengalpattu Station...\n");
}

}
