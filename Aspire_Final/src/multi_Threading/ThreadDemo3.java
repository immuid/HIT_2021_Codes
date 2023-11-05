package multi_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Single Thread
 */
public class ThreadDemo3 {
	public ThreadDemo3() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		//es.execute(new MyRunnable());
		es.execute(()->{System.out.println("Child Job is written here......");});
		es.shutdown();
	}
	public static void main(String[] args) {
		new ThreadDemo3();
		System.out.println("Main Thread...");
	}
		
}
	