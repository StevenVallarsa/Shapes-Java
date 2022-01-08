/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sv.shapes2022;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-00-00
 * purpose: 
 */
public class Triangle extends Shape {

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double height;
    private double width;
    private String type = "triangle";
    
    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    @Override
    double getArea() {
        return height * width * 0.5;
    }

    @Override
    double getPerimeter() {
        return height + width + Math.sqrt(height * height + width * width);
    }
    
    public String getType() {
        return type;
    }

}
