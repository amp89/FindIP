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
						<!-- ??make this get entire list?? -->
						<li ng-show="s.privateComment">{{s.privateComment}}</li>
					</ul>
				</li>
s
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
			
		});
	</script>
</c:if>
</body>
</html>