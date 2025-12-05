<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    double num1 = Double.parseDouble(request.getParameter("num1"));
    double num2 = Double.parseDouble(request.getParameter("num2"));
    String op = request.getParameter("operation");
    double result = 0;

    switch(op) {
        case "add": result = num1 + num2; break;
        case "sub": result = num1 - num2; break;
        case "mul": result = num1 * num2; break;
        case "div": result = num1 / num2; break;
    }

    // Redirect to result.jsp with result as query parameter
    response.sendRedirect("result.jsp?res=" + result);
%>
