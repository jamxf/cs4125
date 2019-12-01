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
public class Vtest {
    
    public static void main(String [] args){
        
        taxVisitor tv = new taxVisitor();
        Shipping s1 = new Shipping(30.00);
        Build b1 = new Build(1400.00);
        
        System.out.println(b1.accept(tv) + "\n");
        System.out.println(s1.accept(tv) + "\n");

        
    }
    
}
