<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student Registaration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"></form:input>
    <br><br>
    Last name: <form:input path="lastName"></form:input>
    <br><br>
    Country:
    <form:select path="country">
        <form:option value="Brazil" label="Brazil"/>
        <form:option value="Greece" label="Greece"/>
        <form:option value="United Kingdom" label="United Kingdom"/>
        <form:option value="Germany" label="Germany"/>
    </form:select>
    <br><br>
    <input type="submit" value="SUBMIT">

</form:form>
</body>
</html>