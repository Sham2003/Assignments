package com.training.day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUpdateDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        String uname = "root";
        String pwd = "root@39";
        String url  = "jdbc:mysql://localhost:3306/pct";


        Connection conn = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connection Established");
        
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO customer VALUES (?,?,?,?,?)" );
        stmt.setInt(1, 2003);
        stmt.setString(2,"Sham");
        stmt.setString(3,"Chennai");
        stmt.setString(4,"6369012291");
        stmt.setString(5,"sh@gmail.com");
        
        stmt.executeUpdate();
        
        System.out.println("Row Inserted Successfully");
        stmt.close();
        conn.close();
	}
}
