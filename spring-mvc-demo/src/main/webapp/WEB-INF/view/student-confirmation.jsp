<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student Confirmation Page</title>
</head>
<body>
<h2>
    The student is confirmed:
</h2>
<hr>

First name: ${student.firstName}
<br><br> Last name: ${student.lastName}
<br><br> Gender: ${student.gender}
<br><br> Country: ${student.country}
<br><br> Favorite language: ${student.favoriteLanguage}
<br><br> Favorite framework: ${student.favoriteFramework}
<br><br> Operating systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystem}">
        <li>${temp}</li>
    </c:forEach>
</ul>
<br> Favorite IDEs:
<ul>
    <c:forEach var="temp" items="${student.favoriteIde}">
        <li>${temp}</li>
    </c:forEach>
</ul>

<hr>
<a href="../">Home page</a>

</body>
</html>
