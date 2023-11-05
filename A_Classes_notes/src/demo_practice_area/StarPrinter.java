package demo_practice_area;

public class StarPrinter {
	public static void main(String[] args) {
		
		int r=9;
		for(int i=0;i<r;++i) {
			for(int j=1;j<i;j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}
	}

}
