<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo Page</title>
</head>
<body>

	<%
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
	%>
	<core:if test="${uname == 'sham' && pwd == 'sham306'}">
		
	</core:if>
</body>
</html>
