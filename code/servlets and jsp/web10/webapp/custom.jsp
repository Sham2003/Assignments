<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Custom Tag Demo</title>
</head>
<body>
    <h2>Using Custom Tag</h2>
    <t:greet user="Sham"></t:greet>
    <t:add num1="10" num2="20" />
    <t:add num1="50" num2="70" />
    <h2>Testing Factorial Tag</h2>
    <t:factorial number="5" />
    <br/>
    <t:factorial number="7" />
</body>
</html>
