<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 1}">


IM A MANAGE STUFF PAGE

<div ng-app="usersApp" ng-controller="userData">
	<form name="userSearchForm" ng-submit="searchForUsers()">
		Search for all or part of a user's email<br>
		Leave blank to return all users (may have a long load time)<br>
		<input name="ipAddress" ng-model="emailSearched"/><br>
		<button type="submit">Search Users</button>
	</form>


	<div ng-show="searchMessage">
	{{searchMessage}}
	</div>
	
	<div ng-show="searchCompleteFlog">
	
	</div>



</div>

<script>
	var app = angular.module('usersApp',[]);
	
	app.controller('userData', function($scope,$http){
		$scope.searchCompleteFlag = false;
		$scope.userList = [];
		$scope.searchMessage = "";
		$scope.emailSearched = "";
		console.log("loaded");//TODO remove
		
		//Error is here,, .then is not a function
		
		$scope.searchForUsers = function(){
			console.log("searching"); //TODO remove
			console.log("email query: " + $scope.emailSearched); //TODO remove
			
			var getUrl = "rest/searchUsers/" + $scope.emailSearched + "/${accessToken}";
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
		
	});

</script>

</c:if>
</body>
</html>