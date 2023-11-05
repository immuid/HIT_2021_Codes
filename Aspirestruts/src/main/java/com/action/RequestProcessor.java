package com.action;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestProcessor {
	public void process(HttpServletRequest request ,HttpServletResponse response) {
		try {
		ServletContext application= request.getServletContext();
		String path=application.getRealPath("/WEB-INF/config.properties");
		Properties prop=new Properties();
		prop.load(new FileInputStream(path));
		
		String formid=request.getParameter("formid");
		
		String actionclass=prop.getProperty(formid);
		
		Action action=(Action)Class.forName(actionclass).newInstance();
		
		String result=action.execute(request, response);
		
		String nextpage=prop.getProperty(result);
				
		RequestDispatcher rd=request.getRequestDispatcher(nextpage);
		rd.forward(request, response);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
