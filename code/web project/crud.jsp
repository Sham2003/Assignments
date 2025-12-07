<%@ page language="java" import="java.sql.*,java.util.*" contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>Student CRUD</title>
</head>
<body>

<h2>Student CRUD Operations</h2>

<!-- FORM FOR CRUD -->
<form action="student" method="post">
    Student ID: <input type="text" name="studid" required><br><br>
    Name: <input type="text" name="name"><br><br>
    Course: <input type="text" name="course"><br><br>
    DOJ: <input type="date" name="doj"><br><br>

    <input type="submit" name="action" value="INSERT">
    <input type="submit" name="action" value="UPDATE">
    <input type="submit" name="action" value="DELETE">
    <input type="submit" name="action" value="VIEW">
</form>

<hr>

<h2>Student Records</h2>

<%
String url = "jdbc:mysql://localhost:3306/trainingdb";
String user = "root";
String pass = "root";

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, user, pass);
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM student");
%>

<table border="1" cellpadding="8">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Course</th>
    <th>Date of Joining</th>
</tr>

<%
while(rs.next()) {
%>
<tr>
    <td><%= rs.getInt("studid") %></td>
    <td><%= rs.getString("name") %></td>
    <td><%= rs.getString("course") %></td>
    <td><%= rs.getDate("doj") %></td>
</tr>
<%
}
con.close();
} catch(Exception e){
    out.println("Error : " + e.getMessage());
}
%>

</table>

</body>
</html>
