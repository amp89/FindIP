<%@ include file="../JSPIncludes/tags.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IP FIND | Search</title>


		<script src="js/jquery.js"></script>
		<script src="js/test.js"></script>
		<script src="angular/angular.min.js"></script>
</head>
<body>

<!-- nav here -->
${message}
<br>
<br>



<a href="index.do">Home</a> 
<c:if test="${!empty(user)}">
<a href="search.do">Search</a>
<c:if test="${user.userType.accessLevel >= 2}">
<a href="manageUsers.do">Manage Users</a> <!-- might take this out and put on dashboard - admin only -->
</c:if>
<a href="userDashboard.do">Dashboard</a>
<a href="logout.do">Logout</a>
</c:if>
