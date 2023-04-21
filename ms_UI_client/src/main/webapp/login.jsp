<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<script type="text/javascript">
function login() 
{
    alert("Hello Login");
    var un = document.getElementById("un").value;
    var ps = document.getElementById("ps").value;
    alert(un);
    alert(ps);
    
    var req= new XMLHttpRequest();
   // var url= "http://localhost:9091/getcondata/"+un+"/"+ps+"";
    var url= "http://localhost:8585/getadd/getcondata/"+un+"/"+ps+"";
    req.open("GET", url, true);
    req.send();
    
    req.onreadystatechange=function()
    {
    	alert("Hi");
    	if(req.readyState==4 && req.status==200)
    		{
    		   alert(req.readyState);
    		   alert(req.status);
    		   alert(req.responseText);
    		}
    }
}
</script>
<body>
<form action="login">
UserName:
<input type="text" name="username" id="un"> <br>
Password:
<input type="text" name="password" id="ps"> <br>

<input type="button" value="login" onclick="login()">
</form>
</body>
</html>