<script>
var app = angular.module('usersApp',[]);
	
	app.controller('userData', function($scope,$http){
		$scope.searchCompleteFlag = false;
		$scope.userList = [];
		$scope.searchMessage = "";
		$scope.emailSearched = "";
		$scope.accessToken = "${accessToken}";
		console.log("loaded");//TODO remove
		console.log($scope.accessToken);
		//Error is here,, .then is not a function
		
		$scope.searchForUsers = function(){
			console.log("searching"); //TODO remove
			console.log("email query: " + $scope.emailSearched); //TODO remove
			var getUrl = "";
			if($scope.emailSearched.length > 0){
				getUrl = "rest/searchUsers/" + $scope.emailSearched + "/" + $scope.accessToken;
			}else{
				getUrl = "rest/searchUsers/" + $scope.accessToken;
			}
			console.log("HTTP request: " + getUrl); //TODO remove
			$http({
				method:"GET",
				url: getUrl,
				params : {"content-type":"application/json","Accept" : "application/json"}
			}).then(function success(response){
				console.log("Search success :)"); //TODO remove
				$scope.searchCompleteFlag = true;
				$scope.userList = response.data;
				$scope.searchMessage = response.data.length  + " results found."
				console.log($scope.userList);
			
			},function error(response){
				console.log("Search success :)"); //TODO remove
				$scope.searchCompleteFlag = false;
				$scope.searchMessage = "Search failed.";
	
			}); //http
			
		};//searchUsers()
		
		$scope.editUser = function(){
			$scope.editReturnMsg = "";
			$http({
				method:"POST",
				url:"rest/editUser",
				params : {"content-type":"application/json","Accept" : "application/json"}
				
			}).then(function success(response){
				console.log("Edit Success :)");// TODO remove
				$scope.editReturnMsg = "EDIT SUBMITTED."
			},function error(response){
				console.log("FAILURE.");
			});//http
			
			
			console.log("editUser");
		}//editUser
		
		$scope.deleteUser = function(){
			console.log("deleteUser");
			
		}
		
	}); //controllerApp

</script>