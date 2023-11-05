package week_1;

import java.util.Scanner;

public class FourthDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value lesser than 10...:");
		int x=scan.nextInt();
		if(x>10) {
			System.out.println("You Entered "+x);
			System.out.println("Please enter a value lesser than 10...");
		}
		else {
			System.out.println("Congradulations..... you have entered the right value");
   	    }
	}
}
