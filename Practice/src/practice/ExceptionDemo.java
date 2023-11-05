package practice;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch (Exception ae) {
			System.out.println("See boss, what you did I did not like");
		}
	}

}
