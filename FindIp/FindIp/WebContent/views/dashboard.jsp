<%@ include file="../JSPIncludes/headAndNav.jsp"%>


<c:if test="${!empty(user) && user.userType.accessLevel > 0}">
	
	User Dashboard
	
	<div ng-app="showUserDataApp" ng-controller="userController">
	
	
	
	
	</div>
	
	<script>
		var app = angular.module("showUserDataApp",[]);
		app.controller('userController',function($scope,$http){
			/* $scope.getUserData = {};
			$scope.getUserData.accessToken = "${accessToken}";
			 */
			$scope.userData = {};
			$http({
				method:"GET",
				url:"rest/getLoggedInUserData/"+"${accessToken}",
				params : {"content-type":"text/plain","Accept" : "application/json"}
			}).then(function success(response){
				$scope.userData = response.data;
				console.log($scope.userData); //TODO remove
			},function error(response){
				console.log("User not found.")
			});
			
		});
	</script>
</c:if>
</body>
</html>