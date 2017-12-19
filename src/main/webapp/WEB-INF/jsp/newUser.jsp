<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>

<t:genericpage>
	<jsp:body>
<div class="container">
	<s:form action="/createUser" method="post" modelAttribute="user">
		<table>
			<tr>
			<s:errors path="*" element="div"></s:errors>
				<td align="left">Firstname: </td>
				<td width=800><input name="firstname" type="text"
							class="form-control" placeholder="Firstname" required autofocus
							value="Molomjamts" /></td>
			</tr>
			<tr>
				<td align="left">Lastname: </td>
				<td width=800><input name="lastname" type="text"
							class="form-control" placeholder="lastname" required autofocus
							value="Khaimchig" /></td>
			</tr>
			<tr>
				<td align="left">User Type: </td>
				<td width=800><select name="userType" 
							class="form-control">
								<option value="FARMER">Farmer</option>
								<option value="USER">Customer</option>
							</select></td>
			</tr>
			<tr>
				<td align="left">Username: </td>
				<td width=800><input name="username" type="text"
							class="form-control" placeholder="username" required autofocus
							value="molomjamts" /></td> 
				<%-- <td width="800"><s:input path="username" class="form-control" />
				 <s:errors path="username" cssClass="error" />
				 </td>		--%>	
			</tr>
			<tr>
				<td align="left">Password: </td>
				<td width=800><input name="password" type="text"
							class="form-control" placeholder="password" required autofocus
							value="pass" /></td> 
				<%-- <td width="800"><s:input path="password"
								class="form-control" />
				 <s:errors path="password" cssClass="error" />
				 </td>	--%>		
			</tr>
			<tr>
				<td align="left">Confirm password: </td>
				<td width=800><input name="confirmPassword" type="text"
							class="form-control" placeholder="confirmPassword" required
							autofocus value="pass" /></td>
			</tr>
			
			<tr>
				<td align="left">Email: </td>
				<td width=800><input name="email" type="text"
							class="form-control" placeholder="email" required autofocus
							value="molomjamts@gmail.com" /></td>
			</tr>
			<tr>
				<td align="left">Phone: </td>
				<td width=800><input name="phone" type="text"
							class="form-control" placeholder="phone" required autofocus
							value="99105020" /></td>
			</tr>
<%-- 			 <tr>
				<td align="left">Birth Date: </td>
				<td width=800><input name="birthDate" type="date"
							class="form-control" required autofocus
						 pattern="MM-dd-yyyy"/></td>
			</tr>  --%>
			<tr>
				<td align="left">Street: </td>
				<td width=800><input name="street" type="text"
							class="form-control" placeholder="street" required autofocus
							value="1000N" /></td>
			</tr>
			<tr>
				<td align="left">City: </td>
				<td width=800><input name="city" type="text"
							class="form-control" placeholder="city" required autofocus
							value="FAIRFIELD" /></td>
			</tr>
			<tr>
				<td align="left">State: </td>
				<td width=800><input name="state" type="text"
							class="form-control" placeholder="state" required autofocus
							value="IOWA" /></td>
			</tr>
			<tr>
				<td align="left">Zip Code: </td>
				<td width=800><input name="zipCode" type="text"
							class="form-control" placeholder="zipcode" required autofocus
							value="52557" /></td>
			</tr>
			<tr>
				<td colspan=2><input class="btn btn-lg btn-primary btn-block"
							type="submit" value="Save" /></td>
			</tr>
		</table>
   </s:form>
</div>
	</jsp:body>
</t:genericpage>