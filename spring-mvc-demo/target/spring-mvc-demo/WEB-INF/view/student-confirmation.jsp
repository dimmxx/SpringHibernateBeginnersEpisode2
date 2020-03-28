<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Student Confirmation Page</title>
</head>
<body>
<h2>
    The student is confirmed:
</h2>
<hr>
<h3>
    First name: ${student.firstName}
    <br> Last name: ${student.lastName}
    <br> Gender: ${student.gender}
    <br> Country: ${student.country}
</h3>
</body>
</html>
