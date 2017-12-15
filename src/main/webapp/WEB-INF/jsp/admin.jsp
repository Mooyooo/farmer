<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>

<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
}

.tg .tg-yw4l {
	vertical-align: top
}
</style>
</head>
<body>
	<table class="tg" style="table-layout: fixed; width: 787px">
		<colgroup>
			<col style="width: 200px">
			<col style="width: 200px">
			<col style="width: 100px">
			<col style="width: 100px">
			<col style="width: 60px">
			<col style="width: 60px">
			<col style="width: 60px">
		</colgroup>
		<tr>
			<th class="tg-yw4l">Description</th>
			<th class="tg-yw4l">Product Name</th>
			<th class="tg-yw4l">Price</th>
			<th class="tg-yw4l">State</th>
			<th class="tg-yw4l"></th>
			<th class="tg-yw4l"></th>
			<th class="tg-yw4l"></th>
		</tr>
		<c:forEach items="${ products }" var="p">
			<tr>
				<td class="tg-yw4l">${ p.description }</td>
				<td class="tg-yw4l">${ p.productName }</td>
				<td class="tg-yw4l">${ p.price }</td>
				<td class="tg-yw4l">${ p.productState }</td>
				<td class="tg-yw4l"><a href="admin/approve/${ p.id }">Approve</a></td>
				<td class="tg-yw4l"><a href="admin/reject/${ p.id }">Reject</a></td>
				<td class="tg-yw4l"><a href="/admin/delete/${ p.id }">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>