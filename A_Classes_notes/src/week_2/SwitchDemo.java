package week_2;

public class SwitchDemo {
	public static void main(String[] args) {
		SwitchDemo obj=new SwitchDemo();
		obj.met('f');
		obj.met(10);
		obj.met("Hello");
		
	}
     void met(String s ) {
    	 switch (s) {
    	 case "Hello": 
    		 System.out.println("The string value is Hello");
    		 break;
    	 case "Hello2":
    	 		System.out.println("THe string value is Hello2");
    	 		break;
    	 		
    	 default:
    		 System.out.println("it is a default String value");
    	 			
    	 }
    	 
     }
     
	void met(int i) {
		switch(i) {
		case 10:
			System.out.println("The value is lesser than 10...");
			break;
		case 2:
			System.out.println("The value is two...");
			break;
		case 3:
			System.out.println("The value is three...");
			break;
		default:
			System.out.println("the value is default...");
	    		
	
		}
	}
	void met(char c) {
		switch(c)
		{
		case 'a':
			System.out.println("The value is a...");
			break;
		case 'b':
			System.out.println("The value is b...");
			break;
		case 'c':
			System.out.println("You choosen the right one...");
			break;
			
		default:
			System.out.println("default value");
			break;				
		}
		
	}

}
