<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
   <head>
      	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      <title>Welcome</title>
   </head>
   <body>
   <table>
    <tr>
        <th>Employee Name</th>
        <th>Project Name</th>
        <th>Role Title</th>
    </tr>
    <c:forEach items="${allocationList}" var="allocations">
        <tr>
            <td>${allocations.employee.employeeName}</td>
            <td>${allocations.project.projectName}</td>
            <td>${allocations.role.roleTitle}</td>
        </tr>
    </c:forEach>
</table>	
	<p><input type="button" id="homeButton" name="homeButton" value="Home"> 
	<script src="js/custom.js"></script>
   </body>
</html>