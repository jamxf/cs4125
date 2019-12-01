/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.orders;
import java.text.DecimalFormat;
/**
 *
 * @author jamesfoley
 */
public class taxVisitor implements Visitor{
    DecimalFormat df = new DecimalFormat("#.##");
    
    public taxVisitor(){
        
    }

    @Override
    public Double visit(Shipping shipItem) {
        //sys print is temp
        System.out.println("Price with tax:");
        Double price = shipItem.getPrice();
        Double tax = Double.parseDouble(df.format(price * 0.25));
        price = tax + price;
        return price;
        
    }

    @Override
    public Double visit(Build buildItem) {
        //sys print is temp
        System.out.println("Price with tax:");
        Double price = buildItem.getPrice();
        Double tax = Double.parseDouble(df.format(price * 0.125));
        price = tax + price;
        return price;    
    }
    
    
}
