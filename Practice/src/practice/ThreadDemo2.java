package practice;

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("First Line...");
		System.out.println("Second Line...");
		//new Thread(()->{new ThreadDemo2().met();}).start(); //-lamda
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				new ThreadDemo2().met();
//			}
//			
//		}).start();
		new Thread(new MyRunnable()).start();
		System.out.println("Fourth Line...");
	}
		void met() {
			try {
				Thread.sleep(5000);
			}catch (Exception e) {}
			System.out.println("Third Line...");
		}

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		new ThreadDemo2().met();
	}
}
