<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 1}">

	<script>
	$(document).ready(function(){
		$("title").text("IpFind | Manage Users");
	});
	</script>

<div class="container">

	<div id="pageTitle" class="text-center">Manage Users</div>
	
		<div ng-app="usersApp" ng-controller="userData">
		<form name="userSearchForm" ng-submit="searchForUsers()">
			<div class="col-xs-12 text-center">
			Search for all or part of a user's email<br>
			Leave blank to return all users<br>			
			</div>
			<div class="col-xs-12 col-md-8 ">
			<input class="fill_div" name="ipAddress" ng-model="emailSearched"/><br>			
			</div>
			<div class="col-xs-12 col-md-4 center-block">
			<button class="fill_div"  type="submit">Search Users</button>
			
			</div>
		</form>
	
	
		<div class="col-xs-12" ng-show="searchMessage">
		{{searchMessage}}
		</div>
		
		
		
		<div class="col-xs-12" ng-show="searchCompleteFlag">
		
			<div class="col-xs-12 user-result" ng-repeat="userFound in userList">
				<div class="col-xs-12 col-md-6">ID {{userFound.id}}</div>
				<div class="col-xs-12 col-md-6">EMAIL: {{userFound.email}}</div>
				<div class="col-xs-12 col-md-6">PASSWORD: {{userFound.password}}</div>
				<div class="col-xs-12 col-md-6">CONF ID: {{userFound.confirmation_id}}</div>
				<div class="col-xs-12 col-md-6">FAILED LOGINS: {{userFound.failedLogins}}</div>
				<div class="col-xs-12 col-md-6"># OF SAVES: {{userFound.saves.length}}</div>
				<div class="col-xs-12 col-md-6">ACCOUNT TYPE: {{userFound.userType.name}}</div>
				<div class="col-xs-12 col-md-6">ACCESS LEVEL:S {{userFound.userType.accessLevel}}</div>
			<form name="userFoundForm" action="editUserPage.do">
				<input type="hidden" name="userToEditId" value="{{userFound.id}}" />
				<input type="hidden" name="accessToken" value="${accessToken}" />
				<button class="fill_div" type="submit">Edit</button>	
			</form>
			</div>
		
		</div>
	
		<input type=hidden ng-model="accessToken" ng-init="${accessToken}" />
	
	
	
	
	
	
	
	




</div> <!-- container -->
</c:if>

<%@ include file="../angular/apps/manageUsersApp.js"%>

<%@ include file="../JSPIncludes/footer.jsp"%>