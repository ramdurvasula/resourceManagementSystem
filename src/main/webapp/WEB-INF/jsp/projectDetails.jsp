<!DOCTYPE HTML>
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
      <h1>Enter Project details below -</h1>
	
		<form action="addProject" method="post"> 
			<p> Project Name : <input type="text" name="projectName" /> 
			<p> client Name  : <input type="text" name="clientName" />
			<p> Deadline   	 : <input type="text" id="datepicker" name="deadline"/> 
			<input type="submit" value="Submit"/>
		</form>	
   </body>
</html>