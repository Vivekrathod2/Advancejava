<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<style>
span {
	font: small;
	color: red;
}
</style>
	<script>
		function validate(frm) {
			var flag = true;
			if (frm.login.value == '') {
				document.getElementById("loginCheck").innerHTML = "login id required"
				flag = false;
			}
			if (frm.Password.value == '') {
				document.getElementById("PasswordCheck").innerHTML = "Password id required"
				flag = false;
			}
			return flag;
		}
	</script>
</head>
<body>
	<img src="customLogoOuterglow.png" align="right">
	<br>
	<br>
	<br>
	<h4>Hi, Guest</h4>
	<br>
	<br>
	<br>
	<hr>
	<center>

		<h1>Login</h1>
		<%
			String error = (String) request.getAttribute("error");
			if (error != null) {
		%>
		<%=error%>
		<%
			}
		%>
		
<% String fn = (String)session.getAttribute("session");
			if (fn != null)
			out.println("/WelcomeCtl"+fn);
			%>
			
		<form onsubmit="return validate(this)" action="AuthenticateCtl"
			method="post">

			<table>
				<tr>
					<th>LoginId*</th>
					<td><input type="text" name="login"> <%
 					String errorE = (String) request.getAttribute("errorE");
 					if (errorE != null) {
 					%> <%=errorE%> <%
 					}
 					%></td>
				</tr>
				<tr>
					
					<th>Password*</th>
					<td><input type="password" name="Password"><span
						id="PasswordCheck"></span></td>
				</tr>
				<tr>
					<th></th>
					<td colspan="2"><input type="Submit" value="SignIn"></td>

				</tr>
				<tr>
					<th></th>
					<td colspan="2" align="centre"><a href="UserRegistration.jsp">SignUp</a>
						<a href="ForgotView.jsp"><b>forget my Password</b></a></td>
				</tr>
				<tr>
					<td></td>
				</tr>

			</table>

			<hr>
	</center>
	</form>


	<%@ include file="Footer.jsp"%>
</body>
</html>