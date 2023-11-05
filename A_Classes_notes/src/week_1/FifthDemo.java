package week_1;

import java.util.Scanner;

public class FifthDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		while(true) {
//		System.out.println("Please Enter the value...:");
//		int x=scan.nextInt();
//		System.out.println("You have entered...:"+x+"\n" );
//		
//	}
	int i=0;
		while(i<=4) {
			System.out.println("\nEnter Your Name : ");
			String Name=scan.next();
			System.out.println("Enter Your Age : ");
			int age=scan.nextInt();
			System.out.println("Hi "+Name+ " Check Your Age : "+age);
		i++;
		}
		
		scan.close();
	}
}
