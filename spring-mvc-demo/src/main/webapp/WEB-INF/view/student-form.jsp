<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Student Registaration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Gender:
    <form:select path="gender">
        <form:option value="" label=""/>
        <form:option value="Male" label="Male"/>
        <form:option value="Female" label="Female"/>
    </form:select>
    <br><br>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>
    Favorite language: <br>
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
    <br><br>
    Favorite framework: <br>
    <form:radiobuttons path="favoriteFramework" items="${student.favoriteFrameworkOptions}"/>
    <br><br>
    Operating system: <br>
    Windows <form:checkbox path="operatingSystem" value="Windows"/>
    Mac OS <form:checkbox path="operatingSystem" value="Mac OS"/>
    Linux <form:checkbox path="operatingSystem" value="Linux"/>
    <br><br>
    FavoriteIde: <br>
    <form:checkboxes path="favoriteIde" items="${student.favoriteIdeOptions}"/>
    <br><br>
    <input type="submit" value="SUBMIT">
</form:form>

</body>
</html>