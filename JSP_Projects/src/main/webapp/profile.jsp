<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile JSP Page</title>
</head>
<body>
<%@ include file="loginindex.jsp"%>

	<%
	String isValidSession = (String) session.getAttribute("session");
	if ("True".equalsIgnoreCase(isValidSession)) {
		out.println("Welcome to profile page, ");
	} else {
		request.setAttribute("profile_msg", "Kindly, login first");
		response.sendRedirect("login.jsp");
	}
	%>
</body>
</html>