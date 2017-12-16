<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/styles.css" />
<title>Admin</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Description</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>State</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<c:forEach items="${ products }" var="p">
			<tr>
				<td>${ p.description }</td>
				<td><a href="product/${ p.id }">${ p.productName }</a></td>
				<td>${ p.price }</td>
				<td>${ p.productState }</td>
				<td><a href="admin/approve/${ p.id }">Approve</a></td>
				<td><a href="admin/reject/${ p.id }">Reject</a></td>
				<td><a href="admin/delete/${ p.id }">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>