package lab.work1;

public class SwapTwoNumbers{
	public static void main(String[] args) {
		int first=120 , second=220;
		System.out.println("--Before swap--");
		System.out.println("First number ="+ first);
		System.out.println("Second number ="+ second);
		
		int temproary = first;
		first = second;
		second = temproary;
		
		System.out.println("--After swap--");
		System.out.println("First number ="+ first);
		System.out.println("Second number ="+ second);
	}
}