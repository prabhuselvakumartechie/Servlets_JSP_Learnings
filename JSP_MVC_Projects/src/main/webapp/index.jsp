<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP MVC Project</title>
</head>
<body>
	<h1>JSP MVC Example</h1>
	<form action="ControllerServlet" method="post">
		Username: <input type="text" name="username"></br> </br>
		Password: <input type="text" name="password"></br> </br>
		<input type="submit" value="Login"> 
		<input type="reset" value="Reset">
	</form>
</body>
</html>