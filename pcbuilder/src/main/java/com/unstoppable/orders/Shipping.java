/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.orders;

/**
 *
 * @author jamesfoley
 */
class Shipping implements Visitable {
    
    private Double price;
    private String address;
    private Double weight;
    private String trackingNumber;

    
    public Shipping(Double weight){
        if (weight > 20.00){
            price = 25.00;
        }
        else if (weight > 10.00){
            price = 10.00;
        }
        else{
            price = 5.00;
        }
    }
    
    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public String getAddress(){
        return this.address;
    }
    
    public void setPrice(Double newPrice){
        this.price = newPrice;
    }
    
    public Double getPrice() {
        return this.price;
    }
    
    public void setWeight(Double newWeight){
        this.weight = newWeight;
    }
    
    public Double getWeight(){
        return this.weight;
    }
    
    public void setTrackingNumber(String tn){
        this.trackingNumber = tn;
    }
    
    public String getTrackingNumber(){
        return this.trackingNumber;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
