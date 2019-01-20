<!DOCTYPE HTML>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $("#fromDate,#toDate").datepicker();
    $("#fromDate,#toDate").on("change",function(){
        var selected = $(this).val();
    });
  });
  </script>
</head>
   <body>
      <h1>Enter Allocation details below -</h1>
	
		<form action="addAllocation" method="post"> 
			<p> Employee Name : 
			<select name="employee">
			    <c:forEach items="${empList}" var="emp">
			        <option value="${emp.employeeId}">${emp.employeeName}</option>
			    </c:forEach>
			</select>
			<p> Project Name  : 
			<select name="project">
			    <c:forEach items="${projectList}" var="project">
			        <option value="${project.projectId}">${project.projectName}</option>
			    </c:forEach>
			</select>			
			<p> Role Title    : 
			<select name="role">
			    <c:forEach items="${roleList}" var="roles">
			        <option value="${roles.roleId}">${roles.roleTitle}</option>
			    </c:forEach>
			</select>	 
			<p> From Date     : <input type="text" id="fromDate" name="fromDate"/> 
			<p> To Date       : <input type="text" id="toDate" name="toDate"/> 
			<p> Amount per Day: <input type="text" id="amountPerday" name="amountPerday"/> 
			<input type="submit" value="Submit"/>
		</form>	
   </body>
</html>