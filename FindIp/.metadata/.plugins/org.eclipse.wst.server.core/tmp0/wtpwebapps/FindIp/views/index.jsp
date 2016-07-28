<%@ include file="../JSPIncludes/headAndNav.jsp"%>

<div class="container">
	<div class="col-xs-12 col-md-offset-2 col-md-8 col-lg-offset-2 col-lg-8">
		<div class="col-xs-12" id="pageTitle">Welcome to FindIP</div>
		<form:form action="login.do" modelAttribute="userLogin">
			<div class="col-xs-12 col-md-4">
				Email:
			</div>
			
			<div class="col-xs-12 col-md-8">
						<form:input class="fill_div"  type="email" name="email" path="email" value="admin@fakemail.com" />
			</div>
			<div class="col-xs-12 col-md-4">
				Password:
			</div>
			<div class="col-xs-12 col-md-8">

						<form:input class="fill_div"  type="password" name="password"  path="password" value="password" />
			</div>
			
			<div class="col-xs-12">
				<button class="fill_div" type="submit">Sign In</button>
			</div>
			
		</form:form>
	
	<br><br><br><br>
	
			<div class="col-xs-12 text-center">
			<h3>Sign Up!</h3>
			</div>
			
			
			<form:form action="signup.do" modelAttribute="userLogin">
				<div class="col-xs-12 col-md-4">
					Email:
				</div>		
			
				<div class="col-xs-12 col-md-8">
					<form:input class="fill_div" type="email" name="email" path="email" value="fake@fakemail.com" />
				</div>
				<div class="col-xs-12 col-md-4">
					Password:
				</div>
				
				<div class="col-xs-12 col-md-8">
					<form:input class="fill_div"  type="password" name="password" path="password" required="required" />
				
				</div>
				<div class="col-xs-12">
					<button class="fill_div" type="submit">Sign Up</button>
				</div>
				<div class="col-xs-12">
				
					Sign up, then check your email for confirmation
				</div>
			
			</form:form>
			
			
				<br><br><br><br>
	
			<div class="col-xs-12 text-center">
			<h3>Reset Your Password</h3>
			</div>

			<div class="col-xs-12" ng-app="changePassword" ng-controller="editController">
				<form name="resetPasswordForm" ng-submit="resetPassword()">
				<div class="col-xs-12 col-md-2">
				Email:
				</div>
				<div class="col-xs-12 col-md-6">
				<input class="fill_div" ng-pattern="emailRegex" ng-minlength="4" ng-maxlength="45" ng-model="userData.email" required>
				</div>
				<div class="col-xs-12 col-md-4">
				<button class="fill_div" ng-disabled="resetPasswordForm.$invalid" type="submit">Reset Password</button>
				</div>
				<div class="col-xs-12">
				Click Reset Password, and then check your email.
				<!-- change this to a message after successful email -->
				</div>
				</form>
			</div>
			
			
	
	
	
	
	</div>

</div> <!-- container -->
<br><br>

<br><br>
	
	<script src="angular/apps/changePassword.js">
	</script>

<%@ include file="../JSPIncludes/footer.jsp"%>