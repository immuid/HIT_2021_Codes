package revision_week2_Lab;

import java.util.Scanner;

public class AreaOfSquare {// Area of a square formula is : (side *side)
	public static void main(String[] args) {
		double side , area ;
		System.out.println(" Area Of Square ");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the side of Square : ");
		side=sc.nextDouble();
		area= side*side;
		System.out.println("Area of Square is : "+area);
	}

}
