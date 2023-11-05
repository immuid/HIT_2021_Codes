package week_4;


public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception {
		
		Politician p=new AbcPolitician("somu","Father Ramu");
		
		System.out.println(p);
		
		p=(Politician)Class.forName("week_4.AbcPolitician").getConstructor(new Class[] {String.class,String.class}).newInstance("Dynamic Ramu","Dynamic Father Ramu");
		System.out.println("Old Dynamic Ramu :"+p);
		
		p=(Politician)Class.forName("week_4.AbcPolitician").getConstructor(String.class,String.class).newInstance("New Dynamic Ramu","New Dynamic Father Ramu");
		System.out.println("New Dynamic Ramu :"+p);
		
		
	}

}
abstract class Politician{
	
}
class AbcPolitician extends Politician{
	String name,fname;
	public AbcPolitician(String name,String fname) {
		this.name=name;
		this.fname=fname;
	}
	@Override
	public String toString() {
		
		return "The object is : " +this.name+ " : " +this.fname;
	}
}
class XyzPolitician extends Politician{
	
}