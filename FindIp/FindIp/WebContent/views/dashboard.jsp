<%@ include file="../JSPIncludes/headAndNav.jsp"%>


<c:if test="${!empty(user) && user.userType.accessLevel > 0}">


IM A DASHBOARD


</c:if>
</body>
</html>