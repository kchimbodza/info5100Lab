/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;
/**
 * This Square class implements the Shape interface and overrides the draw method to display and return the string "Square::Draw()"
 * @author kudzayichimbodza
 * @version 1.0
 * 
 */
public class Square implements Shape {
    /**
 * Purpose: This method lets the Square class perform its "drawing" action. It prints a message to show it's been drawn and returns the same message.
 * Returns: A string: "Square::Draw()", signaling that the square has been drawn.
 */   
    @Override
    public String draw(){
        System.out.println("Square::Draw()");
        return "Square::Draw()";
    }
}
