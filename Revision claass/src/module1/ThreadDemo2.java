package module1;

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("First line ...");
		System.out.println("Second line ..");
		
		new Thread(new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			new ThreadDemo2().met();
		}
		}).start();
		
		System.out.println("Fourth line...");
	}
	public void met() {
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println("Third line..");
	}

}
