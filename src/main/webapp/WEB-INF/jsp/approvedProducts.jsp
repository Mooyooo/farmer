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
				<s:form action="/approvedProducts" method="post">
					<td>${ap.productName }</td>
					<td>${ap.description }</td>
					<td>${ap.price }</td>
					<td><a href="/product/${ap.id}">detail</a></td>
					<td><input type="number" name="quantity"
							placeholder="quantity" min="1" value="1">
						 <input type="hidden" name="pid" value="${ap.id}">
						<input type="submit" value="add to cart" /></td>
				</s:form>
			</tr>
		</c:forEach>
	</table>
	<br>
	<div class="float-sm-right">
	<table class="table table-sm">
		<thead>
			<h5>In my shopping cart</h5>
		</thead>
		<tr>
				<th>Product</th>
				<th>Qty</th>
				<th>Price</th>
			</tr>
		<c:forEach items="${cart.lineItems}" var="item">
			<tr>
				<s:form action="/addItem/${ap.id}" method="post">
					<td>${item.product.productName }</td>
					<td>${item.quantity }</td>
					<td>${item.price }</td>
				</s:form>
			</tr>
		</c:forEach>
		<s:form action="/checkout" method="post">
		<tr>
			<td colspan="2" class="font-weight-bold">Total:</td>
			<td class="font-weight-bold">${cart.getTotal() } <input
							type="hidden" name="total" value="${cart.getTotal() }"> </td>
		</tr>
		<tr>
		<td colspan="3">
			<input class="btn btn-lg btn-primary btn-block" type="submit"
							value="Checkout" />
		</td>	
		</tr>
		</s:form>
	</table>
	</div>
</jsp:body>
</t:genericpage>