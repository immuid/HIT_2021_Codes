package week_2;

public class School {
	int i=10;
	void admission() {
	System.out.println("Admission Done");
		}
	int feesPayment(int cash) {
		System.out.println("Collects the fees amount");
		System.out.println("He returns the change");
		
		if(cash>500) {
			return cash-200;
			}
		else if(cash==500) {
			return cash-150;
			}
		else {
			return cash-100;
		}
	}
	int donation() {
		return 100;
	}
	public static void main(String[] args) {
		School loyola= new School();
		int cash=loyola.feesPayment(1000);
		System.out.println("The Change is returned :"+cash);
		
		Human imran = new Human();
		imran.smile();
		
		Doctor aysha=new Doctor();
		aysha.treatment();
		
	}

}

class Human{
	public void smile() {
		System.out.println("smilling is a nobal act");
	}
}

class Doctor{
	int treatment() {
		System.out.println("Treatment will be given");
		return 1;
	}
}

