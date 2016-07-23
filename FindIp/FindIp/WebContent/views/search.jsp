<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">

	<div ng-app="searchApp" ng-controller="searchForm">
	<div ng-submit="getIpInfo()">
		Enter a valid ip address, <!-- <br>&nbsp;&nbsp;&nbsp;ex: x.x.x.x, xxx.xx.xx.xxx, xxx.xxx.xxx.xxx, and so on. -->
		<form  name="ipSearchForm">
			<input name="ipAddress" type="text" ng-pattern="regex" ng-minlength="7" ng-maxlength="15" ng-model=ipSearchData.ipAddress required/>
			<button type="submit" ng-disabled="ipSearchForm.$invalid">SEARCH</button>
		</form>
		<span ng-hide="ipSearchForm.$invalid">Ip To Lookup: {{ipSearchData.ipAddress}}.  Press SEARCH to find data.</span>
		<span ng-show="ipSearchForm.$invalid">Please use this format: 255.255.255.255</span>
	</div>
	<!-- end test angular -->
	
	<div ng-show="searchCompleteFlag">
		<div ng-hide="ipResponseData">Not Found.</div>
		<div ng-show="ipResponseData">
		
		<h2>IP: {{ipResponseData.startIp}} to {{ipResponseData.endIp}}</h2>
		<h2>Location:</h2>
		<h3>{{ipResponseData.city}}, {{ipResponseData.region}}, {{ipResponseData.countryName}}</h3>
		<h3>Lat: {{ipResponseData.latitude}} Lon: {{ipResponseData.longitude}}</h3>
		<!-- ng repeat public comments -->
		
			<form name="ipSaveForm" ng-submit="saveIp()">
			
				Public Comment (Optional):<br>
				<textarea rows="5" cols="50" ng-maxlength="10000" name="publicComment" ng-model="ipSaveData.publicComment"></textarea><br>
				
				Private Comment (Optional):<br>
				<textarea rows="5" cols="50" ng-maxlength="10000"  name="privateComment" ng-model="ipSaveData.privateComment"></textarea><br>
			
				<button type="submit" ng-disabled="ipSaveForm.$invalid">Save!</button>
				<span ng-show="ipSaveForm.$invalid">Please keep comment under 10000 characters.</span>
				<span ng-show="saveMessage">{{saveMessage}}</span>
			</form>
		
		</div>
		</div>
	</div> <!-- //app -->
	<!-- test rest call -->
	<script>
/* 	 old way		
	$.ajax({
		type : "GET",
		 url:"rest/getLoggedInUserData", 
		headers : {
			"Accept" : "application/json",
			"Content-Type" : "applicatoin/json"
		}
	}).done(function(data) {
		console.log(data);
		$scope.userObject = data;
	}).fail(function() {
		console.log("failed");
	}); */
	
	var app = angular.module('searchApp',[]);
	
	
	app.controller('searchForm',function($scope,$http){
		
		$scope.regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
		
		//request her/*  */e TODO
		$scope.ipSearchData = {};
		$scope.ipResponseData = {};
		$scope.ipSaveData = {};
		$scope.saveMessage = "";
		
		$scope.searchCompleteFlag = false;
		
		$scope.ipSearchData.accessToken="${accessToken}"
		
		//$scope.ipSearchData.accessToken = 'testjlskjfdlsdkfj';
		$scope.getIpInfo = function(){
			console.log("IP: " + $scope.ipSearchData); //TODO remove
			
			$http({
				method:"POST",
				url:"rest/getIpData",
				data:$scope.ipSearchData,
				params : {"content-type":"application/json","Accept" : "application/json"}
			}).then(function success(response){
				console.log("Post Ip search :)"); //TODO remove
				console.log(response.data); //TODO remove
				$scope.searchCompleteFlag = true;
				$scope.ipResponseData = response.data;
				
			}, function error(response){
				console.log("No post search :("); //TODO remove
			});//end http
			
		};//end get info
		
		$scope.saveIp = function(){
			console.log("save: " + $scope.ipSaveData)
			$scope.ipSaveData.userId = "${user.id}";
			$scope.ipSaveData.ipId = $scope.ipResponseData.id;
			$scope.ipSaveData.accessToken = "${accessToken}";
			
			$http({
				method:"POST",
				url:"rest/saveIp",
				data:$scope.ipSaveData,
				params : {"content-type":"application/json","Accept":"application/json"}
			}).then(function success(response){
				console.log("SUCCESS POST :)")  //TODO remove
				console.log(response.data);
				$scope.ipSaveData.publicComment = "";
				$scope.ipSaveData.privateComment = "";
				//$scope.saveMessage = response.data.message;
				$scope.saveMessage = "Save successful!";
				//save message TODO 
			},function error(response){
				$scope.saveMessage = "Save Successful";
				console.log("NO SUCCESS POST :(")  //TODO remove
				$scope.saveMessage = "Save Error!";
				//save message TODO 
				
			});
		};//end saveIp()
		
		
	});
	
	
	
	
	
	</script>
	<!-- end test rest call -->
	
	

		
	</c:if>
</body>
</html>