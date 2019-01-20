<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
   <body>
      <h1>Enter Allocation details below -</h1>
	
		<form action="showProjectHistory" method="post"> 
			<p> Employee Name : 
			<select name="employee">
			    <c:forEach items="${empList}" var="emp">
			        <option value="${emp.employeeId}">${emp.employeeName}</option>
			    </c:forEach>
			</select>
			<input type="submit" value="Submit"/>
		</form>	
   </body>
</html>