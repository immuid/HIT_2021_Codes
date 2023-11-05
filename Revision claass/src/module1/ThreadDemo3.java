package module1;

public class ThreadDemo3 {
	public static void main(String[] args) {
		
		System.out.println("First line ...");
		System.out.println("Second line ..");
		
		new Thread(new MyRunnable()).start();
		
		System.out.println("Fourth line");
	}
	public void met() {
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println("Third line....");
	}

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		new ThreadDemo3().met();
		
	}
	
}
