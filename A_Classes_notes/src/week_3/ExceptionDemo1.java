package week_3;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		
		System.out.println("Before Exception...");
		int num=1;
		try{
			num=Integer.parseInt(args[0]);
		    int i =1/num;
		    System.out.println("The immediate line after Exception");		   
		   }
//		catch(ArithmeticException ae) {				
//				System.out.println("The Exception is "+ae);
//				//num=num+1;
//		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("The Exception is "+aie);
		 	//num=1;
		}
//		catch(Exception e) {
//			System.out.println("Global excepton handling common code" );
//			//num=1;
//		}
		finally {
			System.out.println("Finally called...");
			num=1;
		}
//		catch(NumberFormatException ne) {
//		System.out.println("The Exception is "+ne);
//		num=1;
//	}
		    int i=1/num;
		    System.out.println("The value is ..."+num);
			System.out.println("After Exception...");
			
	}
 
}
           