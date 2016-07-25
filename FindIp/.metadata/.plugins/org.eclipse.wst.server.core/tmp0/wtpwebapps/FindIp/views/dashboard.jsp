<%@ include file="../JSPIncludes/headAndNav.jsp"%>

<br><br>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">
	
	Dashboard
	<br>
	<br>
	<a href="updateAccount.do">Change Email or Password</a>
	<br>
	<br>
	
	
	<div ng-app="userDataApp" ng-controller="userController">
	Your Saves:
	<ul>
		<li ng-repeat="s in userData.saves">
			<ul>
				<li>{{s.address.startIp}} to {{s.address.endIp}}</li>
				<li>{{s.address.city}}, {{s.address.region}}, {{s.address.countryName}} </li>
				<li>Lat: {{s.address.latitude}} Lon: {{s.address.longitude}}</li>
				<li>Comments
					<ul>
						<li ng-show="s.publicComment">{{s.publicComment}}</li>
						<li ng-show="s.privateComment">{{s.privateComment}}</li>
					</ul>
				</li>
				<li><button ng-click="deleteSave(s.id)">DELETE</button></li>
			</ul>
		</li>
	</ul>
	
	
	
	</div>
	
	<script src="angular/apps/userDataApp.js">
	</script>
</c:if>
</body>
</html>