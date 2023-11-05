package practice;

public class OneTaskManyThreads {
	public static void main(String[] args) {
		Cricket over=new Cricket();
		
		System.out.println("The match has started ...");
		new Thread(()->{
			for(int i=0;i<6;i++) {
				over.bowling();
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<6;i++) {
				over.batting();
			}
		}).start();
	}
}
class Cricket{
	boolean signal;
	synchronized public void bowling() {
		if(signal) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("bowled the ball....");
		signal=true;
		notify();
		//comedy();//uncommanding this creates deadlock
	}
	
	synchronized public void batting() {
		if(!signal) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Batting done .............");
		signal=false;
		notify();
		//emotions(); // uncommanding creates deadlock
	}
}