package bulksms;

import java.util.Locale;
import java.util.ResourceBundle;

public class demo {
	public static void main(String[] args) {
		
		 ResourceBundle rb=ResourceBundle.getBundle("numbers",new Locale("en"));// Locale.getdefault()
		 
		String s[]= {rb.getString("n1"),
					rb.getString("n2"),
					rb.getString("n3")};
		
		for(String str:s) {
			System.out.println(str);
		}

	}

}
