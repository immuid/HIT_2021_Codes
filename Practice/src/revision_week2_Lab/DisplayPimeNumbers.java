package revision_week2_Lab;

public class DisplayPimeNumbers {
	public static void main(String[] args) {
		int i=0,num=0;
		String primeNumbers =" ";
		for(i=1;i<=100;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					counter= counter+1;
				}
			}
				if(counter==2) {
					primeNumbers=primeNumbers+i+" ";
				}		
			}	
		System.out.println(" PrimeNumber from 1 to 100 are : ");
		System.out.println(primeNumbers);
		}
	}

		
	


