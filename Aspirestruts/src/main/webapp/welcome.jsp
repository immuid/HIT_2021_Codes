<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome page....</h1>
<form action="shopping.do;jsessionid=<%=session.getId()%>" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="start">
	<input type="submit" value="Shopping...">
</form>
</body>
</html>