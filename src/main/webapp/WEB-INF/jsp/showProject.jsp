<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
   <head>
      	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      <title>Project</title>
   </head>
   <body>
   <table>
	    <tr>
	        <th>Project ID</th>
	        <th>Project Name</th>
	        <th>Client Name</th>
	        <th>Dead Line</th>                
	    </tr>
	    <c:forEach items="${projectList}" var="project">
	        <tr>
	            <td>${project.projectId}</td>
	            <td>${project.projectName}</td>
	            <td>${project.clientName}</td>
	            <td><fmt:formatDate pattern = "MM/dd/yyyy" value = "${project.deadline}" /></td>
	        </tr>
	    </c:forEach>
	</table>	
	<p><input type="button" id="homeButton" name="homeButton" value="Home"> 
	<script src="js/custom.js"></script>
   </body>
</html>