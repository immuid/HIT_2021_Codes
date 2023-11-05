package lab.work2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {
	
	public static void main(String[] args) {
		 double currentSalary;
		 double raise = 0.0;
		 double newSalary ;
		
	String rating;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the current salary:");
	currentSalary=scan.nextDouble();
	System.out.println("Enter the performance rating(Excellent, Good, or poor): ");
	rating=scan.next();
	if(rating.equalsIgnoreCase("Excellent")) {
		raise= currentSalary * 0.06 ;
		
		}
		else if(rating.equalsIgnoreCase("Good")) {
			raise= currentSalary * 0.04;
			
		}
		else if(rating.equalsIgnoreCase("Poor")) {
			raise= currentSalary * 0.015;
					
			}
	newSalary= currentSalary+ raise;
		
     	NumberFormat money =NumberFormat.getCurrencyInstance();
    			System.out.println();
   			System.out.println("Current Salary: " + money.format(currentSalary));
  			System.out.println("Amount of your raise: "+  money.format(raise));
 			System.out.println("Your new salary: "+ money.format(newSalary));
			System.out.println();
   }

	}
	
	
	
		
		

