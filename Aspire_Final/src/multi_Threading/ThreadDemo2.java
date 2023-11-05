package multi_Threading;
/*
 * Single Thread
 */
public class ThreadDemo2 {
	public ThreadDemo2() {
		Thread t=new Thread(new MyRunnable());
		t.start();  	//calls the run method...
	}
	public static void main(String[] args) {
		new ThreadDemo2();
		
		System.out.println("Main Thread...");
	}

}

class MyRunnable implements Runnable{
@Override
	public void run() {
		System.out.println("Child Thread job is written here....");
		
	}
}
	