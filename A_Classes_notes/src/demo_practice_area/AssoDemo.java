package demo_practice_area;

public class AssoDemo {
	public void eatLaddu(Laddu laddu) {
		System.out.println(" Laddu is eaten now half..");
		laddu.setSize(5);
		
	}
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		laddu.setSize(10);
		System.out.println(" Before eating the Laddu the size is "+ laddu.size);
		
		AssoDemo ass=new AssoDemo();
		ass.eatLaddu(laddu);
		System.out.println(" After eating the Laddu the size is "+ laddu.size);
	}

}
class Laddu{
	int size;
	public void setSize(int size) {
		this.size=size;
	}
}