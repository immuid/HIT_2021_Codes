package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.LoginService;
import com.service.LoginServiceImpl;

public class LogoutAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse res) {
		HttpSession session=request.getSession();
		String uname=(String)session.getAttribute("uname");
		LoginService service=new LoginServiceImpl();
		service.logout(uname);
		return "logout.success";
	}

}
