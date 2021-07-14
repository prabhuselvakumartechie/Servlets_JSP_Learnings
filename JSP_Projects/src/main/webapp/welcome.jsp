<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome JSP Page</title>
</head>
<body>
	<%
	String name = request.getParameter("uname");
	out.print("This is Scriptlet Tag Example >>> " + name);
	%>
	<br>
	<%= "This is Expression Tag Example >>> "+ name %>
	<br> Current Time:
	<%= java.util.Calendar.getInstance().getTime() %>
	<br>
	<%!   
		int cube(int n){  
		return n*n*n;  
		}  
	%>
	<%= "This is Declaration Tag Example >>> "+ name %>
	
	<%= "Cube of 3 is: "+cube(3) %>
</body>
</html>