<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<br>
USER (DEBUG): ${user}
<br>
Login

<form:form action="login.do" modelAttribute="userLogin">
	<table>
		<tr>
				<td>Email:</td>
				<td><form:input type="email" name="email" path="email" value="admin@fakemail.com" /></td>
		</tr>
		
		<tr>
				<td>Password:</td>
				<td><form:input type="password" name="password"  path="password" value="password" /></td>
		</tr>
		
		<tr>
		<td colspan="2"><button type="submit">Sign In</button></td>
		</tr>
	</table>
	
</form:form>

Signup


<form:form action="signup.do" modelAttribute="userLogin">
	<table>
		<tr>
				<td>Email:</td>
				<td><form:input type="email" name="email" path="email" value="fake@fakemail.com" /></td>
				<td><form:input type="password" name="password" path="password" required="required" /></td>
		</tr>	
		<tr>
		<td colspan="2"><button type="submit">Sign Up</button></td>
		</tr>
		<tr>
		<td colspan="2">Sign up, then check your email for confirmation</td>
		
		</tr>

	</table>
</form:form>


	<div ng-app="editUserApp" ng-controller="editController">
	
	<form name="resetPasswordForm" ng-submit="resetPassword()">
	<input ng-pattern="emailRegex" ng-minlength="4" ng-maxlength="45" ng-model="userData.email" required>
	<button ng-disabled="resetPasswordForm.$invalid" type="submit">Reset Password</button>
	//check your email msg here
	</form>
	</div>
	
	
	
	<script>
		var app = angular.module('editUserApp',[]);
		
		app.controller('editController',function($scope,$http){
			$scope.emailRegex = "^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

			
			$scope.userData = {};
			
			
			$scope.resetPassword = function(){
				console.log($scope.userData);
				
				//put userData in a different object to send
				var userEditData = {};
				userEditData.email = $scope.userData.email;
				
				$http({
					method:"POST",
					url:"rest/resetPassword",
					data:userEditData,
					params : {"content-type":"application/json","Accept" : "application/json"}
				}).then(function success(response){
					console.log("success :)"); //TODO remove
					//success message to page
					$scope.editMessage = "pwd send Successful.";
				},function error(response){
					console.log("failure :("); //TODO remove
					$scope.editMessage = "pwd send Failed.";
					
				});
			}; //reset password()

			
		});//edit controller
	</script>

</body>
</html>