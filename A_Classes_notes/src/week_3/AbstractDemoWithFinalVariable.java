package week_3;
/* Condition 1- we cannot create an object of parent class so it should be declared as abstract. 
 * Condition 2- abstract classes can have abstract and non abstract methods
 * Condition 3- abstract method inside parent abstract class should be compulsorily overriden by the child classes.
 * Condition 4- non abstract method inside the abstract class should not be overriden by the child classes so it shlod be delcared final.
 * Condition 5- an abstract class can extend another abstract class.
 * Condition 6- when a abstract class extends another abstract class the child class,
 *              need not want to override the parent abstract class abstract method.
 * Condition 7- The abstract Grand Parent class abstract method should be overridden by the grand child               
 */
public class AbstractDemoWithFinalVariable {
	public static void main(String[] args) {
		
		//new parent();This will throw me an error 
		new Child();
		new Child().mySayHello();
	}
}
abstract class GrandParent{
	abstract public void met();	
	}

abstract class Parent extends GrandParent{
	//Condition 2- Can we have a constructor - Yes you can have a constructor
	public Parent() {
		final int i=10;// Final declared variable is a constant.Its value can not be changed.
		System.out.println(" Abstract class parent called...");
	}
	/* 
	 * Final variable values cannot be changed 
	 * Final classes cannot be inherited 
	 * Final method cannot be overridden
	 * non abstract methods should compulsorily declared final.and should not be overriden,
	 */
	public abstract void yoursSayHello();
	
	final public void mySayHello() {    // This method is declared Final so it should not be overridden
		System.out.println(" Saying Hello as per the abstract class norms..");
	}
}
//When you create object of child class, the parent abstract class constructor gets called ...
class Child extends Parent{
	public void met(){}
	public Child() {
		System.out.println(" child class of abstract parent object created.. ");
	}
	@Override
	public void yoursSayHello() {
		// TODO Auto-generated method stub
		System.out.println(" Say hello as per the child class logic..or norm...");
	}
}