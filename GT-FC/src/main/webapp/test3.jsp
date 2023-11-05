<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp">
		<jsp:param  name="cname" value="haarisinfotech..."/>
	</jsp:include>
	
	<%@ include file="header.jsp" %>  //-this reads the file at compile time
</body>
</html>