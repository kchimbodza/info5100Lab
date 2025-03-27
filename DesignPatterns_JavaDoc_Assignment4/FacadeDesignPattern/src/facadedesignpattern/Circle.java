/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;
/**
 * This Circle class implements the Shape interface and overrides the draw method to display and return the string "Circle::Draw()"
 * @author kudzayichimbodza
 * @version 1.0
 * 
 */
public class Circle implements Shape {    
/**
 * Purpose: This method lets the Circle class perform its "drawing" action. It prints a message to show it's been drawn and returns the same message.
 * Returns: A string: "Circle::Draw()", signaling that the circle has been drawn.
 */    
    @Override
    public String draw(){
        System.out.println("Circle::Draw()");
        return "Circle::Draw()";
    }
}
