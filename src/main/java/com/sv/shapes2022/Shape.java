/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sv.shapes2022;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-01-07
 * purpose: First program using basic inheritance
 */
abstract class Shape {
    
    private String colour = "Blue";
    private String type;
    
    abstract double getArea();
    abstract double getPerimeter();
    
    public String getType() {
        return type;
    }
    
    void setColour(String colour) {
        this.colour = colour;
    }
    
    String getColour() {
        return colour;
    }
    
    
}
