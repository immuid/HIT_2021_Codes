package multi_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Single Thread
 */
public class ThreadDemo5 {
	
	public static void main(String[] args) {
		met1();
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(()->{met2();});
		met3();
	}
	public static void met1() {
		System.out.println("met1 called.........");
	}
	public static void met2() {
		System.out.println("met2 started.........");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("met2 finished........");
	}
	public static void met3() {
		System.out.println("met3 called.........");
	}
}
	