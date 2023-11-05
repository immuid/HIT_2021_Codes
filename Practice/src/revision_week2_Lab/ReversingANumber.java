package revision_week2_Lab;

import java.util.Scanner;

public class ReversingANumber {
	public static void main(String[] args) {
		int num,reversenum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a number : ");
		num=sc.nextInt();
		while(num!=0) {
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
			}
		System.out.println(" Reverse of input number : "+reversenum);
	}
}
