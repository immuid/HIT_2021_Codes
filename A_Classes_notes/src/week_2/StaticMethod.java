package week_2;

public class StaticMethod {
	public static void main(String[] args) {
		St.met();
		
		
	}
}

class St{
	static int i=10;
	static float f=5.1f;
	static double d=2265372.13221;
	static long l=15648461l;
	 short s= 2324;
	byte b=-128;
	
	public static void met() {
		System.out.println(i+" "+d +" "+f);
		St s =new St();
		System.out.println(s.s);
		
		s.met1();
		meeet();
	}
	
	static void meeet() {
		
	}
	void met1() {
		System.out.println(s);
	}
}
		