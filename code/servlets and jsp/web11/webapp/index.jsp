<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="true" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEXT PROCESSOR</title>
</head>
<body>
<h1 align="center">TEXT PROCESSOR</h1>
	<form style="align-content: center;align-items: center;align-self: center;text-align: center;">
		TEXT : <br/>
		<textarea id="itext" name="itext" rows="4" cols="40" placeholder="Type your message here..."></textarea><br/>
		<button type="button" onclick="reverse()">Reverse</button>
	</form>
	
	
	<div id="threaddiv" style="display:none;margin:50px;">
		<h5>Thread :</h5> <p style="font-weight:bolder;font-size:15" id="thread"></p>
	</div>
	
	
	<div id="result" style="display:none;">
		<h2>No of characters : </h2> <h3 id="charcount"> </h3>
		<h2>Reverse Text: </h2> <h3 id="rtext"> </h3>
		<h2>Text in upper case: </h2> <h3 id="utext"> </h3>
	</div>

<script type="text/javascript">
    async function reverse() {
		  document.getElementById("threaddiv").style.display = "none";
		  document.getElementById("result").style.display = "none";
        let itext = document.getElementById("itext").value;
		console.log(itext);
		  let resp = await fetch("reverse", {
		        method: "POST",
		        headers: { "Content-Type": "application/x-www-form-urlencoded" },
		        body: "text=" + itext
		    });
		 

		  let respText = await resp.text();
		  let lines = respText.split("\n");

		  let threadstatus = lines[0];
		  let charcount = lines[1];
		  let rtext = lines[2];
		  let utext = lines[3];

		  console.log(lines);

		  document.getElementById("threaddiv").style.display = "block";
		  document.getElementById("result").style.display = "block";

		  document.getElementById("thread").innerHTML = threadstatus;
		  document.getElementById("charcount").innerHTML = charcount;
		  document.getElementById("rtext").innerHTML = rtext;
		  document.getElementById("utext").innerHTML = utext;
    }
</script>
</body>
</html>