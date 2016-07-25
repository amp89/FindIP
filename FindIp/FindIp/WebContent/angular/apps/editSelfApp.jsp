
	
	<script>
		var app = angular.module("editSelf",[]);
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