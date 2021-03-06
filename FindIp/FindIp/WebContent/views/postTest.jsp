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
<body>
	HELLO WORLD
	
<!-- 	<div ng-app>
	
	test angular
	<input type="text" placeholder="type stuff" ng-model="name" />
	<h3 ng-show="name">{{name}}</h3>
	<h4>{{"HELLO WORLD - ANGULAR"}}</h4>
		</div>
	end test angular -->
	<div ng-app="formApp"  ng-controller="formController">
		
		<form ng-submit="processForm()"  >
		<label>EMAIL:</label>
		<input type="text" name="email" ng-model="formData.email"/>
		
		<label>Password:</label>
		<input type="text" name="password" ng-model="formData.password"/>

		<button type="submit">SUBMIT</button>
		
		</form>
		
		<pre>
			DATA TO SUBMIT: {{formData}}
		</pre>
	
	</div>


	<script>
	
		
	//try in angular
	var app = angular.module('myApp',[]);
	
	app.controller('myController',function($scope,$http){
		$http({
			method: "GET",
			url: "rest/getLoggedInUserData"
		}).then(function success(response){
			$scope.stuff = response.data;
			console.log("angular get response: " + response.data.email);
		}, function error(response){
			$scope.stuff = response.statusText;
			console.log("angular get response: " + response.statusText);
		})
		
	});
	
	var formApp = angular.module("formApp", []);
	
	formApp.controller("formController",function($scope,$http){
		$scope.formData = {};
		$scope.processForm = function(){
			console.log("processing: " + $.param($scope.formData));
			
			$http({
				method: "POST",
				url: "rest/testPostPath",
				data : $scope.formData,
				//data : {"email":"work@now.please","password":"sdkjflsdfj"},
				//data : {"email":formData.email,"password":formData.password},
				headers : {"content-type":"application/json","Accept" : "application/json"}

			}).then(function success(response){
				$scope.stuff = response.data;
				console.log("yay.  :) angular get response: " + response.data);
			}, function error(response){
				$scope.stuff = response.statusText;
				console.log("fail. :( angular get response: " + response.statusText);
			})
			
			
			
		};
		
		
		
	});
	
	
	
	

	
	</script>
	
	
	
	<!-- end test rest call -->
	
	

	<div ng-app="myApp" ng-controller="myController">
	</div>

		
	
</body>
</html>