/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpattern;

/**
 *The FactoryPatternDemo class demonstrates the Factory design pattern by using a ShapeFactory 
 * to create shape objects like Circle, Rectangle, and Square, and calling their draw methods.
 * @author kudzayichimbodza
 * @version 1.0
 */
public class FactoryPatternDemo {
    /**
     * Purpose: This method is the starting point of the program. It demonstrates the Factory design pattern by using ShapeFactory to create objects for different shapes (Circle, Rectangle, Square). It calls the draw() method for each shape to perform their unique actions.
     * Parameters: String[] args: Command-line arguments passed to the program (not used in this example).
     * Returns: None (void): The method doesn't return anything; it simply runs the shape creation and drawing logic. 
     */
    public static void main(String[] args) {
        
        /**
         * Purpose: This is an instance of the ShapeFactory class, responsible for creating specific shape objects (Circle, Rectangle, Square) based on the provided input. 
         * Rationale: Encapsulates the object creation process, allowing you to easily request shapes without directly instantiating them. This demonstrates the Factory design pattern.
         */
      ShapeFactory shapeFactory = new ShapeFactory();
  
     /**
      * Purpose: These are Shape references that hold objects created by the factory, such as Circle, Rectangle, and Square. 
      * Rationale: These variables store the different shapes created by ShapeFactory, making it easy to call their respective draw() methods 
      * and demonstrate polymorphism.
   */
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      /**
       * call draw method of Circle
       */
      shape1.draw();

      /**
       * get an object of Rectangle and call its draw method.
       */
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      /**
       * call draw method of Rectangle
       */
      shape2.draw();

      /**
       * get an object of Square and call its draw method.
       */
      Shape shape3 = shapeFactory.getShape("SQUARE");

      /**
       * call draw method of square
       */
      shape3.draw();
   }
}
