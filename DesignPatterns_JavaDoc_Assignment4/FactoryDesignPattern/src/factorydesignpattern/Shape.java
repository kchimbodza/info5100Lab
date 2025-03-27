/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factorydesignpattern;
/**
 * The Shape interface defines a contract requiring implementing classes to provide their own version of the draw method.
 * @author kudzayichimbodza
 * @version 1.0
 */
public interface Shape {
    /**
     * Purpose: This method defines how a shape is drawn. It ensures that any class implementing the Shape interface specifies its own way of being drawn.
     */
    void draw();
}
