package practice1;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageDemo {
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		System.out.println(locale);
		//Locale.setDefault(new Locale("ta"));
		//System.out.println(Locale.getDefault());
		
		ResourceBundle rb=ResourceBundle.getBundle("dictionary",new Locale("ta"));// Locale.getdefault()
		System.out.println(rb.getString("hello"));
	}

}
