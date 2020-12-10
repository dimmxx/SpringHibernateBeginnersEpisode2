<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringDemo</title>
</head>
<body>
<h3>Spring REST demo</h3>

<a href="${pageContext.request.contextPath}/test/hello">Hello endpoint</a>
<hr>
<a href="${pageContext.request.contextPath}/api/students">Get students</a>

</body>
</html>
