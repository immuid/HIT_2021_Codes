package Feb_month;

public class ArraysDemo2 {
	public static void main(String[] args) {
		int twod[][]={ {10,20,30,40,50},
					   {100,110,120,130,140},
					   {200,210,220,230,240}
					  };
		System.out.println(twod.length);//displays the no of rows...
		
		System.out.println(twod[0].length);//this will display the no of columns....
		
		System.out.println(twod[0][0]+" "+twod[0][1]+" "+ twod[0][2]+" "+ twod[0][3]+" "+ twod[0][4]);
		
		System.out.println("Before ..."+twod[0][1]);
		System.out.println("Before ..."+twod[2][0]);
		twod[0][1]=9999;
		twod[2][0]=8888;
		
		System.out.println("After..."+twod[0][1]);
		System.out.println("After..."+twod[2][0]);
	}
}
