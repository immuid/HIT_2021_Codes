package demo_practice_area;

public class BreakAndContinue {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		// XOR will return true only if the conditions
		// are mutually exclusive. 
		System.out.println(a == 1 ^ b == 3); // both the conditions are true
		System.out.println(c == 4 ^ d == 3); // both the conditions are false
	
		// XOR will return true only if the condition
		System.out.println(a == 1 ^ b == 2); // both .
		System.out.println(c == 4 ^ d == 3); // both 
	}

}
	
	
//	public static void main(String[] args) {
//		for (int i=1;i<10;i++) {
//			if(i%2==0) {
//				//continue;
//				break;
//			}
//			System.out.println(i);
//		}
//		boolean b=true;
//		a:{
//			System.out.println("a block");
//			b:{
//				System.out.println("b block");
//				c:{
//					if(b) {break a;}
//					System.out.println("c block");
//					d:{
//						System.out.println("d block");
//						
//					}
//				}
//			}
//		}
//	}
//
//}
