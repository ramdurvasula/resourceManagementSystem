<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
   <head>
      	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      <title>Department</title>
   </head>
   <body>
   <table>
    <tr>
        <th>Department ID</th>
        <th>Department Name</th>
        <th>Department Location</th>
    </tr>
    <c:forEach items="${deptList}" var="item">
        <tr>
            <td>${item.departmentId}</td>
            <td>${item.departmentName}</td>
            <td>${item.departmentLocation}</td>
        </tr>
    </c:forEach>
</table>	
<p><input type="button" id="homeButton" name="homeButton" value="Home"> 
<script src="js/custom.js"></script>
   </body>
</html>