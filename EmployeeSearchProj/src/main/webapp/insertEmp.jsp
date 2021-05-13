<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h>Welcome <%= application.getAttribute("user") %>
<form method=post action="http://localhost:90/EmployeeSearchProj/crudEmp">
	Enter Employee Id<input type=text name=eid><br>
	Enter First_name<input type=text name=fname><br>
	Enter Salary<input type=text name=sal><br>
	Enter Department Id<input type=text name=did><br>
	<input type=submit value="Insert Details"><input type=reset value=Reset>
</form>
</body>
</html>

