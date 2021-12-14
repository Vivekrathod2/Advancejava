<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
span {
	font: small;
	color: red;
}
</style>

</head>
<body>
	<script>
		function validate(frm) {
			var flag = true;
			if (frm.lastName.value == "") {
				document.getElementById("lastNameCheck").innerHTML = "Name id required"
				flag = false;
			}
			if (frm.firstName.value == "") {
				document.getElementById("firstNameCheck").innerHTML = "first name required"
				flag = false;
			}
			if (frm.email.value == "") {
				document.getElementById("emailid").innerHTML = "login id required"
				flag = false;
			}
			if (frm.password.value == "") {
				document.getElementById("passCheck").innerHTML = "password id required"
				flag = false;
			}
			if (frm.Confirmpassword.value == "") {
				document.getElementById("confirmPassCheck").innerHTML = "Confirmr id required"
				flag = false;
			}
			if (frm.gender.value == "") {
				document.getElementById("GenderC").innerHTML = "gender required"
				flag = false;
			}
			if (frm.dob.value == "") {
				document.getElementById("dateCheck").innerHTML = "Date is  required"
				flag = false;
			}

			return flag;
		}
	</script>
</head>

<body>
	<form onsubmit="return validate(this)" action="Myregistrationservlet"
		method="post">
		<a href="LoginAuthenticate.jsp"> <b> Login</b></a>

		<h1 align="Right">
			<img src="customLogoOuterglow.png" alt="">

		</h1>
		<h3>Hi,Guest</h3>
		<hr>
		<center>

			<table>
				<h1>User Registration</h1>

				<%
					String s = (String) request.getAttribute("msg");
					if (s != null) {
				%>
				<%=s%>
				<%
					}
				%>

				<%
					String passRegex = (String) request.getAttribute("passswordRegexMessage");
					if (passRegex != null) {
				%>
				<%=passRegex%>
				<%
					}
				%>

				<%
					String emailRegex = (String) request.getAttribute("emailid");
					if (emailRegex != null) {
				%>
				<%=emailRegex%>
				<%
					}
				%>


				<tr>
					<th>Last name*</th>
					<td><input type="text" name="lastName"><span
						id="lastNameCheck"></span></td>
				</tr>
				<tr>
					<th>FirstName*</th>
					<td><input type="text" name="firstName"><span
						id="firstNameCheck"></span></td>

				</tr>


				<tr>
					<th>Email*</th>

					<td><input type="text" name="email"> <span
						id="emailid"></span></td>
				</tr>
				<tr>
					<th>Password*</th>
					<td><input type="password" name="password"><span
						id="passCheck"></span></td>
				</tr>
				<tr>
					<th>Confirmpassword*</th>
					<td><input type="password" name="Confirmpassword"> <span
						id="confirmPassCheck"></span></td>
				</tr>
				<tr>
					<th>Gender*</th>
					<td><select name="gender"><span></span>
							<option value=" "></option>
							<option value="male">male</option>
							<option value="female">Female</option>
					</select> <span id="GenderC"></span></td>
				</tr>
				<tr>
					<th>Date Of Birth(mm/dd/yyy)</th>
					<td><input type="date" name="dob" size=30 value=""> <span
						id="dateCheck"></span></td>
				<tr>

					<td><input type="submit" value="signin"></td>

				</tr>

			</table>
			<hr>


		</center>
		<CENTER>
			<H3>(c) Copyrights SunilOS Infotech Pvt. Ltd.</H3>
		</CENTER>
	</form>
</body>
</html>