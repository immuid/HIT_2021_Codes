package exceptionhandlings_;
/*A
 * best way to handle problems is dont invite trouble 
 * always try to avoid raising exceptions
 * 
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
  		//int i=1/0;
		// my code to handle exception when we use  zero to divide one
		
		if(args[0]==null) {
			
			System.out.println("Enter argument value....");		
		}
		else {
			String st=args[0];
			if(st.equalsIgnoreCase(st)) {
			int n=Integer.parseInt(args[0]);
			if(n==0) {
				System.out.println("Enter non zero value...");
			}
			else {
				int x= 1/n;
				System.out.println(x);
			}
		}
		//int i=1/Integer.parseInt(args[0]); 
		System.out.println("After Exception....");

	}
	}
}





/*
if(args[0]!=null) {
	String value=args[0];
	char c=value.charAt(0);
	if(Character.isDigit(c)) {
		int n=c;
		if(n!=0) {
			int x=1/n;
			System.out.println(x);
		}
		else {
			System.out.println("Please enter a non zero value..");
		}
	}
else {
	System.out.println("please enter an argument value..");			

}
	System.out.println("After Exception....");
}
}
}
		*/