package week_4;

public class TestVarArgs {
	public static void main(String[] args) {
		TestVarArgs obj=new TestVarArgs();
		obj.met("hai","Hello","dai");
		obj.met2(new String[] {"hai","Hello"});
		
	}
	void met(String...s) {
		System.out.println(s);
	}
	void met2(String a[]) {
		System.out.println(a);
	}

}
