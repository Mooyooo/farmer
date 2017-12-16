<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	
		<tr>
			<th>Firstname</th>
			<th>Lastname</th>
		</tr>
		<c:forEach items="${customers}" var="c" >
			<tr>
				<td>${c.firstname }</td>
				<td>${c.lastname }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>