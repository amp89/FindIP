<%@ include file="../JSPIncludes/headAndNav.jsp"%>

<br><br>
	<script>
	$(document).ready(function(){
		$("title").text("IpFind | My Stuff");
	});
	</script>

<c:if test="${!empty(user) && user.userType.accessLevel > 0}">
	
<div class="container">
	<div class="col-xs-12 col-md-offset-2 col-md-8 col-lg-offset-2 col-lg-8">
	<div id="pageTitle" class="text-center">Dashboard</div>
	
	<div class="col-xs-12 text-center">
		<a href="updateAccount.do">Change Your Email or Password</a>
	</div>

	
	
	<div ng-app="userDataApp" ng-controller="userController">
		<h2>Your Saves:</h2>
			<div class="col-xs-12 col-md-6 save-result" ng-repeat="s in userData.saves">
				<ul>
					<li>Address range: {{s.address.startIp}} to {{s.address.endIp}}</li>
					<li>Location: {{s.address.city}}, {{s.address.region}}, {{s.address.countryName}} </li>
					<li>Lat: {{s.address.latitude}} Lon: {{s.address.longitude}}</li>
					<li ng-show="s.publicComment || s.privateComment">Comments:
						<ul ng-show="s.publicComment">Public:
							<li ng-show="s.publicComment">{{s.publicComment}}</li>
						</ul>
						<ul ng-show="s.privateComment">Public:
							<li ng-show="s.privateComment">{{s.privateComment}}</li>
						</ul>
					</li>
				</ul>
					<button class="fill_div" ng-click="deleteSave(s.id)">DELETE</button>
			</div>
		
	
	
	</div>
	
	</div>

</div>
	

	
<%@ include file="../angular/apps/userDataApp.jsp"%>

</c:if>
<%@ include file="../JSPIncludes/footer.jsp"%>