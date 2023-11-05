package multi_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import multi_Threading.RestRoom.ManagerRoom;
//Object Lock
//for static variables only one instace is created..
public class ThreadDemo7 {
	public static void main(String[] args) {
		ExecutorService es= Executors.newFixedThreadPool(2);
		Building lic=new Building();
		Building lic2=new Building();
		es.execute(()->{
			Thread.currentThread().setName("MAMA");
			synchronized (lic) { //Object LOCK			
				lic.rr.usetoilet();
	//			lic.mr.useManagerRoom();
			}			 
		});
		es.execute(()->{
			Thread.currentThread().setName("SAMA");
			synchronized (lic2) {
				lic2.rr.usetoilet();
	//			lic2.mr.useManagerRoom();
			}			
		});
		es.shutdown();
	}
	
}
class Building{
	RestRoom rr=new RestRoom();
	//ManagerRoom mr=new ManagerRoom()
	
}
class RestRoom{
	public void usetoilet() {
	Thread t=Thread.currentThread();
	String name=t.getName();
	System.out.println(name+" is inside the Toilet...");
		try {Thread.sleep(5000);}catch(Exception e) {}
	System.out.println(name+" left the toilet....");
}
class ManagerRoom{
	public void useManagerRoom(){
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the manager room...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" left the manager room...");
			
		}
	}
}