package week_4;
/* This pattern is called decoriated pattern 
 * previously we have used Strategy pattern to remove if else if condition
 */

public class AbstractDemo {
	public static void main(String[] args) {
		
		Item icecream=new Venila();
		System.out.println("Only venila icecream "+icecream.cost());
		
		Item icecreammix=new ButterScotch(new Venila(new Nuts(new DryFruits(new ButterScotch()))));
		System.out.println("IceCream with Butterscotch ,venila,nuts,dryfruits,Butterscotch "+icecreammix.cost());
	}

}

abstract class Item{
	public abstract int cost();
	
}
abstract class Cream extends Item{
		
}
abstract class Ingredients extends Item{
		
}
class Venila extends Cream{ // Static Binding - What cannot be changed at run time is called static binding.
	Item item;
	public Venila() {
		
	}
	public Venila(Item item) { // Dynamic Binding- at constructor level 
		this.item=item;		
	}
	
	public int cost() {	
		if(item==null) {
			return 10;
		}else {		
			return 10 +item.cost();
	           }
}
}
class ButterScotch extends Cream{
	Item item;
    public ButterScotch() {
    	
    }
    public ButterScotch(Item item) {
    	this.item=item;
    }
	public int cost() {	
		if(item==null) {
			return 10;
		}else {
			return 10+item.cost();
		}	
	}
		
}
class Nuts extends Ingredients{
	Item item;
	public Nuts() {
		
	}
	public Nuts(Item item) {
		this.item=item;
	}
	public int cost() {		
		if(item==null) {
		return 5;
		}else {
			return 5+item.cost();
		}
	}	
}
class DryFruits extends Ingredients{	
Item item;
public DryFruits() {
	
}
public DryFruits(Item item) {
	this .item=item;
}
	public int cost() {		
		if(item==null) {
		return 5;
		}else {
			return 5+item.cost();
		}
	}
}