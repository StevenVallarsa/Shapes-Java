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
public class App {
    public static void main(String[] args) {
        
        Square square = new Square(10.0);
        System.out.printf("A %s with sides of %.1f units has a perimiter of %.1f units and an area of %.1f square units%n",square.getType(), square.getSide(), square.getPerimeter(), square.getArea());
     
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.printf("A %s with sides of %.1f and %.1f units has a perimiter of %.1f units and an area of %.1f square units%n",rectangle.getType(), rectangle.getWidth(), rectangle.getLength(), rectangle.getPerimeter(), rectangle.getArea());
        
        Triangle triangle = new Triangle(10, 10);
        System.out.printf("A %s with sides of %.1f and %.1f units has a perimiter of %.1f units and an area of %.1f square units%n",triangle.getType(), triangle.getWidth(), triangle.getHeight(), triangle.getPerimeter(), triangle.getArea());
        
    }
}
