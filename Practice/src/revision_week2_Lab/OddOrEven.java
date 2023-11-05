package revision_week2_Lab;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int num;
		Scanner value=new Scanner(System.in);
		System.out.println("Enter a value and find odd or even :\n");
		System.out.println("Enter a Value : ");
		num=value.nextInt();
		
		if(num%2==0) {
			System.out.println("Even Number");
		}else
			System.out.println("Odd Number");
		
	}

}
