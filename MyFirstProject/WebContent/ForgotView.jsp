<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h5>
        <a href="LoginAuthenticate.jsp">Login</a>
        <p style="float:right"><img src="customLogoOuterglow.png" >  </p></h5>
    <h4><b> Hi,Guest</b></h4>
   <br>
   <br>
    <hr>
    <h1 style= text-align:center>Forgot your Password? </h1>
    <h4 style="text-align: center;">Submit your email address and we'll send you password</h4>
<p style="text-align: center;">Password is sent to your registered mail id</p>
<p style="text-align: center;">
<form action"">
<center>
<input type="email" placeholder="Enter ID here">
  <button> Go </button> <br style="text-align: center;">Email Id is required </br> </p>
   <%String name = (String)request.getAttribute("name"); 
   
		   if(name!=null)
			 {
				 %>
				 <%=name%>
				 <% 
			 }
			 %>
		</center>	
   </form>
  <hr>
  <h5> <center> © Copyright SunilOS Infotech Pvt Ltd.</center> </h5>
</body>
</html>
</body>
</html>