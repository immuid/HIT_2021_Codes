package week_2;

import java.util.Scanner;

public class TernaryDemo {
	public static void main(String[] args) {
		int i;
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number : ");
		i=scan.nextInt();
	String result =(i>20)?("condition is true"):("condition is false");
	System.out.println("The result is "+result);
	String find = (i%2==0)?("The value is even number"):("The value is odd number");
	
	System.out.println(find);
	System.out.println();
		}
		
}

}
