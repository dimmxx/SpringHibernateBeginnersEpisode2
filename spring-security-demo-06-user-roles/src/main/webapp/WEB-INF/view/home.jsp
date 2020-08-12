<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>luv2code Company Home Page</title>
</head>

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

<form:form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout">
</form:form>

</body>
</html>
