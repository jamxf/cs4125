/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.store;

import com.unstoppable.components.Part;
import com.unstoppable.login.Login;
import com.unstoppable.login.dbConnect;
import com.unstoppable.orders.Build;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jamesfoley
 */
public class PreBuilt {
 
    private ArrayList<Build> Builds;
    
    
    public void printBuilds(){
        for (Build b : Builds){
            System.out.println(b);
        }
    }
    
    public void getBuilds(){
        Builds = new ArrayList<Build>();
        PreparedStatement ps;
        Statement st;
        ResultSet rs = null;
               
        String query = "Select * from prebuilts;";
        
        try {
            Connection myConn = dbConnect.getConnection();
            System.out.println("Connected to the database...");

            st = myConn.createStatement();
            rs = st.executeQuery(query);

            ResultSetMetaData rsmeta;
            rsmeta = rs.getMetaData();
            int cols = rsmeta.getColumnCount();
            while(rs.next())
            {
                ArrayList<String> parts = new ArrayList<>();
                for ( int i = 1; i <= cols; ++i) 
                {
                    parts.add(rs.getString(i));
                }
                addBuild(parts);
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }                                           
    }
    
    public  void addBuild(ArrayList<String> parts) {
        Build b = new Build();
        String category;
        Double price;
        String cpu;
        String compatability;
        String name;
        int stock;
        
        for ( String s : parts){
            PreparedStatement ps;
            Statement st;
            ResultSet rs = null;

            String query = "Select * from Parts where PartId="+ s +";";
            try {
                Connection myConn = dbConnect.getConnection();
                System.out.println("Connected to the database...");

                st = myConn.createStatement();
                rs = st.executeQuery(query);
                ResultSetMetaData rsmeta = rs.getMetaData();
                int cols = rsmeta.getColumnCount();
                while(rs.next())
                {
                    category = rs.getString(2);
                    price = Double.parseDouble(rs.getString(3));
                    compatability = rs.getString(4);
                    stock = Integer.parseInt(rs.getString(5));
                    name = rs.getString(6);
                    Part p = new Part( price, category, compatability, name, stock);
                    b.addPart(p);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
        
        Builds.add(b);
    }
}
