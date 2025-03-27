/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package facadedesignpattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author kudzayichimbodza
 * @version 1.0
 */
public class ShaperMakerFacadeTest {  
    public ShaperMakerFacadeTest() {
    }  
    /**
     * Test of drawCircle, drawRectangle & drawSqaure methods of class ShaperMakerFacade.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShaperMakerFacade instance = new ShaperMakerFacade();
        /**
         * Positive test
         */
        String expResult = "Circle::Draw()";
        String result = instance.drawCircle();
        assertEquals(expResult, result);     
        /**
         * Negative test
         */
        expResult = "Triangle::Draw()";
        result = instance.drawCircle();
        assertNotEquals(expResult, result);
      
    }

    /**
     * Test of drawRectangle method, of class ShaperMakerFacade.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShaperMakerFacade instance = new ShaperMakerFacade();
        
        /**
         * Positive test
         */
        String expResult = "Rectangle::Draw()";
        String result = instance.drawRectangle();
        assertEquals(expResult, result);
        
        /**
         * Negative test
         */
        expResult = "Hexagon::Draw()";
        result = instance.drawRectangle();
        assertNotEquals(expResult, result);
       
    }

    /**
     * Test of drawSquare method, of class ShaperMakerFacade.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        ShaperMakerFacade instance = new ShaperMakerFacade();
        
       /**
         * Positive test
         */
        String expResult = "Square::Draw()";
        String result = instance.drawSquare();
        assertEquals(expResult, result);
        
         /**
         * Negative test
         */
        expResult = "Octagon::Draw()";
        result = instance.drawSquare();
        assertNotEquals(expResult, result);
      
    }
    
}
