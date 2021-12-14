<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
		<h4>
			<%@ include file="Header.jsp"%>
			<%String name = (String) request.getAttribute("name");
			if (name != null) {
		%>
			<%=name%>
			<%
				}
			%>
		</h4>
		<h2>Welcome to Rays</h2>
		<hr>
		
<%@ include file="Footer.jsp"%>
		
</body>
</html>