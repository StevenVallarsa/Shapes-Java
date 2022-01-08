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
 * purpose: 
 */
public class Square extends Shape {
    
    private double side;
    private String type;
    
    public Square(double side) {
        this.side = side;
        this.type = "square";
    }
    
    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return side * 4;
    }
    
    double getSide() {
        return side;
    }
    
    public String getType() {
        return type;
    }


}
