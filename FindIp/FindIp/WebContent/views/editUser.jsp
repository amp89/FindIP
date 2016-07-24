<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">  <%-- 0 and not 1, users need to access this page to modify their own accounts --%>

	<div ng-app="editUserApp" ng-controller="editController">
	
		<form ng-submit="submitEdits()">
			${userToEdit.id}<br>
			<input ng-pattern="emailRejex" name="email" ng-model="userData.email" required/><br>
			<input type="text" name="password" ng-model="userData.password" required/><br>
			<input type="number" min="0" max="6" name="failedLogins" ng-model="userData.failedLogins" required /><br>
			( 5 failed logins will lock the account )<br>
			User? <input type="radio" value="1" ng-model="userData.userType.accessLevel" /><br>
			Admin? <input type="radio" value="2" ng-model="userData.userType.accessLevel" /><br>
			<button type="submit">SUBMIT EDIT</button>
			
				
		</form>
	
	</div>
	
	
	
	<script>
		var app = angular.module('editUserApp',[]);
		
		app.controller('editController',function($scope,$http){
			$scope.emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$";

			var getUrl = "rest/getUserData/${userToEditId}/${accessToken}";
			
			$scope.userData = {}
			
			$http({
				method:"GET",
				url:getUrl,
				params : {"content-type":"text/plain","Accept" : "application/json"}
			}).then(function success(response){
				console.log("WORKED :)"); //TODO remove
				console.log(response.data); //TODO remove
				$scope.userData = response.data;
			},function error(response){
				console.log("Failed :("); //TODO remove
				
			});	
		
		

			$scope.submitEdits = function(){
				console.log($scope.userData);
				//Http stuff here.
				$http({
					method:"POST",
					url:"rest/editUser",
					data:$scope.userData,
					params : {"content-type":"text/plain","Accept" : "application/json"}
				}).then(function success(response){
					console.log("success :)"); //TODO remove
					//success message to page
				},function error(response){
					console.log("failure :("); //TODO remove
					
				});
			};
	
			
		});
	</script>

</c:if>

</body>
</html>