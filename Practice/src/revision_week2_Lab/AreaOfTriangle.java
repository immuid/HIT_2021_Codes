package revision_week2_Lab;

import java.util.Scanner;

public class AreaOfTriangle {// Area of Triangle formula is (width*height)/2 ;
	public static void main(String[] args) {
		double width ,height,area;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Area of Triangle \n ");
		System.out.println(" Enter the Height of the Triangle : ");
		height =sc.nextDouble();
		System.out.println(" Enter the Width of the Triangle : ");
		width=sc.nextDouble();
		area=(width*height)/2;
		System.out.println("The Area of Triangle is : "+area);
	}

}
