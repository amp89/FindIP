var app = angular.module('changePassword',[]);
		
		app.controller('editController',function($scope,$http){
			$scope.emailRegex = "^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

			
			$scope.userData = {};
			
			
			$scope.resetPassword = function(){
				console.log($scope.userData);
				
				//put userData in a different object to send
				var userEditData = {};
				userEditData.email = $scope.userData.email;
				
				$http({
					method:"POST",
					url:"rest/resetPassword",
					data:userEditData,
					params : {"content-type":"application/json","Accept" : "application/json"}
				}).then(function success(response){
					console.log("success :)"); //TODO remove
					//success message to page
					$scope.editMessage = "pwd send Successful.";
				},function error(response){
					console.log("failure :("); //TODO remove
					$scope.editMessage = "pwd send Failed.";
					
				});
			}; //reset password()

			
		});//edit controller