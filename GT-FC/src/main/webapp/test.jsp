Scripting tags

<%@page import="java.util.List,java.util.Date"%>
scriplets - goes in service method(doget,dopost) 
<% 
  //we can write any java program
  
  Date d=new Date();
  out.println(d);
  
  List list;
  out.println(name);
  sayHello();
  
  String uname=request.getParameter("name");
  session.setAttribute("myname",uname);
%>

Declaration - goes outside the service method( can't use implicit objects here)
<%! 
	String name="hello world...";
	public void sayHello(){
		System.out.println("hello hello hello...");
	}

%>

Expression - a single line code , which only gives an output
The expression code also goes into service method - can use implicit objects
<%="HelloWorld"%>
<h1>
<%=session.getAttribute("myname") %> 
</h1>
