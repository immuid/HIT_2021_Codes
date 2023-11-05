<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<h1>Fruit shop</h1>
	<form action="shopping.do;jsessionid=<%=session.getId()%>" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop3">
		
		Mango:<input type="checkbox" name="c7" value="mango">
		Banana:<input type="checkbox" name="c8" value="banana">
		Apple:<input type="checkbox" name="c9" value="apple">
		
		<input type="submit" value="Invoice...">
	</form>
</body>
</html>