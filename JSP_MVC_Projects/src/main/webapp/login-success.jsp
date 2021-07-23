<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="com.jsp.mvc.project.model.LoginBean"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Login Success Page</title>
</head>
<body>
	<p>You are successfully logged in</p>
	<%
	LoginBean bean = (LoginBean) request.getAttribute("Bean");
	out.print("Welcome " + bean.getName());
	%>
</body>
</html>