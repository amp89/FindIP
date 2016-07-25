
		var app = angular.module("userDataApp",[]);
		app.controller('userController',function($scope,$http){
			/* $scope.getUserData = {};
			$scope.getUserData.accessToken = "${accessToken}";
			 */
			
			 
			$scope.getData = function(){
				 var getUrl = "rest/getLoggedInUserData/"+"${accessToken}";
			 
				console.log(getUrl);
				$scope.userData = {};
				$http({
					method:"GET",
					url:getUrl,
					params : {"content-type":"text/plain","Accept" : "application/json"}
				}).then(function success(response){
					$scope.userData = response.data;
					console.log($scope.userData); //TODO remove
				},function error(response){
					console.log("User not found.")
				});
			 };
			 
			 $scope.getData();
			
			$scope.deleteSave = function(saveId){
				console.log(saveId);
				var saveData = {};
				saveData.saveId = saveId;
				saveData.userId = $scope.userData.id;
				saveData.accessToken = "${accessToken}";
				
				$http({
			
					method:"POST",
					url:"rest/deleteSave",
					data:saveData,
					params : {"content-type":"application/json","Accept" : "application/json"}
				}).then(function success(response){
					console.log("DELETEDDDDDD :D "); //TODO remove
					//will this make refresh uncessesary???? TODO remove
					$scope.getData();

					
				}, function error(response){
					console.log("No DELETED :("); //TODO remove
				});//end http
				
			};
			
			
			
			
		});