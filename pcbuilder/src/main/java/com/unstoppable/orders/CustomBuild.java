/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.orders;

import java.util.ArrayList;

/**
 *
 * @author jamesfoley
 */
public class CustomBuild extends Build{
    
    private Double hoursOfLabour;
    private Double labourCost;
    private ArrayList<String> progressPics;
    private String status;
    
    public CustomBuild(){
        super();
    }
    
    @Override
    public Double getPrice() {
        price += hoursOfLabour * labourCost;
        if(parts.size() > 0){
            parts.forEach((p) -> {
            price += p.getPrice();
        });
        }
        
        return price;
    }
    public void addLabour(Double hours){
        hoursOfLabour += hours;
    }
    
    public void addPicture(String url){
        progressPics.add(url);
    }
    
    public ArrayList<String> getAllPics(){
        return progressPics;
    }
    
    public String getLatestPic(){
        if (progressPics.size() > 0){
            return progressPics.get(progressPics.size() -1 );
        }
        
        return "No Photos yet";
    }
    
    public void setLabourCost(Double cost){
        this.labourCost = cost;
    }

    public String getStatus(){
        return this.status;
    }
    
    public void setStatus(String newStatus){
        this.status = newStatus;
    }
}
