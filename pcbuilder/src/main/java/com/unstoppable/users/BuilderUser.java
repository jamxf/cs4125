/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.users;

/**
 *
 * @author jamesfoley
 */
public class BuilderUser extends User {
    private Double hoursWorked;
    private Double revenue;
    
    public BuilderUser(String userName, int uid, String password, String email) {
        super(userName, uid, password, email);
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
}
