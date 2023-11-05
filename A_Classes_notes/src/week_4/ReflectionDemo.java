package week_4;

import java.util.Scanner;

public class ReflectionDemo {
	public static void main(String[] args) throws Exception{
	
		// 1.Static Binding way for creating object..
		Paint StaticPaint = new RedPaint();
		System.out.println("Paint Object created using static binding : "+StaticPaint);
		
		// 2.Dynamic Binding way for creating object
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please Enter The Qualified class name : ");// Qualified class name means class name along with its package name.
		String PaintClass=scan.next();
		
		//Where ever the return type of a method is  object ,You need to do typecasting
		Paint DynamicPaint=(Paint)Class.forName(PaintClass).newInstance();
		System.out.println("Paint Object created using Dynamic binding : "+DynamicPaint);
		
		// 3.New Dynamic Binding way for creating  after jdk 9.
	    DynamicPaint=(Paint)Class.forName(PaintClass).getConstructor().newInstance();
		System.out.println("Paint Object created using Dynamic binding : "+DynamicPaint);
	}

}
abstract class Paint{
	
}
class RedPaint extends Paint{
	public RedPaint() {
		
	}
}
class BluePaint extends Paint{
	public BluePaint() {
		
	}
}
