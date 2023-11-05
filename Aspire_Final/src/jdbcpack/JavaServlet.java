package jdbcpack;

import java.net.URL;
import java.net.URLConnection;

public class JavaServlet {
	public static void main(String[] args) throws Exception{
		URL url=new URL("http://localhost:8080/gtweb3online/HelloServlet");
		URLConnection urlcon=url.openConnection();
		urlcon.getInputStream();
	}

}
