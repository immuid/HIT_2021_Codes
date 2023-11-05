package week_3;

import java.util.Scanner;

public class BadFanDemo {
	public static void main(String[] args) {		
		BadFan bf=new BadFan();
		Scanner scan =new Scanner(System.in);
		while(true) {
		System.out.println("Pull 0-Switchon,1-Medium Speed,2-Highspeed...:");
		scan.next();
		bf.pull();
		System.out.println();
		}
	}

}
class BadFan{
	int state; 
	public void pull() {
		if(state==0) {
			System.out.println("Switch On State ...");
			state=1;
		}else if(state==1) {
			System.out.println("Medium state ...");
			state=2;
		}else if(state==2) {
			System.out.println("High speed ...");
			state=3;
		}else if(state==3) {
			System.out.println("Switch Off State ...");
			state=0;
		}
		
	}
}