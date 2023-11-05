package demo_practice_area;

public class ThreadDemo {
	public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();
			t.setName("This is my main method...");
			t.setPriority(10);
			System.out.println("Now the Thread will sleep for 5 second.....");
			met();
			System.out.println(t);
			
	}
	static void met() throws Exception{
		System.out.println("The method is called...");
		Thread.sleep(5000);
	}
}
	