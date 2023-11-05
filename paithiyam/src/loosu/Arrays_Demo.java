package loosu;

public class Arrays_Demo {
	public static void main(String[] args) {
		int arr[];
		int []ar;
		int arrs[]= {0,1,2,3,4,5};
	//	System.out.println(arrs[0]);
		
		arr=new int[5];
		arr[0]=20;
		arr[1]=40;
		arr[2]=50;
		arr[3]=60;
		arr[4]=98;
//		System.out.println(arr[4]);
//		System.out.println(arrs.length);
		System.out.println(arr.length);
		
		System.out.println(arr[arr.length-1]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("  "+ arr[i]);
		}
	}

}
