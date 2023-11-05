package week_3;

public class PBRArrayDemo2 {
	
	public static void main(String[] args) {
		
		int arr[]=new int[5];
		for(int i:arr) {
			System.out.print("\t"+i);
		}
		System.out.println();
		AcceptArray obj = new AcceptArray();
		System.out.println(" \tAfter Array modification.....");
		obj.modifyArray(arr);
		for(int i:arr) {
			System.out.print("\t"+i);			
	}
		System.out.println();
	}
		
		
		
	}
	class AcceptArray{
		public void modifyArray(int a[]) {
			a[2]=300;
		}
		
			}


