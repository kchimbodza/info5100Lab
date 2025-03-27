/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package facadedesignpattern;
/**
 * The Shape interface defines a contract for shape classes, requiring them to implement 
 * the draw method that returns a string representation of the shape being drawn.
 * @author kudzayichimbodza
 * @version 1.0
 * 
 */
public interface Shape {
    /**
     * Purpose: This method defines how shapes should draw themselves. Any class that represents a shape will implement this method and give it their specific drawing behavior.
     * Returns: A string showing the result of the drawing action, based on the specific shape.
     */
    public String draw();
}
