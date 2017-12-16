<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Description</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>State</th>
			</tr>
		</thead>
		<tr>
			<td>${ product.description }</td>
			<td>${ product.productName }</td>
			<td>${ product.price }</td>
			<td>${ product.productState }</td>
		</tr>
	</table>
	<div>
		<c:forEach items="${ product.images }" var="i">
			<img src="data:image/jpg;base64,${ i }" width="200px" height="200px">
		</c:forEach>
	</div>
</body>
</html>