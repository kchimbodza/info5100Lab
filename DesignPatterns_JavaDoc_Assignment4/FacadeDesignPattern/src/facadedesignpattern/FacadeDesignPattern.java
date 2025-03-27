/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadedesignpattern;
/**
 * The FacadeDesignPattern class demonstrates the Facade design pattern by using a ShaperMakerFacade object to simplify access to methods for drawing shapes like circles, rectangles, and squares.
 * @author kudzayichimbodza
 * @version 1.0
 */
public class FacadeDesignPattern {
    /**
     * This main method demonstrates the use of a ShaperMakerFacade to simplify interactions 
     * by invoking methods to draw a circle, rectangle, and square through facade-based abstraction.
     */
    public static void main(String[] args) {    
        /**
         * Attribute: ShaperMakerFacade smf
         * Purpose: Manages shape-drawing operations via the Facade design pattern. Simplifies interactions with multiple shape objects.
         * Rationale: Provides a unified interface for drawing shapes, keeping the design clean and user-friendly.
         */
        ShaperMakerFacade smf = new ShaperMakerFacade();
        String circle1 = smf.drawCircle();
        String rectangle1 = smf.drawRectangle();
        String square1 = smf.drawSquare();
    }    
}
