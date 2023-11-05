package week_3;

public class ConsDemo {
	public static void main(String[] args) {
		Shoe sh =new LeatherShoe();
		
	}

}
class Shoe{
	int i;
	public Shoe() {
		System.out.println(" Shoe constructor called ...");
	}
	public Shoe(int i) {
		System.out.println(" Shoe parametric constructor called...");
	}
	public void shoe() {
		System.out.println(" shoe method is called...");
	}
}
class LeatherShoe extends Shoe{
	public LeatherShoe() {
		super(100);
		super.i=100;
		super.shoe();
		
		System.out.println(" Leather Shoe contructor called...");
		
	}
	
}