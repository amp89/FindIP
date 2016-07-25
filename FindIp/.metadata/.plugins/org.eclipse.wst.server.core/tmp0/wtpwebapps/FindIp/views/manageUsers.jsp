<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 1}">


<br>
<br>
Manage Users:
<br>
<br>
<div ng-app="usersApp" ng-controller="userData">
	<form name="userSearchForm" ng-submit="searchForUsers()">
		Search for all or part of a user's email<br>
		Leave blank to return all users (may have a long load time)<br>
		<input name="ipAddress" ng-model="emailSearched"/><br>
		<button type="submit">Search Users</button>
	</form>


	<div ng-show="searchMessage">
	{{searchMessage}}
	</div>
	
	<div ng-show="searchCompleteFlag">
	Results Go Here ${accessToken}
	
	<ul>
		<li ng-repeat="userFound in userList">{{userFound}}
		<form name="userFoundForm" action="editUserPage.do">
			<input type="hidden" name="userToEditId" value="{{userFound.id}}" />
			<input type="hidden" name="accessToken" value="${accessToken}" />
			<button type="submit">Edit</button>	
		</form>
		</li>
	</ul>
	
	</div>

	<input type=hidden ng-model="accessToken" ng-init="${accessToken}" />


</div>


</c:if>

<%@ include file="../angular/apps/manageUsersApp.js"%>


</body>
</html>