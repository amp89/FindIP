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
	
	<div ng-app>
	
	<!-- test angular-->
	<input type="text" placeholder="type stuff" ng-model="name" />
	<h3 ng-show="name">{{name}}</h3>
	<h4>{{"HELLO WORLD - ANGULAR"}}</h4>
		</div>
	<!-- end test angular -->
	
	<!-- test rest call -->
	<script>
		
		$.getJSON("rest/getLoggedInUserData",null,function(data){
			console.log(data);
		})
	
	</script>
	<!-- end test rest call -->
	
	

		
	
</body>
</html>