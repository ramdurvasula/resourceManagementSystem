<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
   <head>
      	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      <title>Welcome</title>
   </head>
   <body>
   	<h4> Project History for ${employeeName}</h4>
   <table>
    <tr>
        <th>Client Name</th>
        <th>Project Name</th>
        <th>From Date</th>
        <th>To Date</th>
        <th>Role Title</th>
    </tr>
    <c:forEach items="${projectHistoryList}" var="projectHistory">
        <tr>
        	<td>${projectHistory.clientName}</td>
            <td>${projectHistory.projectName}</td>
            <td><fmt:formatDate pattern = "MM/dd/yyyy" value = "${projectHistory.fromDate}" />
            <td><fmt:formatDate pattern = "MM/dd/yyyy" value = "${projectHistory.toDate}" /></td>
            <td>${projectHistory.roleTitle}</td>
        </tr>
    </c:forEach>
</table>	
	<p><input type="button" id="homeButton" name="homeButton" value="Home"> 
	<script src="js/custom.js"></script>
   </body>
</html>