/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ishika.librarymanagementsystem.project;

import java.sql.*;

/**
 *
 * @author ishika jain
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
            return con;
        } catch (Exception e) {
            System.out.print(e);
            return null;
        }
        
        
    }
}
