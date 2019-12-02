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
public class Build implements Visitable{
    private String buildID;
    protected Double price;
    protected ArrayList<Part> parts;

    
    public Build(){
        this.buildID = UUID.randomUUID().toString();
        this.price = price;
        parts = new ArrayList<Part>();
    }
    
    public void setPrice(Double newPrice){
        this.price = newPrice;
    }
    
    public Double getPrice() {

        return price;
    }
    
    public void addPart(Part newPart){
        parts.add(newPart);
    }
    
    public ArrayList getParts(){
        return parts;
    }
    
    
    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
    
}
