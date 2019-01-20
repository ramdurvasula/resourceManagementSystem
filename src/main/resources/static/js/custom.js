$(document).ready(function() {
    $("#empButton").on("click",function(){
    	$("#indexForm").attr('action', 'employee');
    	$("#indexForm").submit();
    });
    $("#deptButton").on("click",function(){
    	$("#indexForm").attr('action', 'department');
    	$("#indexForm").submit();
    });
    $("#roleButton").on("click",function(){
    	$("#indexForm").attr('action', 'role');
    	$("#indexForm").submit();
    });
    $("#empButton").on("click",function(){
    	$("#indexForm").attr('action', 'employee');
    	$("#indexForm").submit();
    });
    $("#projectButton").on("click",function(){
    	$("#indexForm").attr('action', 'project');
    	$("#indexForm").submit();
    });
    $("#allocateButton").on("click",function(){
    	$("#indexForm").attr('action', 'allocation');
    	$("#indexForm").submit();
    });
    $("#projectHistoryButton").on("click",function(){
    	$("#indexForm").attr('action', 'projectHistory');
    	$("#indexForm").submit();
    });

    
    $("#homeButton").on("click",function(){
    	window.location.href='index';
    });
    
});	