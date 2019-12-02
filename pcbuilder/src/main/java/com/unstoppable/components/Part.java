/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.components;

/**
 *
 * @author jamesfoley
 */
public class Part {
    
    private Double price;
    private String category;
    private String compatability;
    private String name;
    private int stock;

    public Part(Double price, String category, String compatability, String name, int stock) {
        this.price = price;
        this.category = category;
        this.compatability = compatability;
        this.name = name;
        this.stock = stock;
    }
    

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompatability() {
        return compatability;
    }

    public void setCompatability(String compatability) {
        this.compatability = compatability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

    public Double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "Part{" + "price=" + price + ", category=" + category + ", compatability=" + compatability + ", name=" + name + ", stock=" + stock + '}';
    }
    
    
}
