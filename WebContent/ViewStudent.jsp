<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-Type" content = "text/html; charset = ISO-8859-1">
<title>View Students</title>
</head>
<body>
<table>
<tr><th> Student name: </th><th>Student Age: </th></tr>
 <c:forEach var = "student" items = "${students}">
 <tr><td>${student.name}</td><td>${student.age}</td></tr>
 </c:forEach>



</table>
<hr/>
<h4> Use the form below to  add a new student</h4>
<form method = "post">
Name: <input type = "text"  name = "name" />
Age: <input type = "number" name = "age" />
<input type = "submit" value = "Add Student" />

</form>

</body>
</html>