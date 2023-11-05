package week_3;

import java.util.Scanner;

public class GoodFan {
	public static void main(String[] args) {		
		Scanner scan=new Scanner(System.in);
		GoodFan1 orient=new GoodFan1();
		while(true) {
		System.out.println("Press a key and enter to pull the chain...");
		scan.next();
			orient.pull();
	}
	}
}
class GoodFan1{
	State state =new SwitchOffState();
	public void pull() {
		state.pull(this);
	}	
	}

 abstract class State{
	public abstract void pull(GoodFan1 fan); //{}
}
class SwitchOffState extends State{
	@Override
	public void pull(GoodFan1 fan) {
			System.out.println("Switch on State.....");
			fan.state=new SwitchOnState();
	}
	
}
class SwitchOnState extends State{
	@Override
	public void pull(GoodFan1 fan) {
		System.out.println("Medium speed State.....");
		fan.state=new MediumSpeedState();
		
	}
}
class MediumSpeedState extends State{
	@Override
	public void pull(GoodFan1 fan) {
		System.out.println("HighSpeed State.....");
		fan.state=new HighSpeedState();
		
	}
	
	
}
class HighSpeedState extends State{
	@Override
	public void pull(GoodFan1 fan) {
		System.out.println("SwitchOff State.....");
		fan.state=new SwitchOffState();
	}
	
}