package practice;

public class ExceptionDog {
	public static void main(String[] args) {
		Dog Tiger=new Dog();
		Child Baby =new Child();
		
		Baby.playWithDog("stone", Tiger);
	
		
	}

}
abstract class DogExceptions extends Exception{
	public abstract void visit();
}
class DogBiteException extends DogExceptions{
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new Handler().handle(this);
		
	}
}
class DogBarkException extends DogExceptions{
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		new Handler().handle(this);
	}
	
}
class Dog{
	public void play(String item)throws DogExceptions {
		if(item.equals("stick")) {
			throw new DogBiteException();
		}
		else if(item.equals("stone")) {
			throw new DogBarkException();
		}
		
	}
}
class Child{
	public void playWithDog(String item,Dog dog) {
		try {
			dog.play(item);
		}catch(DogExceptions e) {
			e.visit();
		}
		
	}
}
class Handler{
	public void handle(DogBiteException de) {
		System.out.println("Dog is biten take him to the hospital...");
	}
	public void handle(DogBarkException db) {
		System.out.println("Don't panic just stay calm...");
	}
}
