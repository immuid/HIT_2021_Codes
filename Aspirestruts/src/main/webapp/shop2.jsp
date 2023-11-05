<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h1>Gold shop</h1>
	<form action="shopping.do;jsessionid=<%=session.getId()%>" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop2">
		
		Gold:<input type="checkbox" name="c4" value="gold">
		Silver:<input type="checkbox" name="c5" value="silver">
		Diamonds:<input type="checkbox" name="c6" value="diamonds">
		
		<input type="submit" value="Next Shop...">
	</form>
</body>
</html>