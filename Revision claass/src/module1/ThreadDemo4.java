package module1;

public class ThreadDemo4 {
	public ThreadDemo4() {
		System.out.println("Constructor Topic over ...");
		new Thread(new Runnable1()).start();
		
	}
	public static void main(String[] args) {
		System.out.println("Shoiab sir Teaching Constructor Topic...");
		
		new ThreadDemo4();	
		
		 try { Thread.sleep(1); }catch(Exception e) {};
		 
		
		System.out.println("Shoiab sir Teaching Exception Topic ...");
		
	}
}
class Runnable1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Sir This is my doubt by Afroz ...");
	}
}
