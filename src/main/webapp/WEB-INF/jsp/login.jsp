<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page!</h1>
	<c:if test="${error eq true}">
		<p>${sessionScope[SPRING_SECURITY_LAST_EXCEPTION].messages}</p>
	</c:if>
	<form  method="post" action="<c:url value='/j_spring_security_check'/>">
		user:<input name="username" value='<c:if test="${not empty param.login_error}">
			<c:out value="${SPRING_SECURITY_LAST_USERNAME}"/>
		</c:if>'>
		<br>
		password:<input type="password" name="password">
		<br> <input type="submit">
	</form>
</body>
</html>