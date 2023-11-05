package exceptionhandlings_;
/*
 * 
 * 
 */

public class ExceptionDemo6 {
	public static void main(String[] args) {
		System.out.println("Before Exception...");
		try {
			int i=1/Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			System.out.println("Please supply command line arguments...");
		}
		catch(ArithmeticException a) {
			System.out.println(a);
			System.out.println("Please enter a non zero value...");
		}
		finally {
			System.out.println("finally block is always executed whether exception raised or not , wheather an exception is handled or not na finally block executed...");
		}
		System.out.println("After Exception...");
	}
}
	