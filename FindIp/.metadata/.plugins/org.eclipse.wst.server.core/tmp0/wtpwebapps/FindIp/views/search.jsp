<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IP FIND | Search</title>


		<script src="js/jquery.js"></script>
		<script src="js/test.js"></script>
		<script src="angular/angular.min.js"></script>
</head>
<body ng-app="searchApp">
	<div ng-controller="searchForm">
		<form ng-submit="getIpInfo()">
			<input ng-maxlength="3" placeholder="Enter IP" name="first" ng-model="ipSearchData.first" required/>.
			<input type="text" placeholder="Enter IP" name="second"  ng-model="ipSearchData.second" required/>.
			<input type="text" placeholder="Enter IP" name="third"  ng-model="ipSearchData.third" required/>.
			<input type="text" placeholder="Enter IP" name="fourth"  ng-model="ipSearchData.fourth" required/>
			<button type="submit">SEARCH</button>
		</form>
		TO Search: <span ng-show="ipSearchData.first">{{ipSearchData.first}}</span><span ng-show="ipSearchData.second">.{{ipSearchData.second}}</span><span ng-show="ipSearchData.third">.{{ipSearchData.third}}</span><span ng-show="ipSearchData.fourth">.{{ipSearchData.fourth}}</span>
	</div>
	<!-- end test angular -->
	
	<!-- test rest call -->
	<script>
	/* old way		
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
		//request her/*  */e TODO
		$scope.ipSearchData = {};
		
		$scope.ipSearchData.accessToken="${accessToken}"
		
		//$scope.ipSearchData.accessToken = 'testjlskjfdlsdkfj';
		$scope.getIpInfo = function(){
			console.log("IP: " + $scope.ipSearchData);
			
			$http({
				method:"POST",
				url:"rest/getIpData",
				data:$scope.ipSearchData,
				params : {"content-type":"application/json","Accept" : "application/json"}
			}).then(function success(response){
				console.log("Post Ip search :)");
			}, function error(response){
				console.log("No post search :(");
			});//end http
			
		};//end get info
		
		
	});
	
	
	
	
	
	</script>
	<!-- end test rest call -->
	
	

		
	
</body>
</html>