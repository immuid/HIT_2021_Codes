package interface_;

public class InterfaceDemo1 {
	public static void main(String[] args) {
		Human hu=new Human();
		hu.doattack();
	}

}
abstract class Animal{
final public void doattack() {
	System.out.println("Attack with bombs....");
}
	
}
class Monkey extends Animal{
	
}
class Human extends Monkey{

}