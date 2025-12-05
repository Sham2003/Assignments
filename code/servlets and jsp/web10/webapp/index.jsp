<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Management</title>
</head>
<body>
    <h1>Employee Management</h1>


    <h2>Search Employees</h2>
    <form action="db" method="get">
        <label>Search by ID:</label>
        <input type="text" name="id" />
        <br/>
        <label>Search by Name:</label>
        <input type="text" name="name" />
        <br/>
        <input type="submit" value="Search" />
    </form>

    <hr/>

    <h2>Insert Employee</h2>
    <form action="db" method="post">
        <input type="hidden" name="action" value="INSERT" />
        <label>ID:</label><input type="text" name="id" /><br/>
        <label>Full Name :</label><input type="text" name="fullname" /><br/>
        <label>Email:</label><input type="text" name="email" /><br/>
        <label>Job Title:</label><input type="text" name="jobTitle" /><br/>
        <input type="submit" value="Insert Employee" />
    </form>

    <hr/>

    <h2>Update Employee</h2>
    <form action="db" method="post">
    	<input type="hidden" name="action" value="UPDATE" />
        <label>ID:</label><input type="text" name="id" /><br/>
        <label>Email:</label><input type="text" name="email" /><br/>
        <label>Job Title:</label><input type="text" name="jobTitle" /><br/>
        <input type="submit" value="Update Employee" />
    </form>

    <hr/>


    <h2>Delete Employee</h2>
    <form action="db" method="post">
    	<input type="hidden" name="action" value="DELETE" />
        <label>ID:</label><input type="text" name="id" /><br/>
        <input type="submit" value="Delete Employee" />
    </form>

</body>
</html>
