<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
   <head>
      	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      <title>Roles</title>
   </head>
   <body>
   <table>
    <tr>
        <th>Role ID</th>
        <th>Role Title</th>
    </tr>
    <c:forEach items="${roleList}" var="roles">
        <tr>
            <td>${roles.roleId}</td>
            <td>${roles.roleTitle}</td>
        </tr>
    </c:forEach>
</table>	
   </body>
   <p><input type="button" id="homeButton" name="homeButton" value="Home"> 
   <script src="js/custom.js"></script>
</html>