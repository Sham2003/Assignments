<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>
    <form action="process.jsp" method="post">
        Enter first number: <input type="text" name="num1"/><br/><br/>
        Enter second number: <input type="text" name="num2"/><br/><br/>
        Select operation:
        <select name="operation">
            <option value="add">Add</option>
            <option value="sub">Subtract</option>
            <option value="mul">Multiply</option>
            <option value="div">Divide</option>
        </select><br/><br/>
        <input type="submit" value="Calculate"/>
    </form>
</body>
</html>
