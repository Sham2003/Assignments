<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB DEMO</title>
</head>
<body>
    <h1>DB DEMO</h1>
    <c:out value="Data Base Connectivity"></c:out>
    
    <sql:setDataSource var="ds"
        driver="com.mysql.cj.jdbc.Driver" 
        url="jdbc:mysql://localhost:3306/classicmodels" 
        user="root" password="root@39"/>
        
    <c:if test="${ds == null}">
        <h3 style="color:red;"> DB Not Connected</h3>
    </c:if>
    


    
    <!-- Delete query if parameter is passed -->
    <c:if test="${param.deleteId != null}">
	    <sql:update var="deleted" dataSource="${ds}">
	        delete from employees where employeeNumber = ?
	        <sql:param value="${param.deleteId}" />
	    </sql:update>
	    <c:if test="${deleted >= 1}">
	        <h3 style="color:blue;">Employee with ID ${param.deleteId} deleted successfully!</h3>
	    </c:if>
	</c:if>

    
    <!-- Query employees -->
    <sql:query var="rs" dataSource="${ds}">
        select employeeNumber, firstname, email , jobTitle from employees;
    </sql:query>
    
    <!-- Display employees with delete button -->
    <c:forEach var="row" items="${rs.rows}">
        <div style="border:1px solid #ccc; margin:10px; padding:10px;">
            <h5>Employee Id: <span>${row.employeeNumber}</span></h5>
            <h5>First Name: <span>${row.firstname}</span></h5>
            <h5>Email: <span>${row.email}</span></h5>
            <h5>Job Title: <span>${row.jobTitle}</span></h5>
            
            <!-- Delete button -->
            <form method="post">
                <input type="hidden" name="deleteId1" value="${row.employeeNumber}" />
                <input type="submit" value="Delete" />
            </form>
        </div>
    </c:forEach>
</body>
</html>
