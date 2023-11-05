package week_3;

import java.util.Scanner;

public class PaintBrush {
	public static void main(String[] args) {
		while(true) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the choise 1-RED,2-GREEN,3-BLUE,4-PINK :");
		Brush brush=new Brush();
		int choise=scan.nextInt();
		brush.dopaint(choise);
		}
		
	}

}
class Brush{
	
	public void dopaint(int choise) {
		if(choise==1) {
			System.out.println("RED paint");
		}else if(choise==2) {
			System.out.println("GREEN paint");
		}else if(choise==3) {
			System.out.println("BLUE paint");
		}else if(choise==4) {
			System.out.println("PINK paint");
		}else
			System.out.println("Please Enter correct choise 1,2,3 :");
		System.out.println();
	}
	
}