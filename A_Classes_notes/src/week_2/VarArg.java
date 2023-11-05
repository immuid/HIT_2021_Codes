package week_2;

public class VarArg {
	int sayHello() {
		System.out.println(" no parameter called...");
		return 1;
	}
	void sayHello(int i,String s) {
		System.out.println(" Two parameter called...");
	}
	void VariableArgumentMethod(int i, int j, int k) {
		System.out.println("Three parameter is called ...");
	}
	void VariableArgumentMethod(int...i) {
		System.out.println("Var Arg method is called...");
		for(int s:i) {
			System.out.print(s+" ");
		}
	}
	void variable(String... s) {		
		System.out.println("VarArgs String s called...");
		for(String str:s) {
			System.out.print(str+" ");
		}
	}
public static void main(String[] args) {
	VarArg hello=new VarArg();
	hello.sayHello();
	hello.sayHello(1,"hello");
	hello.VariableArgumentMethod(1,2,3);
	hello.VariableArgumentMethod(1,3,4,6,8,3,6,83);
	hello.variable("aaa","bbb","ccc","ddd");
}

}
