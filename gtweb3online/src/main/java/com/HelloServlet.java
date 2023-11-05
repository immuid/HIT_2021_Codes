package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("number");
		//ServletOutputStream out=response.getOutputStream();
		int n=Integer.parseInt(num);
		if(n%2==0) {
			RequestDispatcher rd=request.getRequestDispatcher("Even.html");
			rd.forward(request, response);
		}else {
//			response.sendRedirect("Odd.html");
			RequestDispatcher rd=request.getRequestDispatcher("Odd.html");
			rd.forward(request, response);
		}
		System.out.println("Servlet Method called .... by :"+num);
		doPost(request, response);
	}

		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		}
}
