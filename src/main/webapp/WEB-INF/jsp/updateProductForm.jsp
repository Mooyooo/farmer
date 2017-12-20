<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:genericpage>
	<jsp:body>
<div class="container">
	<h1>Update Product</h1>
	<br>
	<form action="updateProduct" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td align="left">Product Name: </td>
				<td width=800><input name="productName" value="${ product.productName }" type="text" class="form-control" placeholder="Product Name" required autofocus /></td>
			</tr>
			<tr>
				<td align="left">Description: </td>
				<td width=800><textarea rows="4" cols="50" name="description" class="form-control" placeholder="Description" required autofocus >${ product.description }</textarea></td>
			</tr>
			<tr>
				<td align="left">Price: </td>
				<td width=800><input name="price" type="number" value="${ product.price }" step="0.01" class="form-control" placeholder="Price" required autofocus/></td>
			</tr>
			<tr>
				<td align="left">Images:</td>
				<td><input type="file" name="file" multiple required></td>
			</tr>
			<tr>
				<td colspan=2><button class="btn btn-lg btn-primary btn-block" type="submit">Save</button></td>
			</tr	>
		</table>
    </form>
</div>
	</jsp:body>
</t:genericpage>