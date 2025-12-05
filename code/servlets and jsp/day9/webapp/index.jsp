<%@ page import="java.util.*" %>
<html>
<head>
    <title>JSP Example</title>
</head>
<body>
<%! 
    public int add(int a, int b) {
        return a + b;
    }
%>

<%
    // Print result of add(5,6)
    out.println("Result of add(5,6): " + add(5,6));

    // Get current time
    Date now = new Date();
%>

<h2>Current Time: <%= now %></h2>
<%@ jsp:include page="welcome.jsp" %>
</body>
</html>
