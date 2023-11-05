package multi_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Single Thread
 */
public class ThreadDemo4 {
	public ThreadDemo4() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		//es.execute(new MyRunnable());
		es.execute(()->{System.out.println("Child Job is written here......");});
		es.shutdown();
	}
	public static void main(String[] args) {
		new ThreadDemo4();
		for(int i=0;i<=5;i++) {
		
		System.out.println("Main Thread..."+i);
		try {Thread.sleep(100);}catch(Exception e) {}	
		}
	}
		
}
	