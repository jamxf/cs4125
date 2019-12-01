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

    public Double getPrice() {
        return price;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
