<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">
	<script>
	$(document).ready(function(){
		$("title").text("IpFind | Search");
	});
	</script>
<div class="container">
	<div class="col-xs-12 col-md-offset-2 col-md-8 col-lg-offset-2 col-lg-8">
	<div id="pageTitle" class="text-center">Search</div>
	
		<div ng-app="searchApp" ng-controller="searchForm">
		<div ng-submit="getIpInfo()">
			<form  name="ipSearchForm">
			
			<div class="col-xs-12 text-center">
			Enter an IP address and then press SEARCH.
			<br><br>
			</div>
			
			<div class="col-xs-12 col-md-8 ">
				<input class="fill_div" name="ipAddress" type="text" ng-pattern="regex" ng-minlength="7" ng-maxlength="15" ng-model=ipSearchData.ipAddress required/>					
			
			</div>
			<div class="col-xs-12 col-md-4 center-block">

				<button class="fill_div" type="submit" ng-disabled="ipSearchForm.$invalid">SEARCH {{ipSearchData.ipAddress}}</button>								


			</div>
			<div class="col-xs-12 text-center">
			
				<span ng-hide="ipSearchForm.$invalid">You have entered a valid IP address. Press search to continue.<br></span>
				<span ng-show="ipSearchForm.$invalid">Please use this format: 255.255.255.255<br></span>			
			</div>


			</form>
			<br>
		</div>
		<!-- end test angular -->
		
		<div ng-show="searchCompleteFlag" class="col-xs-12 col-md-offset-1 col-md-10 col-lg-offset-3 col-lg-6">
			<br>
			<div ng-hide="ipResponseData">Not Found.</div>
			<div ng-show="ipResponseData">
			
			<h2>IP: {{ipResponseData.startIp}} to {{ipResponseData.endIp}}</h2>
			<h2>Location:</h2>
			<h3>{{ipResponseData.city}}, {{ipResponseData.region}}, {{ipResponseData.countryName}}</h3>
			<h3>Lat: {{ipResponseData.latitude}} Lon: {{ipResponseData.longitude}}</h3>
			<!-- to add: maybe logged in user's comments ?? maybe just leave that on the dashboard? -->
			<div ng-show="publicComments">
				<h3>Public Comments</h3>
				<ul>
					<li ng-repeat="(i,c) in publicComments" ng-show="c.comment"><h4>{{c.comment}}</h4></li>
				</ul>
			</div>
					
				<form name="ipSaveForm" ng-submit="saveIp()">
				
					Public Comment (Optional):<br>
					<textarea class="fill_div" rows="5" cols="50" ng-maxlength="10000" name="publicComment" ng-model="ipSaveData.publicComment"></textarea><br>
					
					Private Comment (Optional):<br>
					<textarea class="fill_div" rows="5" cols="50" ng-maxlength="10000"  name="privateComment" ng-model="ipSaveData.privateComment"></textarea><br>
				
					<button class="fill_div" type="submit" ng-disabled="ipSaveForm.$invalid">Save this Ip</button>
					
					<span ng-show="ipSaveForm.$invalid">Please keep comment under 10000 characters.</span>
					<span ng-show="saveMessage">{{saveMessage}}</span>
				</form>
			
			</div>
			<div col="xs-col-12 credit text-center">All IP data from <a href="http://www.ip2location.com"> IP2LOCATION </a></div>
			</div><!-- result -->
		</div> <!-- end app -->
	
	</div>


</div>
	

		
	</c:if>
	
	
	<%@ include file="../angular/apps/searchApp.jsp"%>
<%@ include file="../JSPIncludes/footer.jsp"%>