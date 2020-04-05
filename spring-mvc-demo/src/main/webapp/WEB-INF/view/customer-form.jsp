<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Customer Registaration Form</title>

    <style>
        .error {
            color: red
        }
        .errorNum {
            color: coral;
        }
    </style>

</head>
<body>
<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>

<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name(*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    Free passes(*): <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="errorNum"/>
    <br><br>
    Postal code(*): <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="errorNum"/>
    <br><br>

    <input type="submit" value="Send">
</form:form>

</body>
</html>