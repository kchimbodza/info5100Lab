/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpattern;
/**
 * This Rectangle class implements the Shape interface and overrides the draw method to display and return the string "Rectangle::Draw()"
 * @author kudzayichimbodza
 * @version 1.0
 */
public class Rectangle implements Shape {
    /**
 * Purpose: This method lets the Rectangle class perform its "drawing" action. It prints a message to show it's been drawn and returns the same message.
 * Returns: A string: "Rectangle::Draw()", signaling that the rectangle has been drawn.
 */   
    @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}
