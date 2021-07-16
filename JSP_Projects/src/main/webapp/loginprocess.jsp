<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.jsp.projects.dao.LoginDao"%>
<jsp:useBean id="obj" class="com.jsp.projects.model.LoginBean" />

<jsp:setProperty property="*" name="obj" />
<jsp:include page="loginindex.jsp"></jsp:include>
<%
boolean status = LoginDao.validate(obj);
if (status) {
	out.println("You r successfully logged in");
	session.setAttribute("session", "TRUE");
} else {
	out.print("Sorry, email or password error");
}
%>

