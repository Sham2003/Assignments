<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="true" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Async Demo</title>
</head>
<body>
	<form>
		Username : <input id="uname" type="text" name="uname" >
		Password : <input id="pwd" type="text" name="pwd" >
		<button type="button" onclick="login()">Login</button>
	</form>
	
	<div id="output">
	</div>
<script type="text/javascript">
    async function login() {
        let username = document.getElementById("uname").value;
        let password = document.getElementById("pwd").value;
		console.log(username + ' ' + password);
		  let resp = await fetch("async", {
		        method: "POST",
		        headers: { "Content-Type": "application/x-www-form-urlencoded" },
		        body: "uname=" + username + "&pwd=" + password
		    });
		 

        let text = await resp.text();
        document.getElementById("output").innerHTML = text;
    }
</script>
</body>
</html>