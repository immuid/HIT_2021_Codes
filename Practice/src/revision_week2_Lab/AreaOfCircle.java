package revision_week2_Lab;

import java.util.Scanner;

public class AreaOfCircle {// Area of Circle = p*(r*r) // circumference of a circle = p*d;
	public static void main(String[] args) {
		double r,pi,area,circumference;
		pi=Math.PI;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Area of a Circle : ");
		System.out.println(" Enter the Radius of the Circle : ");
		r=sc.nextDouble();
		area=pi*(r*r);
		System.out.println(" Area of Circle is : "+area);
		
		circumference = pi*(2*r);
		System.out.println(" \n Circumference of the circle is : "+circumference);
	}

}
