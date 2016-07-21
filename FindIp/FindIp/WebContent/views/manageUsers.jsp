<%@ include file="../JSPIncludes/headAndNav.jsp"%>
<c:if test="${!empty(user) && user.userType.accessLevel > 1}">


IM A MANAGE STUFF PAGE


</c:if>
</body>
</html>