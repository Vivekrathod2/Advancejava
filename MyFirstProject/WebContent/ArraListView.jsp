<%@page import="in.Student.rays.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<form action="ArrayListCtl">
			<input type="submit" value="Refresh">
			<%
				ArrayList<StudentBean> list = (ArrayList<StudentBean>) request.getAttribute("list");
				if (list != null) {
			%>
			
			<table>
				<tr>
					<td>ID:</td>
					<td>ROLL NO:</td>
					<td>FIRST NAME:</td>
					<td>LAST NAME:</td>
					<td>SESSION:</td>
				</tr>
				<%
					for (StudentBean b : list) {
				%>
				<tr>
					<td><%=b.getId()%></td>
					<td><%=b.getRollNo()%></td>
					<td><%=b.getFirstName()%></td>
					<td><%=b.getLastName()%></td>
					<td><%=b.getSession()%></td>
				</tr>
				<%
					}
				%>
			</table>
			<%
				}
			%>
		</form>


	</center>


</body>
</html>