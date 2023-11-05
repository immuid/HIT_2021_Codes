package practice;

public class ThreadDemo1 {
	public static void main(String[] args) {
		System.out.println("First Line...");
		System.out.println("Second Line...");
		new ThreadDemo1().met();
		System.out.println("Fourth Line...");
	}
	void met() {
		try {Thread.sleep(5000);}catch(Exception e){}
		System.out.println("Third Line...");
	}

}
