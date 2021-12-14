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
		request.setAttribute("color", "red");
		String a = (String) request.getAttribute("mithai");
		String b = (String) request.getAttribute("fruit");
		String c = (String) request.getAttribute("color");
	%>
	<%=a%>
	<%=b%>
	<%=c%>
</body>
</html>
