package module2.week3;

import java.net.URL;
import java.net.URLConnection;

public class ServletCall {
	public static void main(String[] args) throws Exception{
		URL url=new URL("http://localhost:8080/aspire_web/HelloServlet");
		URLConnection urlcon=url.openConnection();
		urlcon.getInputStream();
	}

}
