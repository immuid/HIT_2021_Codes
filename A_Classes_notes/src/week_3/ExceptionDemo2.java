package week_3;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Before Exception..");
		try {
			int i=1/1;	
			System.out.println("swgvx k");
		}
		catch(Exception e){
			System.out.println(""+e);
		}
		finally{
			System.out.println("The finally block is called...");
		}
		
		System.out.println("After Exception...");
	}

}
