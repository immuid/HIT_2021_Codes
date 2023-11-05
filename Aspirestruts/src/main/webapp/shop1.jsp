<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<h1>Vegetable shop</h1>
	<form action="shopping.do;jsessionid=<%=session.getId()%>" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop1">
		
		Brinjal:<input type="checkbox" name="c1" value="Brinjal">
		Potato:<input type="checkbox" name="c2" value="potato">
		Onion:<input type="checkbox" name="c3" value="onion">
		
		<input type="submit" value="Next Shop...">
	</form>
</body>
</html>