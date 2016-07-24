<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<br>
USER (DEBUG): ${user}
<br>
Login

<form:form action="login.do" modelAttribute="userLogin">
	<table>
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

Signup


<form:form action="signup.do" modelAttribute="userLogin">
	<table>
		<tr>
				<td>Email:</td>
				<td><form:input type="email" name="email" path="email" value="fake@fakemail.com" /></td>
		</tr>	
		<tr>
		<td colspan="2"><button type="submit">Sign Up</button></td>
		</tr>
		<tr>
		<td colspan="2">Sign up, then check your email for confirmation</td>
		
		</tr>

	</table>
</form:form>




</body>
</html>