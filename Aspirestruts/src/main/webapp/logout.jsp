<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr>
	<form action="logout.do;jsessionid=<%=session.getId()%>" method="post">
		<input type="hidden" name="formid" value="logout">
		
		<input type="submit" value="logout..">
	</form>
</hr>
</body>
</html>