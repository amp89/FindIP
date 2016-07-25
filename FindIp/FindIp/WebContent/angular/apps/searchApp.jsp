	<script>

	
	var app = angular.module('searchApp',[]);
	
	
	app.controller('searchForm',function($scope,$http){
		
		$scope.regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
		
		//request her/*  */e TODO
		$scope.ipSearchData = {};
		$scope.ipResponseData = {};
		$scope.ipSaveData = {};
		$scope.saveMessage = "";
		
		$scope.searchCompleteFlag = false;
		
		$scope.ipSearchData.accessToken="${accessToken}"
		
		//$scope.ipSearchData.accessToken = 'testjlskjfdlsdkfj';
		$scope.getIpInfo = function(){
			console.log("IP: " + $scope.ipSearchData); //TODO remove
			
			$http({
				method:"POST",
				url:"rest/getIpData",
				data:$scope.ipSearchData,
				params : {"content-type":"application/json","Accept" : "application/json"}
			}).then(function success(response){
				console.log("Post Ip search :)"); //TODO remove
				console.log(response.data); //TODO remove
				$scope.searchCompleteFlag = true;
				$scope.ipResponseData = response.data;
				
			}, function error(response){
				console.log("No post search :("); //TODO remove
			});//end http
			
		};//end get info
		
		$scope.saveIp = function(){
			console.log("save: " + $scope.ipSaveData)
			$scope.ipSaveData.userId = "${user.id}";
			$scope.ipSaveData.ipId = $scope.ipResponseData.id;
			$scope.ipSaveData.accessToken = "${accessToken}";
			
			$http({
				method:"POST",
				url:"rest/saveIp",
				data:$scope.ipSaveData,
				params : {"content-type":"application/json","Accept":"application/json"}
			}).then(function success(response){
				console.log("SUCCESS POST :)")  //TODO remove
				console.log(response.data);
				$scope.ipSaveData.publicComment = "";
				$scope.ipSaveData.privateComment = "";
				//$scope.saveMessage = response.data.message;
				$scope.saveMessage = "Save successful!";
				//save message TODO 
			},function error(response){
				$scope.saveMessage = "Save Successful";
				console.log("NO SUCCESS POST :(")  //TODO remove
				$scope.saveMessage = "Save Error!";
				//save message TODO 
				
			});
		};//end saveIp()
		
		
	});
	
	
	
	
	
	</script>