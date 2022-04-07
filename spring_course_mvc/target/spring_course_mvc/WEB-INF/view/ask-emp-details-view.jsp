<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details in form below</h2>
<br>
<br>

<form:form action ="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <br>

    <input type = "submit" value = "OK">

</form:form>

</body>

</html>