<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>luv2code Company Home Page</title>
</head>
<body>
<h2>luv2code Company Home Page</h2>
<hr>
<p>Welcome to luv2code Company Home Page!</p>

<form:form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout">
</form:form>

</body>
</html>
