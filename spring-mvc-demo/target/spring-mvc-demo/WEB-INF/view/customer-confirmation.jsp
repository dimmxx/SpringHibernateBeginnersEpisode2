<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Customer Confirmation Page</title>
</head>
<body>
<h2>
    The customer is confirmed:
</h2>
<hr>

First name: ${customer.firstName}
<br> Last name: ${customer.lastName}
<br> Free passes: ${customer.freePasses}
<br> Postal code: ${customer.postalCode}
<br> Course code: ${customer.courseCode}

<hr>
<a href="../">Home page</a>

</body>
</html>
