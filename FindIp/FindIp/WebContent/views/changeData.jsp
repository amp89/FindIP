<%@ include file="../JSPIncludes/headAndNav.jsp"%>


<c:if test="${!empty(user) && user.userType.accessLevel > 0}">
	
	Self Update
	
	<!-- //get request to edit page with own id -->
	
	<div ng-app="showUserDataApp" ng-controller="userController">
		<c:if test="${user.userType.accessLevel < 2 }">
		Changing Email requires reconfirmation upon next login.
		</c:if>
		<form name="updateForm" ng-submit="updateData()">
		New Email:<input ng-pattern="emailRegex" ng-model="userData.email">
		New Password:<input ng-minlength="0" ng-maxlength="200" ng-model="userData.password">
		<button type="submit">Submit</button>
		</form>
		
		<div ng-show="resultMessage">{{resultMessage}}</div>
	</div>
	
	
	<script>
		var app = angular.module("showUserDataApp",[]);
		app.controller('userController',function($scope,$http){
			$scope.emailRegex = "^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
			$scope.userData = {};
			$scope.resultMessage = "";
			
				 
			$scope.getData = function(){
				 var getUrl = "rest/getFullLoggedInUserData/"+"${accessToken}";
			 
				console.log(getUrl);
				$http({
					method:"GET",
					url:getUrl,
					params : {"content-type":"text/plain","Accept" : "application/json"}
				}).then(function success(response){
					$scope.userData = response.data;
					console.log($scope.userData); //TODO remove
				},function error(response){
					console.log("User not found.");
				});
			 };
			 
			 $scope.getData();
			
			$scope.updateData = function(){
 				var updateData = {};
				
				updateData.id = $scope.userData.id;
				updateData.email = $scope.userData.email;
				updateData.password = $scope.userData.password;
				
				
				$http({
			
					method:"POST",
					url:"rest/editSelf",
					data:updateData,
					params : {"content-type":"application/json","Accept" : "application/json"}
				}).then(function success(response){
					console.log("EDITED :D "); //TODO remove
					//will this make refresh uncessesary???? TODO remove
					$scope.getData();
					$scope.resultMessage = "Updates saved.";
					
				}, function error(response){
					console.log("Not edited :("); //TODO remove
				});//end http
				
			};
			
			
			
			
		});
	</script>
</c:if>
</body>
</html>