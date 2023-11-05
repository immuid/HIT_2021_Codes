package revision_week2_Lab;

import java.util.Scanner;

public class AreaOfRectangle { // Area of a rectangle Formula is (area= length*width)
	public static void main(String[] args) {
		 System.out.println("Area Of Rectangle\n");
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the Length of the Rectangle : ");
		 double length=scan.nextDouble();
		 System.out.println("Enter the width of the Rectangle : ");
		 double width=scan.nextDouble();
		 double area = length*width;
		 System.out.println("The Area of the Rectangle is : "+area);
	}

}
