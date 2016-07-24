<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">  <%-- 0 and not 1, users need to access this page to modify their own accounts --%>

	<div ng-app="editUserApp" ng-controller="editController">
	
		<form name="userEditForm" ng-submit="submitEdits()" ng-show="userExists">
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
	
	
	
	<script>
		var app = angular.module('editUserApp',[]);
		
		app.controller('editController',function($scope,$http){
			$scope.emailRegex = "^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

			var getUrl = "rest/getUserData/${userToEditId}/${accessToken}";
			
			$scope.userData = {}
			$scope.userExists = false;
			
			
			$scope.submitEdits = function(){
				console.log($scope.userData);

				//put userData in a different object to send
				$scope.userEditData = {};
				$scope.userEditData.id = $scope.userData.id;
				$scope.userEditData.email = $scope.userData.email;
				$scope.userEditData.password = $scope.userData.password;				
				$scope.userEditData.failedLogins = $scope.userData.failedLogins;				
				$scope.userEditData.accessLevel = $scope.userData.userType.accessLevel;
				
				$http({
					method:"POST",
					url:"rest/editUser",
					data:$scope.userEditData,
					params : {"content-type":"application/json","Accept" : "application/json"}
				}).then(function success(response){
					console.log("success :)"); //TODO remove
					//success message to page
					$scope.editMessage = "Edit Successful.";
				},function error(response){
					console.log("failure :("); //TODO remove
					$scope.editMessage = "Edit Failed.";
					
				});
			}; //submitEdits()
			
			$scope.deleteUser = function(){
				console.log($scope.userData.id);
				var userToDelete = {};
				userToDelete.id = $scope.userData.id;
				$http({
					method:"POST",
					url:"rest/deleteUser",
					data:userToDelete,
					params : {"content-type":"application/json","Accept" : "application/json"}
				}).then(function success(response){
					console.log("success :)"); //TODO remove
					$scope.userExists = false;
					//success message to page
					$scope.editMessage = "Delete Successful.";
				},function error(response){
					console.log("failure :("); //TODO remove
					$scope.editMessage = "Delete Failed.";
					
				});
			}
	
			
		});//edit controller
	</script>

</c:if>

</body>
</html>