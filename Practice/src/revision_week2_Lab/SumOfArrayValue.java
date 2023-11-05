package revision_week2_Lab;

public class SumOfArrayValue {
	public static void main(String[] args) {
		
		int sum=0;
		int []array= {10,20,30,40,50,10};
				
		for(int num:array) {
			sum=sum+num;
		}
		System.out.println(" The sum of array elements is : "+sum);
	}

}
