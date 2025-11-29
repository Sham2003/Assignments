package com.training.day7;

import java.sql.*;



public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        String uname = "root";
        String pwd = "root@39";
        String url  = "jdbc:mysql://localhost:3306/pct";


        Connection conn = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connection Established");


        System.out.println("Schema : " + conn.getCatalog());


        Statement stmt = conn.createStatement();


        ResultSet rs = stmt.executeQuery("SELECT * FROM Customer");
       
        
        ResultSetMetaData rsmd = rs.getMetaData();
       
        
        
        
        for(int i = 1;i <= rsmd.getColumnCount(); i++ ) {
        	System.out.println("Column : "+ rsmd.getColumnName(i));
        	System.out.println("Java Class : " + rsmd.getColumnClassName(i));
        	System.out.println("Type : " + rsmd.getColumnType(i));
        	System.out.println("Label : " + rsmd.getColumnLabel(i));
        	System.out.println("Column Type : " + rsmd.getColumnTypeName(i));
        	System.out.println("Display Size: " + rsmd.getColumnDisplaySize(i));
        }
    	
    	

        while (rs.next()) {
        	
        	
            int id = rs.getInt("Customer_Id");
            String name = rs.getString("Name");
            String address = rs.getString("Address");
            String phone = rs.getString("Phone_Number");
            String email = rs.getString("Email");

            System.out.println(
                "Customer_Id: " + id +
                ", Name: " + name +
                ", Address: " + address +
                ", Phone_Number: " + phone +
                ", Email: " + email
            );
        }

 
        rs.close();
        stmt.close();
        conn.close();
    }
}
