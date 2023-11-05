package revision_week2_Lab;

public class SwapingTwoNumbers {
	public static void main(String[] args) {
		int first=150 ,second=200;
		System.out.println(" First number before swapping :"+first +"\n Second number before swapping :" +second);
		 first = second-first; //150-200 = -50
		 second = second-first; //200-50 = 150
		 first = second+first; // 150-(-)50
		 System.out.println(" First number after swapping :"+first +"\n Second number after swapping :" +second);
	}

}
