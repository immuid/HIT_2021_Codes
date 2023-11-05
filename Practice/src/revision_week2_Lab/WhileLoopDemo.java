package revision_week2_Lab;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		 
		while(true) {
			int number, sum = 0;        
			Scanner sc = new Scanner(System.in);
		System.out.println("\n Please Enter any integer Value below 10: ");
		number = sc.nextInt(); 
		while (number <= 10)  {
			sum = sum + number; 
			number++;      
			}        
		System.out.format(" Sum of the Numbers From the While  Loop is: %d", sum );
		}
//		int number,sum=0;
//		Scanner sc=new Scanner(System.in);		
//		System.out.println("Enter a number less than 10 :");
//		number=sc.nextInt();
//		while(number <=10) {
//			sum=sum+number;
//			number++;
//		}
//		System.out.println("Sum of the numbers form while loop is :%d "+sum);
//	}

}}
