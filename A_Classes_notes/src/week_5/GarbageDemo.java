package week_5;

public class GarbageDemo {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Free memory...."+r.freeMemory());
		GrandFather daddu=new GrandFather();
		System.out.println("After daddu is born Free memory is..."+r.freeMemory());
		
		String s= "Hello";
		String temp=s;
		String s2=s+"world";
		System.out.println(temp);
		
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sbtemp= sb;
		sb.append("world");
		System.out.println(sbtemp);
		
	}

}
class GrandFather{
	StringBuilder age=new StringBuilder();
	public GrandFather() {
		for(int i=0;i<100000;i++) {
			age.append("aaaa"+i);
		}
	}
}