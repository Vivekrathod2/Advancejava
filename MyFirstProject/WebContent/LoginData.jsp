<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	String user = request.getParameter("user");
	String password = request.getParameter("password");
	for( int i=0; i<5; i++)
%>
<h1>Hello</h1>
<%=user %>
<%=password %>

</body>
</html>