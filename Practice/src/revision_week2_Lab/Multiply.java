package revision_week2_Lab;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Multiplication window:");
		System.out.println("\n Enter the i value :");
		int i= scan.nextInt();
		System.out.println("Enter the j value :");
		int j=scan.nextInt();
		int mult=i*j;
		System.out.println("The Multiple of "+i+" * "+j+" is : "+mult );
	}

}
