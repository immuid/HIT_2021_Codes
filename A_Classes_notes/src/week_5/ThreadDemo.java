package week_5;

public class ThreadDemo {
	public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();
		t.setName("This is my main method ");
		t.setPriority(10);
		System.out.println("Now the tread will sleep for 5 secons");
		met();
		System.out.println(t);
				
	}
	static void met()throws Exception{
		System.out.println("Method called...");
		Thread.sleep(5000);
	}

}
