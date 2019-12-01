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
class Build implements Visitable{
    private Double price;
    
    public Build(Double price){
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
    
}
