package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(
		urlPatterns = {"/blabla","*.do","/hello/hello"}
		)
public class HelloServlets extends HttpServlet {
	
	synchronized protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get called ...");
		response.getWriter().append("Served at:").append(request.getContextPath());
//		Service service=new Service();
//		service.callRmiClientService();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post called...");
		doGet(request, response);
	}

}