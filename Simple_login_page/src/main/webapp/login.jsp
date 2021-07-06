<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
	<h1>Simple Login Form</h1>
	<form action="loginsuccess.jsp" method="post"
		style="display: inline-block;">
		<table style="with: 100%">
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit" /> <input type="reset"
			value="Reset">
	</form>

</body>
</html>
