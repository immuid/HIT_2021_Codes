package com.action;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse res) {
	addToSession(request);
	String shopid=request.getParameter("shopid");
	return "shopping."+shopid;
}

public void addToSession(HttpServletRequest request) {
	HttpSession session=request.getSession();
	Enumeration<String> e=request.getParameterNames();
	while(e.hasMoreElements()) {
		String name=e.nextElement();
		String value=request.getParameter(name);
		if(name.equals("formid") || name.equals("shopid")) {
			
		}
		else {
			session.setAttribute(name, value);
		}
	}
}
}
