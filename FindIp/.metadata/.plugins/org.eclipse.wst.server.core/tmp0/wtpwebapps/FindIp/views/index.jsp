<%@ include file="../JSPIncludes/tags.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to FindIp</title>
</head>
<body>
${message}
<br>
USER (DEBUG): ${user}
<br>
Login

<form:form action="login.do" modelAttribute="user">
	<table>
		<tr>
				<td>Email:</td>
				<td><form:input type="email" name="email" path="email" value="fake@fakemail.com" /></td>
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


<form:form action="signup.do" modelAttribute="user">
	<table>
		<tr>
				<td>Email:</td>
				<td><form:input type="email" name="email" path="email" value="fake@fakemail.com" /></td>
		</tr>	
		<tr>
		<td colspan="2"><button type="submit">Sign Up</button></td>
		</tr>
		<tr>
		<td colspan="2">Check your email for confirmation</td>
		
		</tr>

	</table>
</form:form>




</body>
</html>