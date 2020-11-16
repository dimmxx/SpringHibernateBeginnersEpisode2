<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>luv2code Company Home Page</title>
</head>
<body>
<h2>luv2code Company Home Page</h2>
<hr>
<p>Welcome to luv2code Company Home Page!</p>

<hr>
<p>
    User: <security:authentication property="principal.username"/>
</p>
<p>
    Role: <security:authentication property="principal.authorities" />
</p>
<hr>
<security:authorize access="hasRole('MANAGER')">
    <p>
        <a href="${pageContext.request.contextPath}/managers">Managers' secret page</a>
    </p>
    <hr>
</security:authorize>

<security:authorize access="hasRole('ADMIN')">
    <p>
        <a href="${pageContext.request.contextPath}/admins">Administrators' secret page</a>
    </p>
    <hr>
</security:authorize>
<form:form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout">
</form:form>

</body>
</html>
