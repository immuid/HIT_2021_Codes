package revision_week2_Lab;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {		
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter a array value : ");
		int arr[] =new int[10];
		int sum=0;		
		
		for(int i=0;i<arr.length ;i++) {
			arr[i]=scan.nextInt();
		}
		for(int num:arr) {
			sum=sum+num;
		}
		System.out.println(" Sum of array elements is : "+sum);
	}
}
			
		
	
	


