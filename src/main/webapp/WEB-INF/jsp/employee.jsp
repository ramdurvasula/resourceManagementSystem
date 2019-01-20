<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
   </head>
   <body>
   		<form id="employeeForm"> 
   <table>
    <tr>
        <th>Employee ID</th>
        <th>Name</th>
        <th>Salary<th>
        <th>Manager<th>
        <th>HireDate<th>
        <th>Department Name</th>
    </tr>
    <c:forEach items="${empList}" var="emp">
        <tr>
            <td>${emp.employeeId}</td>
            <td>${emp.employeeName}</td>
            <td>${emp.salary}</td>
            <td>${emp.managerId.employeeName}</td>
<%--             <td>${emp.hiredate}</td> --%>
            <td><fmt:formatDate pattern = "MM/dd/yyyy" value = "${emp.hiredate}" /></td>
            <td>${emp.department.departmentName}</td>
        </tr>
    </c:forEach>
	</table>	
			<p><input type="button" id="homeButton" name="homeButton" value="Home"> 
		</form>	
		<script src="js/custom.js"></script>
   </body>		
</html>