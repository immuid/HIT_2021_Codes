package multi_Threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ThreadDemo6 {
	
	public static void main(String[] args) throws Exception{
		System.out.println("Main Thread is Teaching.........");
		ExecutorService es=Executors.newFixedThreadPool(2);//creating 2 Threads 
		es.execute(()->{new Work1().eatBreakFast();});
//		Future<String>future= es.submit(new MyCallable());
		Future<String>future= es.submit(()->{return new Work2().payBill();});//this is lambda bcoz Callable is also a functional interface like Runnable....
		String str=future.get();
		System.out.println(str);
		es.shutdown();
		
		System.out.println("main Thread is Still Teaching....");
	}
}

class Work1{
	public void eatBreakFast() {
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println("Break.....Fast.....");
	}
}
class Work2{
	public String payBill() {
		
		return " Bill Payed ";
	}
}
class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		try {Thread.sleep(5000);}catch(Exception e) {}
		return new Work2().payBill();
	}	
}