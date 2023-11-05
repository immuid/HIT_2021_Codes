package inheritance;

public class InheritanceDemo3 {
	public static void main(String[] args) {
		Dominos ido= new immu_Dominos();
		ido.sellPizza();
		
	}

}
abstract class Dominos{
	private void makeDough() {
		System.out.println("dough made as per the dominos standard...");
	}
	private void addIngrediants() {
		System.out.println("Ingrediants are added as per the dominos standards...");
	}
	private void BakePizza() {
		System.out.println("Pizza is Baked as per the dominos standards...");
	}
	private void makePizza() {
		makeDough();
		addIngrediants();
		BakePizza();
	}
	abstract public void acceptMoney();
	abstract public void deliverPizza();
	final public void sellPizza() {
		acceptMoney();
		makePizza();		
		deliverPizza();
	}

}

class immu_Dominos extends Dominos{
	@Override
	public void acceptMoney() {
		System.out.println(" Accept Money in rupees...");
	}
	@Override
	public void deliverPizza() {
		System.out.println("Deliver pizza in electric scooter...");
		
	}
}
