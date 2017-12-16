<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:genericpage>
	<jsp:body>
	<table class="table">
	
		<tr>
			<th>Firstname</th>
			<th>Lastname</th>
		</tr>
		<c:forEach items="${customers}" var="c">
			<tr>
				<td>${c.firstname }</td>
				<td>${c.lastname }</td>
			</tr>
		</c:forEach>
	</table>
</jsp:body>
</t:genericpage>