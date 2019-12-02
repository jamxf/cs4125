/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.orders;

import java.util.UUID;

/**
 *
 * @author jamesfoley
 */
public class Order {
    private String orderID;
    //private User user;
    private Build build;
    private Shipping ship;
    private Double price;
    
    
    public Order(){
        orderID = UUID.randomUUID().toString();
    }
    
    
    public String getOrderdID(){
        return this.orderID;
    }
    
    public Double getPrice(){
        return this.price;
    }
    
}
