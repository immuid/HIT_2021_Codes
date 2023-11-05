package module1;

public class SingletonRevision {
	public static void main(String[] args) {
		//Single1 obj1=new Single1();
		//Single1 obj2=new Single1();
		new Thread(()->{Single1.createSingleObject();}).start();
		new Thread(()->{Single1.createSingleObject();}).start(); 
	}

}
class Single1{
	private Single1() {
		System.out.println("Object of single is created ...");
	}
	private static Single1 single;
	synchronized public static Single1 createSingleObject() {
		if(single==null) {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		single =new Single1();
		}		
		return single;
	}
	
}
