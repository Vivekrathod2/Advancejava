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
		request.setAttribute("fruit", "appple");
		String b = (String) request.getAttribute("fruit");
	%>
	<%=b%>

</body>
</html>