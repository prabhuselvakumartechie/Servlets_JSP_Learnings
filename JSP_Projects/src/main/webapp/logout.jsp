<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP Form</title>
</head>
<body>
	<%@ include file="loginindex.jsp"%>
	
	<% String isSessionValid = (String)session.getAttribute("session"); 
	
	if("True".equalsIgnoreCase(isSessionValid)){
		session.invalidate();
		out.print("Successfully logout.");
	}else{
		request.setAttribute("profile_msg", "Kindly, login first");
		response.sendRedirect("login.jsp");
	}
	
	%>

</body>
</html>