<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:genericpage>
	<jsp:body>
	<table class="table">
		<thead>
			<tr>
				<th>Product name</th>
				<th>Description</th>
				<th>Price</th>
				<th>Detail</th>
				<th>Buy</th>
			</tr>
		</thead>
		<c:forEach items="${approvedProducts}" var="ap">
			<tr>
				<s:form action="/addItem/${ap.id}" method="post">
					<td>${ap.productName }</td>
					<td>${ap.description }</td>
					<td>${ap.price }</td>
					<td><a href="/productDetail/${ap.id}">detail</a></td>
					<td>
						<input type="number" name="quantity" value="${lineItem.quantity}"
							placeholder="quantity" min="1" />
							<input type="submit" value="add to cart" />
					</td>
				</s:form>
			</tr>
		</c:forEach>
	</table>
</jsp:body>
</t:genericpage>