package module2.week1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSavingDemo {
	public static void main(String[] args) throws Exception{
		Laddu myladdu =new Laddu(10);
		myladdu.setSize(5);
		myladdu.name="some value...";
		//To save this object and retrieve it when i want
		// To achieve this ,you can serialize the myladdu object into a file
		ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("laddu.dat"));
		out.writeObject(myladdu);
		System.out.println(myladdu.getSize());
		
		myladdu.setSize(0);
		System.out.println(myladdu.getSize());
		System.out.println("The name Before serialization...:"+myladdu.name);
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("laddu.dat"));
		myladdu=(Laddu)in.readObject();//Laddu myladdu2=(Laddu)in.readObject(); this is for deep copy by using it we can create another object ...
		
		System.out.println(myladdu.getSize());
		System.out.println("The name after serialization...:"+myladdu.name);
	
		//How can you create a deep copy of an object
		//The answer is through serialization

	}

}
class Laddu implements Serializable{
	int size;
	transient String name; // this keyword won't save the values...
	public Laddu(int size) {
		this.size=size;
	}
	public int getSize() {
		return this.size;
	}
	public void setSize (int size) {
		this.size=size;
	}
}
