<%@ include file="../JSPIncludes/headAndNav.jsp"%>

	<script>
	$(document).ready(function(){
		$("title").text("IpFind | Edit User");
	});
	</script>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">  <%-- 0 and not 1, users need to access this page to modify their own accounts --%>

	<div ng-app="editUserApp" ng-controller="editController" ng-show="userExists">
	
		<form name="userEditForm" ng-submit="submitEdits()">
			User Id: ${userToEdit.id}<br>
			Email: <input ng-pattern="emailRegex" ng-minlength="5" ng-maxlength="45" name="email" ng-model="userData.email" required/><br>
			Password: <input type="text" ng-minlength="0" ng-maxlength="200" name="password" ng-model="userData.password" required/><br>
			Failed Login Attempts: <input type="number" min="0" max="6" name="failedLogins" ng-model="userData.failedLogins" required /><br>
			&nbsp;&nbsp;&nbsp;&nbsp;( 5 failed logins will lock the account )<br>
			Account Type: 
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="1" ng-model="userData.userType.accessLevel" /> User<br>
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="2" ng-model="userData.userType.accessLevel" /> Admin<br>
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="0" ng-model="userData.userType.accessLevel" /> Unauthorized<br>
			
			<button type="submit" ng-disabled="userEditForm.$invalid">SUBMIT EDIT</button>
				
		</form>
			<button ng-click="deleteUser()">Delete...</button>
		{{userEditForm.$invalid}}
		<span ng-show="userEditForm.$invalid">Please enter valid data</span><br>
		<span ng-show="editMessage">{{editMessage}}</span>
	</div>
	
	

</c:if>

	<%@ include file="../angular/apps/editUser.jsp"%>
<%@ include file="../JSPIncludes/footer.jsp"%>