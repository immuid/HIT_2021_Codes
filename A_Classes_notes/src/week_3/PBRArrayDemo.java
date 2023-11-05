package week_3;

public class PBRArrayDemo {
	static int classVariable;
	int instanceVariable;
	int arr[]=new int[5];
	static int clarray[]=new int[5];
	public static void main(String[] args) {
		System.out.println(classVariable);
		PBRArrayDemo pba=new PBRArrayDemo();
		System.out.println(pba.instanceVariable);
		int localVariable = 0;
		System.out.println(localVariable);
		
		for(int i:clarray) {
			System.out.print("\tclass..."+i);
		}
		System.out.println();
		
		for(int i:pba.arr) {
			System.out.print( "\tinstance.."+i );
		}
		System.out.println();
		int Array[]=new int[5];
		for(int i:Array) {
			System.out.print(" \t local..."+i);
		}
		
	}

}
