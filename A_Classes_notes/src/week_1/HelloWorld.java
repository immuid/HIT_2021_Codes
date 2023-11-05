package week_1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to JAVA.....");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter your Name:");
		String name=scan.next();
		System.out.println("Welcome To...JAVA Learning "+name);
	}

}
