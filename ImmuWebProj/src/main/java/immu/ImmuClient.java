package immu;

import java.net.URL;
import java.net.URLConnection;

public class ImmuClient {
	public static void main(String[] args) throws Exception {
		URL url= new URL("http://localhost:8080/ImmuWebProj/ImmuServlet");
		URLConnection urlcon=url.openConnection();
		urlcon.getInputStream();
	}

}
