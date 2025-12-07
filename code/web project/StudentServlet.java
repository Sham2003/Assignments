package com.training.web0;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class StudentServlet extends HttpServlet {

    private Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/trainingdb";
        String user = "root";
        String pass = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String id = req.getParameter("studid");
        String name = req.getParameter("name");
        String course = req.getParameter("course");
        String doj = req.getParameter("doj");

        try (Connection con = getConnection()) {

            if ("INSERT".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO student VALUES (?,?,?,?)");
                ps.setInt(1, Integer.parseInt(id));
                ps.setString(2, name);
                ps.setString(3, course);
                ps.setString(4, doj);
                ps.executeUpdate();
                out.println("Record Inserted<br>");

            } else if ("UPDATE".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                        "UPDATE student SET name=?, course=?, doj=? WHERE studid=?");
                ps.setString(1, name);
                ps.setString(2, course);
                ps.setString(3, doj);
                ps.setInt(4, Integer.parseInt(id));
                ps.executeUpdate();
                out.println("Record Updated<br>");

            } else if ("DELETE".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                        "DELETE FROM student WHERE studid=?");
                ps.setInt(1, Integer.parseInt(id));
                ps.executeUpdate();
                out.println("Record Deleted<br>");

            } else if ("VIEW".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                        "SELECT * FROM student WHERE studid=?");
                ps.setInt(1, Integer.parseInt(id));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    out.println("<h3>Student Details</h3>");
                    out.println("ID: " + rs.getInt("studid") + "<br>");
                    out.println("Name: " + rs.getString("name") + "<br>");
                    out.println("Course: " + rs.getString("course") + "<br>");
                    out.println("DOJ: " + rs.getDate("doj"));
                } else {
                    out.println("No Record Found");
                }
            }

        } catch(Exception e) {
            out.println("Error: " + e.getMessage());
        }

        out.println("<br><br><a href='crud.jsp'>Back</a>");
    }
}
