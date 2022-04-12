<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<body>
<h3>Information for all Employees</h3>
<br><br>
<security:authorize access="hasRole('HR')">
<input type="button" value="Salary" onclick="window.location.href = 'hr_info'">
Only for HR staff
</security:authorize>
<br><br>
<security:authorize access="hasRole('MANAGER')">
<input type="button" value="Performance" onclick="window.location.href = 'manager_info'">
Only for Managers
</security:authorize>
<br><br>
<input type="button" value="Sign Out" onclick="window.location.href = '/spring_course_security/login'">

</body>
</html>