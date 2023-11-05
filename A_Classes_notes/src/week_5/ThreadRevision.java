package week_5;

public class ThreadRevision {
	public ThreadRevision() {
		Thread t=new Thread(new ThreadJob());
		t.start();
	}
	public static void main(String[] args) {
		new ThreadRevision();
		Thread t=Thread.currentThread();
		System.out.println(t);
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				//Thread.sleep(1000);
			}catch(Exception e) {
		}
	}
	}
}
class ThreadJob implements Runnable{
	
	public void run() {
		System.out.println("Child thread is executed...");
		
	}
}