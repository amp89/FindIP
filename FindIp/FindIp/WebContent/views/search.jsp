<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">

	<div ng-app="searchApp" ng-controller="searchForm">
	<div ng-submit="getIpInfo()">
	<br>
	Search
	<br><br>
		Enter an ip address <!-- <br>&nbsp;&nbsp;&nbsp;ex: x.x.x.x, xxx.xx.xx.xxx, xxx.xxx.xxx.xxx, and so on. -->
		<form  name="ipSearchForm">
			<input name="ipAddress" type="text" ng-pattern="regex" ng-minlength="7" ng-maxlength="15" ng-model=ipSearchData.ipAddress required/>
			<button type="submit" ng-disabled="ipSearchForm.$invalid">SEARCH {{ipSearchData.ipAddress}}</button>
		</form>
		<br>
		<span ng-hide="ipSearchForm.$invalid">Press SEARCH to find data.<br></span>
		<span ng-show="ipSearchForm.$invalid">Please use this format: 255.255.255.255<br></span>
	</div>
	<!-- end test angular -->
	
	<div ng-show="searchCompleteFlag">
		<br>
		<div ng-hide="ipResponseData">Not Found.</div>
		<div ng-show="ipResponseData">
		
		<h2>IP: {{ipResponseData.startIp}} to {{ipResponseData.endIp}}</h2>
		<h2>Location:</h2>
		<h3>{{ipResponseData.city}}, {{ipResponseData.region}}, {{ipResponseData.countryName}}</h3>
		<h3>Lat: {{ipResponseData.latitude}} Lon: {{ipResponseData.longitude}}</h3>
		<!-- to add: maybe logged in user's comments ?? maybe just leave that on the dashboard? -->
		<div ng-show="publicComments">
			<ul>Public Comments</ul>
				<li ng-repeat="(i,c) in publicComments">{{c}}</li>
		</div>
				
			<form name="ipSaveForm" ng-submit="saveIp()">
			
				Public Comment (Optional):<br>
				<textarea rows="5" cols="50" ng-maxlength="10000" name="publicComment" ng-model="ipSaveData.publicComment"></textarea><br>
				
				Private Comment (Optional):<br>
				<textarea rows="5" cols="50" ng-maxlength="10000"  name="privateComment" ng-model="ipSaveData.privateComment"></textarea><br>
			
				<button type="submit" ng-disabled="ipSaveForm.$invalid">Save this Ip</button>
				
				<span ng-show="ipSaveForm.$invalid">Please keep comment under 10000 characters.</span>
				<span ng-show="saveMessage">{{saveMessage}}</span>
			</form>
		
		</div>
		</div>
	</div>

	
	

		
	</c:if>
	
	
	<%@ include file="../angular/apps/searchApp.jsp"%>
</body>
</html>