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
		
	$.ajax({
		type : "GET",
//		url : "http://localhost:8080/AJAX/rest/ping",
		 url:"rest/getLoggedInUserData",
		 
		headers : {
			"Accept" : "application/json",
			"Content-Type" : "applicatoin/json"
		}
		// beforeSend: function(xhr) {
		// // xhr.setRequestHeader("Accept", "application/json");
		// xhr.setRequestHeader("Content-type", "application/json");
		// },
//		dataType : "json"
//		success: killme()
	}).done(function(data) {
		console.log(data);
	}).fail(function() {
		console.log("failed");
	});
	
	</script>
	<!-- end test rest call -->
	
	

		
	
</body>
</html>