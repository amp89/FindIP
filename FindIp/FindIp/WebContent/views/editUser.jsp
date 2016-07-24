<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">  <%-- 0 and not 1, users need to access this page to modify their own accounts --%>

	<div ng-app="editUserApp" ng-controller="editController">
	
		<form ng-submit="submitEdits()">
			${userToEdit.id}<br>
			<input ng-pattern="emailRejex" name="email" ng-model="userData.email" required/><br>
			<input type="text" name="password" ng-model="userData.password" required/><br>
			<input type="number" min="0" max="6" name="failedLogins" ng-model="userData.failedLogins" required /><br>
			( 5 failed logins will lock the account )<br>
			User? <input type="radio" value="1" ng-model="userData.userType.userTypeId" /><br>
			Admin? <input type="radio" value="2" ng-model="userData.userType.accessLevel" /><br>
			<button type="submit">SUBMIT EDIT</button>
			
				
		</form>
	
	</div>
	
	
	
	<script>
		var app = angular.module('editUserApp',[]);
		
		app.controller('editController',function($scope,$http){
			$scope.emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$";

			var getUrl = "rest/getUserData/${userToEditId}/${accessToken}";
			
			$http({
				method:"GET",
				url:getUrl,
				params : {"content-type":"text/plain","Accept" : "application/json"}
			}).then(function success(response){
				console.log("WORKED :)"); //TODO remove
				console.log(response.data); //TODO remove
			},function error(response){
				console.log("Failed :("); //TODO remove
				
			});	
		
		
			
			//will pass updatable fields (email, password, account type) to the controller on post
			$scope.userData = {};
			

			$scope.userData.email = "${userToEdit.email}";
			$scope.userData.id = "${userToEdit.id}";
			$scope.userData.failedLogins = "${userToEdit.failedLogins}";
			$scope.userData.password = "${userToEdit.password}";
			$scope.userData.userTypeId = "${userToEdit.userType.id}";
			
			$scope.submitEdits = function(){
				console.log(userData);
				//Http stuff here.
			};
	
			
		});
	</script>

</c:if>

</body>
</html>