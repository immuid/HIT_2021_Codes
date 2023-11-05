package immu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImmuServlet
 */
@WebServlet(
		urlPatterns = {"/ImmuServlet","*.do","/HelloWorld"},
		loadOnStartup = 1,
		initParams = {
				@WebInitParam(name = "Driver", value = "mysql.immu.blabla"),
				@WebInitParam(name = "ImmuUrl", value = "http://jalabulajangu"),
				@WebInitParam(name = "configfile", value = "/WEB-INF/dbconfig.properties")
		}
		)
public class ImmuServlet extends HttpServlet {
//   	@Override
//		public void init() throws ServletException {
//			System.out.println("INIT Method Called....");
//		}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("INIT Method Called....");
		String name=config.getInitParameter("Driver");
		System.out.println(name);
		System.out.println(config.getInitParameter("ImmuUrl"));
		System.out.println(config.getInitParameter("configfile"));
		String path=config.getInitParameter("configfile");
		System.out.println(path);
		ServletContext application=config.getServletContext();
		String Fullpath=application.getRealPath(path);
		System.out.println(Fullpath);
		try {
		Properties prop=new Properties();
		prop.load(new FileInputStream(Fullpath));
		System.out.println(prop.get("driver"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Do Get Method called...");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Do Post Method called...");
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy Method Called....");
	}

}
