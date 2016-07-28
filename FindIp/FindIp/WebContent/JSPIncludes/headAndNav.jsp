<%@ include file="../JSPIncludes/tags.jsp"%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- TODO add favicon -->
    <link rel="icon" href="../../favicon.ico">

    <title>FindIP | IP LOOKUP TOOL</title>

    <link src="css/reset.css" />
    <!-- Bootstrap core CSS -->
    <link href="bootstrapfiles/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="bootstrapfiles/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="bootstrapfiles/assets/css/navbar-fixed-top.css" rel="stylesheet">

<!-- ************************************************************
check if jquery script be omitted b/c of load later in page.
************************************************************ -->
		<script src="js/jquery.js"></script>
		<script src="angular/angular.min.js"></script>
</head>
<body>


    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.do">FindIP</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
                      	<li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">About <span class="caret"></span></a>
              <ul class="dropdown-menu">
						<li><a target="_blank" href="http://www.alexmpeterson.com">My Webiste</a></li>
						<li><a target="_blank" href="http://www.alexmpeterson.com/projects.php">More of my projects</a></li>
						
						<li role="separator" class="divider"></li>
						<li><a target="_blank" href="http://www.alexmpeterson.com/findip.php">FindIP Project information Page</a></li>
								
              </ul>
            </li>
            
          </ul>
          <ul class="nav navbar-nav navbar-right">
          	<c:if test="${empty(user) || user.userType == null}">
            <li><a class="active" href="index.do">Login<span class="sr-only">(current)</span></a></li>
            </c:if>
<c:if test="${!empty(user) && user.userType.accessLevel > 0}">
            <li><a href="search.do">Search <span class="sr-only">(current)</span></a></li>
            <li><a href="manageUsers.do">Manage Users<span class="sr-only">(current)</span></a></li>
            <li><a href="userDashboard.do">My Stuff<span class="sr-only">(current)</span></a></li>
            <li><a href="logout.do">Logout<span class="sr-only">(current)</span></a></li>
</c:if>

          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

${message}
<%-- DEBUG: ${user}  --%>

