package exceptionhandlings_;
/*
 * Use try catch to handle exceptions which we dont know already 
 * 
 * Throws Exception:
 * use throws exception for situations for which we dont know how the exception is going to raise
 * for example how a dog reacts when they see a person in a street
 * dog may bark at the person,
 * dog ignores the person,
 * dog bites the person,
 * dog starts to play with the person.
 * the person cant guess how the dog will react.
 * 
 * try catch block : 
 * it is added when a code is capable of throwing an exception
 * so that the code is saved from termination
 */
public class ExceptionDemo2 {
	public static void main(String[] args)throws Exception {
		Dog mani =new Dog();
		System.out.println("Before Exception....");
		
		try {
		mani.play("Biscuit");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("After Exception....");
	}
}
class Dog{
	public void play(String item) throws Exception{
		if(item.equals("stick")) 
			throw new Exception();			
		else if(item.equals("stone"))
			throw new Exception();
		else if(item.equals("Biscuit"))
			System.out.println("Dog is Happy......");
	}
}