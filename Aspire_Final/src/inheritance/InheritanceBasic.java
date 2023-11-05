package inheritance;

public class InheritanceBasic {
	public static void main(String[] args) {
		  
		Shoe bata = new SchoolShoe();
		bata.met();
		bata.met1();
		}

	}
	abstract class Shoe{
		 int amt = 1000;
		 public Shoe() {
		 System.out.println(" cons of Shoe called.......");
		 }
		 public void met() {
			 System.out.println("met........");
		 }
		 public int met1() {
			 return 100;
		 }
	 }
	 
	 class SchoolShoe extends Shoe{}
	 
	 class SportsShoe extends Shoe{}
	 