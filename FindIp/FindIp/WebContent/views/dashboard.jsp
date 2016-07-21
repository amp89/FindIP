<%@ include file="../JSPIncludes/headAndNav.jsp"%>


<c:if test="${!empty(user) && user.userType.accessLevel > 0}">
	
	User Dashboard
	
	<div ng-app="showUserDataApp" ng-controller="userController">
	Your Saves:
	<ul>
		<li ng-repeat="s in userData.saves">
			<ul>
				<li>{{s.address.startIp}} to {{s.address.endIp}}</li>
				<li>{{s.address.city}}, {{s.address.region}}, {{s.address.countryName}} </li>
				<li>Lat: {{s.address.latitude}} Lon: {{s.address.longitude}}</li>
				<li>Comments
					<ul>
						<li ng-show="s.publicComment">{{s.publicComment}}</li>
						<li ng-show="s.privateComment">{{s.privateComment}}</li>
					</ul>
				</li>
				<li><button ng-click="deleteSave(s.id)">DELETE</button></li>
			</ul>
		</li>
	</ul>
	
	
	
	</div>
	
	<script>
		var app = angular.module("showUserDataApp",[]);
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
	</script>
</c:if>
</body>
</html>