<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:genericpage>
	<jsp:body>
	<table class="table">
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
		<%-- <c:forEach var="productImage" items="${product.getImages()}"> --%>
		<c:forEach var="productImage" items="${product.images}">
			<img src="data:image/jpeg;base64,${productImage}" height="200px"/>&nbsp&nbsp&nbsp  
		</c:forEach>
	</div>
</jsp:body>
</t:genericpage>