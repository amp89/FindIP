
	<script>
		var app = angular.module('editUserApp',[]);
		
		app.controller('editController',function($scope,$http){
			$scope.emailRegex = "^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

			var getUrl = "rest/getUserData/${userToEditId}/${accessToken}";
			
			$scope.userData = {}
			$scope.userExists = false;
			
			$http({
 				method:"GET",
 				url:getUrl,
 				params : {"content-type":"text/plain","Accept" : "application/json"}
 			}).then(function success(response){
 				console.log("WORKED :)"); //TODO remove
 				console.log(response.data); //TODO remove
				$scope.userExists = true;
 				$scope.userData = response.data;
 			},function error(response){
 				console.log("Failed :("); //TODO remove
 				
 			});	
			
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