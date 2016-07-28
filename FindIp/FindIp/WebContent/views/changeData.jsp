<%@ include file="../JSPIncludes/headAndNav.jsp"%>

<script>
$(document).ready(function(){
	$("title").text("IpFind | Update Your Account");
});
</script>

<c:if test="${!empty(user) && user.userType.accessLevel > 0}">
	<br><br>
	Self Update
	
	<!-- //get request to edit page with own id -->
	
	<div ng-app="editSelf" ng-controller="userController">
		<c:if test="${user.userType.accessLevel < 2 }">
		Changing Email requires reconfirmation upon next login.
		</c:if>
		<form name="updateForm" ng-submit="updateData()">
		New Email:<input ng-pattern="emailRegex" ng-model="userData.email"><br>
		New Password:<input ng-minlength="0" ng-maxlength="200" ng-model="userData.password"><br>
		<button type="submit">Submit</button><br>
		</form>
		
		<div ng-show="resultMessage">{{resultMessage}}</div>
	</div>
	
</c:if>


<%@ include file="../angular/apps/editSelfApp.jsp"%>
<%@ include file="../JSPIncludes/footer.jsp"%>