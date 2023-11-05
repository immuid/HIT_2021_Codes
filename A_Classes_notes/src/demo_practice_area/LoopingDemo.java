package demo_practice_area;

import java.util.Scanner;

public class LoopingDemo {
	public static void main(String[] args) {
		boolean b=false;
		while(b) {
			System.out.println(" While loop called... ");
		}
		do {
			System.out.println(" do while loop called..");
		}while(b);
		Scanner scan =new Scanner(System.in);
		int x=scan.nextInt();
		System.out.println("Please enter a value..less than 10.:");
		while(x<10) {
			System.out.println("x value is .."+x);
			x++;
		}
		System.out.println("++++++++++++++++++++++++");
		do {
			System.out.println("x value is..."+x);
			x--;
		}while(x>0);
		
		for(int i=0;i<10;++i) {
			System.out.println("for loop called..."+i);
		}
		for(int i=0,j=10;i<10 && j>0;i++,j--) {
			System.out.println(i+":"+j);
		}
		for(int i=0;i<5;i++) {//runs 5 times
			for(int j=0;j<5;j++) {//each time the outloop runs, this inner loop runs 5 times
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
