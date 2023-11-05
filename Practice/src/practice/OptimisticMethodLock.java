package practice;

public class OptimisticMethodLock {
	public static void main(String[] args) {
		CouncillingHall anna=new CouncillingHall();
		
		new Thread(()->{anna.table1();},"somu").start();
		new Thread(()->{anna.table1();anna.table2();},"ramu").start();
		new Thread(()->{anna.water();},"basha").start();
		
	}

}
class CouncillingHall{
	synchronized public void table1() {
          System.out.println(" In Table 1....."+Thread.currentThread().getName());
          try {Thread.sleep(10000);}catch(Exception e) {}
          System.out.println("Finished the work in Table 1..."+Thread.currentThread().getName());
		
	}
	public void table2() {
		System.out.println(" In Tablee 2 ...."+Thread.currentThread().getName());
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println(" Finished the work in Table 2");		
	}
	public void water() {
		System.out.println("Drinking water..."+Thread.currentThread().getName());
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("Finished Drinking water ..."+Thread.currentThread().getName());
	}
}