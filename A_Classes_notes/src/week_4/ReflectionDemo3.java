package week_4;

public class ReflectionDemo3 {
	public static void main(String[] args) throws Exception {
	//	Students s=(Students)Class.forName("week_4.javaStudents").getConstructor().newInstance();
		// constructors with modifiers cant be accessed by above method we have to use getdeclaredconstructor to access it
		Students s=(Students)Class.forName("week_4.JavaStudents").getDeclaredConstructor().newInstance();
		System.out.println(s);
		Students ss=(Students)Class.forName("week_4.JavaStudents").getDeclaredConstructor(String.class).newInstance("Imran");
		System.out.println(ss);
	}

}
abstract class Students{
	
}
class JavaStudents extends Students{
	String name;
	protected JavaStudents() {
		// TODO Auto-generated constructor stub
	}
	JavaStudents(String a){
		System.out.println(a);
//		this.name=name;
	}
//	@Override
//	public String toString() {
//		
//		return "The name is : "+this.name;
//	}
}
