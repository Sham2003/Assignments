<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
    <body>
        <h2>Welcome Page</h2>
        <p>
            Login Successful for user 
            <strong><%= (String) session.getAttribute("username") %></strong>
        </p>
    </body>
</html>
