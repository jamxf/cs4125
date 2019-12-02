/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.login;

/**
 *
 * @author jamesfoley
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbConnect {


    private static String servername = "sql2.freemysqlhosting.net";
    private static String username = "sql2310859";
    private static String dbname  = "sql2310859";
    private static Integer portnumber  = 3306;
    private static String password = "vV9%dB2!";
    
    public dbConnect(){
    }

    
    public static Connection getConnection()
    {
        Connection myConn = null;

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://sql2.freemysqlhosting.net/sql2310859","sql2310859", "vV9%dB2!");
            System.out.println("Success");
        } catch (SQLException ex) {
            System.out.println(ex);        
        }
        return myConn;
    }   
}