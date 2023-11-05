package week_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class GenericDemo {
	public static void main(String[] args) {
		GenericDemo gd=new GenericDemo();
		System.out.println(gd.reciepent());
		
		Locale locale=Locale.getDefault();
		System.out.println(locale);
		Locale.setDefault(new Locale("en"));
		System.out.println(Locale.getDefault());
		
		ResourceBundle rb=ResourceBundle.getBundle("password",new Locale("en"));// Locale.getdefault()
		System.out.println(rb.getString("p1"));
	}
		public Object reciepent() {
			List list=new ArrayList();
			list.add("imranhash510@gmail.com");
			list.add("abdulthedon007@gmail.com");
			list.add("immuimran2k@gmail.com");
//			for(Object o:list) {
//			     
//			}
			  return list;
		}
	

}
