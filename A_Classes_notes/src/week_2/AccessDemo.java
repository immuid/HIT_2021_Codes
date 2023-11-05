package week_2;

public class AccessDemo {
	public int pub;     //public is global scope
	protected int pro; //protected is relationship (inheritance) scope
	int nomod;        //nomod is package scope
	private int pri; //private is class scope
	
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pri);
	}
	}
class AccessDemoSubClass extends AccessDemo{
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
	//	System.out.println(pri);
}
}
class AccessDemoNonSubClass{
	AccessDemo obj= new AccessDemo();
	void met() {
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
	//	System.out.println(obj.pri);
	}
}