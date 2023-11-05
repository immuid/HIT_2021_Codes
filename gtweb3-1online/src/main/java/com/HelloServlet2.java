package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
 * Servlet implementation class HelloServlet2
 */
@WebServlet(
		urlPatterns = { 
				"/HelloServlet2", 
				"/blabla", 
				"*.do"
		}, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "friend", value = "sadham"),
				@WebInitParam(name = "myfile", value = "/WEB-INF/config.properties")
		})
public class HelloServlet2 extends HttpServlet {
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			String mydriver=config.getInitParameter("driver");
			String myfriend=config.getInitParameter("friend");
			String myconfigfile=config.getInitParameter("myfile");
			System.out.println(mydriver+":"+myfriend+":"+myconfigfile);
			
			ServletContext app=config.getServletContext();
			System.out.println(app.getRealPath(myconfigfile));
			
			Properties prop=new Properties();
			
			try {				
			prop.load(new FileInputStream(app.getRealPath(myconfigfile)));
			System.out.println(prop.get("driver"));
			System.out.println(prop.get("url"));
			System.out.println(prop.get("username"));
			System.out.println(prop.get("password"));			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
