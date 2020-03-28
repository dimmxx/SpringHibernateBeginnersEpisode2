<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false"%>

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
    <form:select path="gender" >
        <form:option value="" label=""/>
        <form:option value="Male" label="Male"/>
        <form:option value="Female" label="Female"/>
    </form:select>
    <br><br>
    Country:
    <form:select path="country" >
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>
    <input type="submit" value="SUBMIT">

</form:form>
</body>
</html>