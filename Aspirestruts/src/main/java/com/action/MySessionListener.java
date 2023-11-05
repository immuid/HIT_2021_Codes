package com.action;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.service.LoginService;
import com.service.LoginServiceImpl;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
        System.out.println("session created......");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("session destroyed.....");
         HttpSession session=se.getSession();
         Object uname=session.getAttribute("uname");
         if(uname!=null) {
        	 String n=(String)uname;
        	 LoginService ls=new LoginServiceImpl();
        	 ls.logout(n);
         }
    }
	
}
