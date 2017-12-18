<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:genericpage>
	<jsp:body>
<div class="container">
	<form action="newProduct" method="post">
		<table>
			<tr>
				<td align="left">Product Name: </td>
				<td width=800><input name="productName" type="text" class="form-control" placeholder="Product Name" required autofocus /></td>
			</tr>
			<tr>
				<td align="left">Description: </td>
				<td width=800><textarea rows="4" cols="50" name="description" class="form-control" placeholder="Description" required autofocus ></textarea></td>
			</tr>
			<tr>
				<td align="left">Price: </td>
				<td width=800><input name="price" type="number" step="0.01" class="form-control" placeholder="Price" required autofocus/></td>
			</tr>
			<tr>
				<td colspan=2><button class="btn btn-lg btn-primary btn-block" type="submit">Save</button></td>
			</tr	>
		</table>
    </form>
</div>
	</jsp:body>
</t:genericpage>