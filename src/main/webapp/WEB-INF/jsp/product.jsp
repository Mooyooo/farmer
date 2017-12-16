<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
			<td>${ p.description }</td>
			<td>${ p.productName }</td>
			<td>${ p.price }</td>
			<td>${ p.productState }</td>
		</tr>
	</table>
</body>
</html>