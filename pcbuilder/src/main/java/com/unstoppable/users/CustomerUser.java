/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.users;

import com.unstoppable.orders.Order;
import java.util.ArrayList;

/**
 *
 * @author jamesfoley
 */
public class CustomerUser extends User{
    
    private ArrayList<Order> orders;
    private String address;
    
    public CustomerUser(String userName, int uid, String password, String email) {
        super(userName, uid, password, email);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 
    
}
