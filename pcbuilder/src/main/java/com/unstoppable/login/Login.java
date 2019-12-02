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

public class Login {

    private static String servername = "sql2.freemysqlhosting.net";
    private static String username = "sql2310859";
    private static String dbname  = "sql2310859";
    private static Integer portnumber  = 3306;
    private static String password = "jixvis-3muBho-qofjaf";
    
    public static Connection getConnection()
    {
        Connection connect = null;
        
        
        Connection myConn = null;

        try {
            myConn = DriverManager.getConnection("sql2.freemysqlhosting.net", "sql2310859", "jixvis-3muBho-qofjaf");
        } catch (SQLException ex) {
            System.out.println(ex);        
        }
        
        return connect;
    }
    
}