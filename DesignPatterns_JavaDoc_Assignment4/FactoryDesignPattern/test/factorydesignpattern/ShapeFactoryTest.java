/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package factorydesignpattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author kudzayichimbodza
 * @version 1.0
 */
public class ShapeFactoryTest {
    public ShapeFactoryTest() {
    }
    /**
     * The ShapeFactoryTest class tests the ShapeFactory's getShape method through positive and negative scenarios, 
     * verifying correct shape object creation for valid inputs (Circle, Square, Rectangle), ensuring graceful handling of various cases 
     * like mismatched expectations and unsupported inputs using assertions like assertEquals, assertNotNull, assertFalse, and assertNotEquals.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        
        //Positive
        String shapeType = "Circle";
        ShapeFactory instance = new ShapeFactory();
         
        Shape expResult = new Circle();
        Shape result = instance.getShape(shapeType);
        assertEquals(expResult.getClass(), result.getClass());
        
        shapeType = "SqUAre";
        expResult = new Square();
        result = instance.getShape(shapeType);
        assertEquals(expResult.getClass(),result.getClass());
        
        shapeType = "RecTangLE";
        expResult = new Rectangle();
        result = instance.getShape(shapeType);
        assertEquals(expResult.getClass(),result.getClass());
        
        //Negative
        shapeType = "square";
        expResult = new Rectangle();
        result = instance.getShape(shapeType);
        assertNotNull("Shape should not be null",result);
        
        shapeType = "circle";
        expResult = new Square();
        result = instance.getShape(shapeType);
        assertFalse("Result should not be Square", result instanceof Square);
        
        shapeType = "rectangle";
        expResult = new Circle();
        result = instance.getShape(shapeType);
        assertNotEquals(expResult.getClass(),result.getClass());
           
    }
    
}
