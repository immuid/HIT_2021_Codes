package revision_week2_Lab;

public class LargestAmoungThree {
	public static void main(String[] args) {
		double n1=-5.5 , n2=5.5, n3=3.5;
		System.out.println("The below number is the Largest Number amoung the three given number \n ");
		
		if(n1>n2 && n1>n3)
			System.out.println(n1+" is the Largest Number ");
		else if(n2>n1 && n2>n3)
			System.out.println(n2+" is the Largest Number ");
		else
			System.out.println(n3+" is the Largest Number ");
	}

}
