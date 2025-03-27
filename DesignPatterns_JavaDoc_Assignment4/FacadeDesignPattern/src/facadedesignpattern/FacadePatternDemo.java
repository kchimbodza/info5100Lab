/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;
/**
 * The FacadePatternDemo class simplifies shape drawing by using the ShaperMakerFacade to call methods 
 * for drawing a circle, rectangle, and square in a streamlined way.
 * @author kudzayichimbodza
 * @version 1.0
 * 
 */
public class FacadePatternDemo {
    /**
     * This main method demonstrates the use of the ShaperMakerFacade to easily draw a circle, rectangle, and square by calling its methods.
     */
    public static void main (String[] args){
        /**
         * Attribute: ShaperMakerFacade shapeMaker
         * Purpose: This attribute is an instance of the ShaperMakerFacade class, used to simplify access to shape-drawing methods like drawCircle, drawRectangle, and drawSquare.
         * Rationale: It abstracts the complexity of managing individual shape objects and provides an easy, centralized way to draw shapes using the Facade design pattern.
         */
        ShaperMakerFacade shapeMaker = new ShaperMakerFacade();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
