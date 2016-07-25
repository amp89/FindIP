<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<br><br>
<form:form action="login.do" modelAttribute="userLogin">
	<table>
		<tr>
		<td colspan="2">Sign In</td>
		</tr>
		<tr>
				<td>Email:</td>
				<td><form:input type="email" name="email" path="email" value="admin@fakemail.com" /></td>
		</tr>
		
		<tr>
				<td>Password:</td>
				<td><form:input type="password" name="password"  path="password" value="password" /></td>
		</tr>
		
		<tr>
		<td colspan="2"><button type="submit">Sign In</button></td>
		</tr>
	</table>
	
</form:form>
<br><br>
Signup


<form:form action="signup.do" modelAttribute="userLogin">
	<table>
		<tr>
				<td>Email:</td>
				<td><form:input type="email" name="email" path="email" value="fake@fakemail.com" /></td>
				<td><form:input type="password" name="password" path="password" required="required" /></td>
		</tr>	
		<tr>
		<td colspan="2"><button type="submit">Sign Up</button></td>
		</tr>
		<tr>
		<td colspan="2">Sign up, then check your email for confirmation</td>
		
		</tr>

	</table>
</form:form>

<br><br>
	<div ng-app="changePassword" ng-controller="editController">
	Reset Your Password:
	<form name="resetPasswordForm" ng-submit="resetPassword()">
	<input ng-pattern="emailRegex" ng-minlength="4" ng-maxlength="45" ng-model="userData.email" required>
	<button ng-disabled="resetPasswordForm.$invalid" type="submit">Reset Password</button>
	//check your email msg here
	</form>
	</div>

	<script src="angular/apps/changePassword.js">
	</script>

</body>
</html>