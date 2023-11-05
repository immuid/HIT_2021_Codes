package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlets
 */
@WebServlet(
		
		urlPatterns = {"/HelloServlets","*.do","/hellohello"},
		loadOnStartup = 1
		)
public class HelloServlets extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("INIT method called ...");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Do Get Method Called.....");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Do Post Method Called.....");
		doGet(request, response);
	}
	@Override
	public void destroy() {
		System.out.println("destroy method called...");
	}

}
