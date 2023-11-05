package module1;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("First line ...");
		System.out.println("Second line ..");
		
		new Thread(()->new ThreadDemo().met()).start();
		//new ThreadDemo().met();
		System.out.println("Fourth line ...");
		
	}
	public void  met() {
		try {
			Thread.sleep(5000);
		} catch(Exception e) {}
		System.out.println("Third line");
	}
	
	
}
