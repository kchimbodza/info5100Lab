/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package singletondesignpattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author kudzayichimbodza
 * @version 1.0
 */
public class SingleObjectTest {  
    /**
     * Purpose: This method tests the Singleton pattern implementation. It ensures that the getInstance() method of the SingleObject class consistently returns the same instance.
     * Parameters: None.
     * Returns: void: This method does not return a value but uses assertions to validate that the expected and actual results are identical.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
         /**
         * Positive test
         */
        SingleObject expResult = SingleObject.getInstance();
        SingleObject result = SingleObject.getInstance();
        assertEquals(expResult, result);      
    }
    /**
     * Purpose: This method checks if the showMessage() function from the SingleObject class behaves as expected. It runs two kinds of tests: a positive test to confirm everything works properly, and a negative test to check that incorrect results are rejected.
     * Parameters: None — the method doesn’t take any input directly.
     * Returns: Nothing (void). Instead, it uses assertions to:
     * 1.Verify that the output matches the correct string ("Hello Singleton Class") in the positive test.
     * 2. Confirm that the output doesn’t match an incorrect string ("Hello Class") in the negative test.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        SingleObject so = SingleObject.getInstance();
        
     /**
         * Positive test
         */
        String expResult = "Hello Singleton Class";
        String result = so.showMessage();
        assertEquals(expResult, result);
        
         /**
         * Negative test
         */ 
        expResult = "Hello Class";
        result = so.showMessage();
        assertNotEquals(expResult, result);
    }  
}
