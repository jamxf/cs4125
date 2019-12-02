/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.orders;

import com.unstoppable.components.Part;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author jamesfoley
 */
class Build implements Visitable{
    private String buildID;
    private Double price;
    private ArrayList<Part> parts;
    private Double hoursOfLabour;
    private Double labourCost;
    private ArrayList<String> progressPics;
    private String status;
    
    public Build(Double price){
        this.buildID = UUID.randomUUID().toString();
        this.price = price;
        labourCost = 20.00;
        hoursOfLabour = 1.0;
        status = "New";
        parts = new ArrayList<Part>();
    }
    
    public void setPrice(Double newPrice){
        this.price = newPrice;
    }
    
    public Double getPrice() {
        price += hoursOfLabour * labourCost;
        if(parts.size() > 0){
            parts.forEach((p) -> {
            price += p.getPrice();
        });
        }
        
        return price;
    }
    
    public void addPart(Part newPart){
        parts.add(newPart);
    }
    
    public ArrayList getParts(){
        return parts;
    }
    
    public void addLabout(Double hours){
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
    
    
    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
    
}
