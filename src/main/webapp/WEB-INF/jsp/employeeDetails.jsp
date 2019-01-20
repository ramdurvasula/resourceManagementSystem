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
    $( "#datepicker" ).datepicker();
    $("#datepicker").on("change",function(){
        var selected = $(this).val();
    });
  });
  </script>
</head>
   <body>
      <h1>Enter Employee details below -</h1>
	
		<form name="employeeDetails" action="addEmployee" method="post">     
			<p>     Employee Name    : <input type="text" name="employeeName" /> 
			<p>   	HireDate     	: <input type="text" id="datepicker" name="hiredate"/> 
			<p>   	Salary     		: <input type="text" name="salary" /> 
<!-- 			<p>   	Manager    		: <input type="text" name="managerId" />  -->
			<p>		Manager
					<select name="managerId">
					    <c:forEach items="${empList}" var="mgr">
					        <option value="${mgr.employeeId}">${mgr.employeeName}</option>
					    </c:forEach>
					</select>
					
			<p>		Department
					<select name="department">
					    <c:forEach items="${deptList}" var="dept">
					        <option value="${dept.departmentId}">${dept.departmentName}</option>
					    </c:forEach>
					</select>
			<p><input type="submit" value="Submit"/>
		</form>	
   </body>
</html>