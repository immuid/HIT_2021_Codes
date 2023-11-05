package mailProject;
import java.util.HashSet;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

class JavaMail{
	public static void main(String[] args) throws Exception {
		JavaMailUtil bmail=new JavaMailUtil();
		Set<String> emails = get();
	
  for (String string:emails) {
	  		bmail.process(string);
}
  }
	private static Set<String> get(){
		
		Set<String> emails = new HashSet<>();
		 ResourceBundle rb=ResourceBundle.getBundle("password",new Locale("en"));// Locale.getdefault()//used properties 
		emails.add(rb.getString("e1"));//email is stored in properties
		emails.add(rb.getString("e2"));//email is stored in properties
		emails.add(rb.getString("e3"));
		return emails;
		
	}
}
//public class JavaMail {
//	public static void main(String[] args) throws Exception {
//		JavaMailUtil.sendMails("imranhash510@gmail.com");
//	}
//
//}
