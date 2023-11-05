package Basics;

public class ArrayDemos {
	public static void main(String[] args) {
		//Single dimentional array
		int ar[]= {3,5,7,11};
		
		for(int i=0;i<ar.length;i++) {
			System.out.print("   "+ar[i]);
		}
		System.out.println();
		
		int arr[]=new int[5];
		
		arr[2]=800;
		
		for(int i:arr) {
			System.out.print("   "+i);
		}
		System.out.println();
		
		//two dimentional array
		int ar2d[][]= {
				{10,20,30,40},
				{11,22,33,44},
		};
		
		for(int i=0;i<ar2d.length;i++) {
			for(int j=0;j<ar2d[i].length;j++) {
				System.out.print("  "+ar2d[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int arr2d[][]=new int[2][4];
		
		arr2d[1][2]=12;
		for(int i[]:arr2d) {
			for(int j:i) {
				System.out.print("  "+j);
			}
			System.out.println();
		}
		System.out.println();
		
		//uneven array
		
		int unar[][]= {
				{2,3,4,5},
				{1,3},
				{6,7,8,9,0},
		};
		for(int i[]:unar) {
			for(int j:i) {
				System.out.print("  "+j);
			}
			System.out.println();
		}
		System.out.println();
		
		int unevarr[][]=new int[3][];
		unevarr[0]=new int[3];
		unevarr[1]=new int[2];
		unevarr[2]=new int[5];
		
		for(int i[]:unevarr) {
			for(int j:i) {
				System.out.print("  "+j);
			}
			System.out.println();
		}
	}

}
