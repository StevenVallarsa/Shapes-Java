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
public class Rectangle extends Shape {
    
    private double width;
    private double length;
    private String type;
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.type = "rectangle";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    double getArea() {
        return length * width;
    }
    
    public String getType() {
        return type;
    }

}
