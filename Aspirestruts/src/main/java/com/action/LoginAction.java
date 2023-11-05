package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.LoginService;
import com.service.LoginServiceImpl;

public class LoginAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse res) {
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		LoginService loginService=new LoginServiceImpl();
		HttpSession session=request.getSession();
		boolean valid=loginService.checkUser(uname, upass);
		if(valid) {
			if(loginService.checkFlag(uname)) {
				loginService.updateFlag(uname);
				session.setAttribute("uname", uname);
				return "login.success";
			}
			else {
				return "login.alreadylogedin";
			}
		}
		else {
			return "login.register";
		}
	}
}
