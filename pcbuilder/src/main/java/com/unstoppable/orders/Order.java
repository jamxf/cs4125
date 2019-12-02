/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.orders;

import com.unstoppable.users.CustomerUser;
import java.util.UUID;

/**
 *
 * @author jamesfoley
 */
public class Order {
    private String orderID;
    private CustomerUser user;

    private Build build;
    private Shipping ship;
    private Double price;
    private Boolean paid;
    
    public Order(){
        orderID = UUID.randomUUID().toString();
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public Shipping getShip() {
        return ship;
    }

    public void setShip(Shipping ship) {
        this.ship = ship;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
    
    
    public String getOrderdID(){
        return this.orderID;
    }
    
    public Double getPrice(){
        return this.price;
    }
    
    public CustomerUser getUser() {
        return user;
    }

    public void setUser(CustomerUser user) {
        this.user = user;
    }
    
}
