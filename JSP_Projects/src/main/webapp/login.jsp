<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP Example</title>
</head>
<body>
	<%@ include file="loginindex.jsp"%>
	<br />

	<h3>Login Form</h3>
	<%  
String profile_msg=(String)request.getAttribute("profile_msg");  
if(profile_msg!=null){  
out.print(profile_msg);  
}  
String login_msg=(String)request.getAttribute("login_msg");  
if(login_msg!=null){  
out.print(login_msg);  
}  
 %>
	<br />
	<form action="loginprocess.jsp" method="post">
		Email:<input type="text" name="email" /><br />
		<br /> Password:<input type="password" name="password" /><br />
		<br /> <input type="submit" value="login" />
		<input type="reset" value="Reset">
	</form>

</body>
</html>