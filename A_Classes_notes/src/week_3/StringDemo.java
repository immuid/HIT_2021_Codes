package week_3;

//String is a Class , String is an Object it is not like others
public class StringDemo { 
	public static void main(String[] args) {
		int i=10;
		String s="hello";//Recommended approach by default
		String st=new String("hello2");
		System.out.println(s +"   "+ st);
		System.out.println(s.hashCode());
		System.out.println(st.hashCode());
		System.out.println(s==st);
		System.out.println(s.equals(st));//If both the hash_codes are same then the results will be true
		
		
		//String objects are non mutable
		String temp="New temp world...: "+s;
		System.out.println(temp);
		System.out.println(s);
		
		String Mystore=s;
		s=s+" New Word ";
		System.out.println(s);
		System.out.println(Mystore);
		//String value is non mutable .. once declared a String .. the String value can not be changed 
		//when u changed .. then the new copy of the string is created ..
		//So when you do operations like concatenation/split/reverse etc on a string in indefinite loop
		
		char c=s.charAt(2);
		System.out.println(c);
		System.out.println(s.substring(3,10));
		System.out.println(Mystore==st);
		System.out.println(Mystore.equals(st));
	}
	
	
}
