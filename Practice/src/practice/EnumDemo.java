package practice;

public class EnumDemo {
	public static void main(String[] args) {
		System.out.println("Interface..."+MyConstants.pi);
		System.out.println("Enum..."+MyConstantEnum2.pi.getValue());
		
		met(MyConstants.tan30);		//interface
		met(MyConstantEnum2.tan30.getValue());//Enum
		
		switch ((int)MyConstants.tan30) {//interface
		case 1: {
				System.out.println("It is tan 30 its value is constant : "+MyConstants.tan30);
				break;
				}
			}
		
		switch ((int)MyConstantEnum2.tan30.getValue()) {//Enum
		case 1: {
				System.out.println("It is tan 30 its value is constant : "+MyConstants.tan30);
				break;
				}
			}
		
		//another Enum
		MyConstantsEnum v=MyConstantsEnum.orange;		
		 enumMet(v);
		 
		 for(MyConstantsEnum me:MyConstantsEnum.values()) {
			 System.out.println(me+" and its price is "+me.getPrice());
		 }
		}
	
		public static void enumMet(MyConstantsEnum mce) {
			switch (mce) {
			case apple: {
				System.out.println("The enum is apple");
				System.out.println("the price of apple is "+mce.getPrice());
				break;
			}
			case orange: {
				System.out.println("The enum is orange");
				System.out.println("the price of orange is "+mce.getPrice());
				break;
			}
			case mango: {
				System.out.println("The enum is mango");
				System.out.println("the price of mango is "+mce.getPrice());
				break;
			}		
			}
		}
		public static void met(float tanvalue) {
			System.out.println(tanvalue);
		}
		
	}

interface MyConstants{
 public final static float pi=3.14f;
 public final static String e="mc_square";
 public final static float tan30=1.2f;
 
}
enum MyConstantsEnum{
	apple(20),mango(30),orange(40);
	int price;
	private MyConstantsEnum(int price) {
		this.price=price;
	}
	public int getPrice() {
		
		return this.price;
	}
}
enum MyConstantEnum2{
	pi(3.14f),tan30(1.2f);
	float vlaue;
	private MyConstantEnum2(float value) {
		this.vlaue=value;		
	}
	public float getValue() {
		
		return this.vlaue;
	}
}
