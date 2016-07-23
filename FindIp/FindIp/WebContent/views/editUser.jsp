<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div ng-app="editUserApp" ng-controller="editForm">

	<form ng-submit="submitEdits()">
		${userToEdit.id}<br>
		<input ng-pattern="emailRejex" ng-model="userData.email" required/>
		
			
	</form>

</div>
<script>
	var app = angular.module('editUserApp',[]);
	
	app.controller('editFrom',function($scope,$http){
		$scope.emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$";
		
		//will pass updatable fields (email, password, account type) to the controller on post
		$scope.userData = {};
		$scope.userData.email = "${userToEdit.email}";
		$scope.userData.id = "${userToEdit.id}";
		
		$scope.submitEdits = function(){
			console.log(userData);
			//Http stuff here.
		};

		
	});
</script>
</body>
</html>