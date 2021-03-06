<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details in form below</h2>
<br>
<br>

<form:form action ="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <span style="color: red; ">
        <form:errors path="name"/>
    </span>
    <br><br>
    Surname <form:input path="surname"/>
    <span style="color: red; ">
        <form:errors path="surname"/>
    </span>
    <br><br>
    Salary <form:input path="salary"/>
    <span style="color: red; ">
        <form:errors path="salary"/>
    </span>
    <br><br>
    Department <form:select path="department">
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which car do you want?
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    VW <form:radiobutton path="carBrand" value="Volkswagen"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign Language(s)
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    IT <form:checkbox path="languages" value="Italian"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>

    Phone number <form:input path="phoneNumber"/>
    <span style="color: red; ">
        <form:errors path="phoneNumber"/>
    </span>
    <br><br>
    E-main <form:input path="email"/>
    <span style="color: red; ">
        <form:errors path="email"/>
    </span>
    <br><br>

    <input type = "submit" value = "OK">

</form:form>

</body>

</html>