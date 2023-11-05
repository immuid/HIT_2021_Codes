package week_3;

public class AssoDemo {	
	public void eatLaddu(Laddu l) {
		l.setSize(5);
		
	}
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		laddu.setSize(10);
		System.out.println("Before eating Laddu size is "+laddu.size);
		
		AssoDemo ass = new  AssoDemo();
		ass.eatLaddu(laddu);
		System.out.println(" After eating the laddu the size is "+laddu.size);
	}
}
class Laddu{
	int size;
	public void setSize(int size) {
		this.size=size;
	}
}
//	void eatLaddu(Laddu laddu) {
//		laddu.setSize(5);
//		
//	}
//	public static void main(String[] args) {
//		Laddu laddu = new Laddu();
//		laddu.setSize(10);
//		System.out.println(" Laddu size before eating is ");
//	}
//	
//}
//class Laddu{
//	int size;
//	void setSize(int s) {
//		size=s;
//	}
//	
//}