<%@ include file="../JSPIncludes/headAndNav.jsp"%>

	<script>
	$(document).ready(function(){
		$("title").text("IpFind | Manage Users");
	});
	</script>
Confirm your account

<form:form name="confirm" action="confirm.do" modelAttribute="userLogin">
	<form:input name="email" path="email" required="required" />
	<form:input name="confirmationCode" path="accessToken" required="required" />
	<button type="submit">SUBMIT</button>
</form:form>

<%@ include file="../JSPIncludes/footer.jsp"%>