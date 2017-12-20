<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:genericpage>
	<jsp:body>
<div class="container">
       <div class="col-8 col-offset-2">
           <h1 class="text-center login-title">Sign in to continue to Farmer App</h1>
           <div class="account-wall">
				<c:if test="${error eq true}">
					<p>${sessionScope[SPRING_SECURITY_LAST_EXCEPTION].messages}</p>
				</c:if>
                <form class="form-signin" method="post"
						action="<c:url value='/login'/>">
                	<input type="text" class="form-control"
							placeholder="Username" name="username" required autofocus />
	                <input type="password" class="form-control"
							placeholder="Password" name="password" required>
	                <button class="btn btn-lg btn-primary btn-block"
							type="submit">
	                    Sign in</button>
	                <label class="checkbox pull-left">
	                    <input type="checkbox" name="remember-me" value="remember-me">
	                    Remember me
	                </label>
	                <a href="#" class="pull-right need-help" style="display: none;">Need help? </a><span
							class="clearfix"></span>
                </form>
            </div>
            <a href="/createUser" class="text-center new-account">Create an account </a>
        </div>
</div>
	</jsp:body>
</t:genericpage>