package practice;

public class ThreadDemo3 {
	public ThreadDemo3() {
		System.out.println("Constructor Called...");
		new Thread(new Runnable1()).start();
	}
	public static void main(String[] args) {
		System.out.println("Main Thread Line one...");
		new ThreadDemo3();
		try {Thread.sleep(1);}catch(Exception e) {};
		System.out.println("Main Thread Line two...");
	}
	
}
class Runnable1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child Thread called ...");
		
	}
	
}