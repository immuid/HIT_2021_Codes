package week_4;

public class TemplateMethodDesignPattern {
	/*
	 * This method is called Template method Design pattern
	 * previously we used strategy pattern to remove if else if conditions 
	 */
	public static void main(String[] args) {
		Sangeetha SangeethaRestarunt=new ImranSangeethaRestarunt();
		SangeethaRestarunt.process();
	}

}
abstract class Sangeetha{
	public final void uniform() {
		System.out.println("Uniform defined by sangeetha...");		
	}
	public final void serve() {
		System.out.println("Sangetha defines how to serve...");
	}
	
	public abstract void makeIdly();
	
	public final void createIdlyPlate() {
		System.out.println("Sangeetha defines how to create Idly Plate...");
	}
	public final void charge() {
		System.out.println("Sangeetha defines how much to charge...");
	}
	public final void process() { //Template Method 
		uniform();
		makeIdly();
		createIdlyPlate();
		serve();
		charge();
	}
}
class ImranSangeethaRestarunt extends Sangeetha{
	@Override
	public void makeIdly() {
		System.out.println("My Sevant makes the idly in my hotel...");
		
	}
	
}
