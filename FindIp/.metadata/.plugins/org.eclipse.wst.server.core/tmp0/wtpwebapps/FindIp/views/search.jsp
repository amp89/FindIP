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
<body ng-app="searchApp"  ng-controller="searchForm">
	<div ng-submit="getIpInfo()">
		Enter a valid ip address, <!-- <br>&nbsp;&nbsp;&nbsp;ex: x.x.x.x, xxx.xx.xx.xxx, xxx.xxx.xxx.xxx, and so on. -->
		<form  name="ipSearchForm">
			<input name="ipAddress" type="text" ng-pattern="regex" ng-minlength="7" ng-maxlength="15" ng-model=ipSearchData.ipAddress required/>
			<button type="submit" ng-disabled="ipSearchForm.$invalid">SEARCH</button>
		</form>
		<span ng-hide="ipSearchForm.$invalid">Ip To Lookup: {{ipSearchData.ipAddress}}</span>
		<span ng-show="ipSearchForm.$invalid">Please use this format: 255.255.255.255</span>
	</div>
	<!-- end test angular -->
	
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