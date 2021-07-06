<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="net.simple.login.jdbc.database.LoginDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<jsp:useBean id="login" class="net.simple.login.bean.LoginBean" />
	<jsp:setProperty property="*" name="login" />
	<%
	LoginDao loginDao = new LoginDao();
	boolean status = loginDao.validate(login);
	if (status) {
		out.print("<h1>You have logined successfully.</h1>");
	} else {
		out.print("<h1>Username/Password are incorrect.</h1>");
	}
	%>
</body>
</html>