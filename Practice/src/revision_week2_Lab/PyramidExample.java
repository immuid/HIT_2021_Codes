package revision_week2_Lab;

import java.util.Scanner;

public class PyramidExample {
	public static void main(String[] args) {
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		int r=6;
		for(int i=0;i<r;i++) {
			for(int j=r;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		Scanner input=new Scanner(System.in);
		int rows,j,number=1,counter;
		System.out.println("Enter the number of rows of floyd's triangle :");
		rows=input.nextInt();
		System.out.println("\n Floyd's Triangle");
		System.out.println("********************");
		
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
}
}

//int rows, number = 1, counter, j; //To get the user's input    
//Scanner input = new Scanner(System.in);       
//System.out.println("Enter the number of rows for floyd's triangle:"); //Copying user input into an integer variable named rows
//rows = input.nextInt();           
//System.out.println("Floyd's triangle"); 
//System.out.println("****************");
//for ( counter = 1 ; counter <= rows ; counter++ )          
//{ for ( j = 1 ; j <= counter ; j++ ) {         
//	System.out.print(number+" "); //Incrementing the number value
//	number++;           
//	} //For new line             
//	System.out.println();           
//     }  
//} 
	

//	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("* ");
//			}		
//			System.out.println();
//	}
//
//}
//}
