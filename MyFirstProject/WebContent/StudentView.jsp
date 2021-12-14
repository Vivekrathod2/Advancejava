<%@page import="in.Student.rays.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <a href="ArrayListCtl">listdata</a>
	<center>
	<%
			String Success = (String) request.getAttribute("Success");
			if (Success != null) {
		%>
		<%=Success%>
		<%
			}
		%>
	<%
			String Update = (String) request.getAttribute("Update");
			if (Update != null) {
		%>
		<%=Update%>
		<%
			}
		%>
		
		<%
			String Delete = (String) request.getAttribute("Delete");
			if (Delete != null) {
		%>
		<%=Delete%>
		<%
			}
		%>
	
	
		<h1 style="color: red">Student Management</h1>
		<form action="StudentCtl" method="post">
			<table>
			<tr>
					<td>ID*</td>
					<td><input type="text" name="ID"></td>
				</tr>
				
				<tr>
				
				
					<td>Roll No</td>
					<td><input type="text" name="RollNo"></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName"></td>
				</tr>
				<tr>
					<td>Session</td>
					<td><input type="text" name="session"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="add" name="operation">
						<input type="submit" value="modify" name="operation"> <input
						type="submit" value="delete" name="operation">
						
						</td>
				</tr>


			</table>
		</form>
	</center>
</body>
</html>