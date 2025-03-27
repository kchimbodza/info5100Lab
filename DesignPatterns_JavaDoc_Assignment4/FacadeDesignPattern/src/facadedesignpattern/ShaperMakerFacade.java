/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;
/**
 * The ShaperMakerFacade class simplifies the process of drawing shapes by encapsulating 
 * the creation of shape objects and providing methods to draw a circle, rectangle, and square.
 * @author kudzayichimbodza
 * @version 1.0
 * 
 */
public class ShaperMakerFacade {
    /**
     * Purpose: Stores an instance of the Circle class, enabling the facade to delegate circle-related operations. 
     * Rationale: Simplifies interaction by encapsulating the complexity of circle management.
     */
    private Shape circle;
    
    /**
     * Purpose: Stores an instance of the Rectangle class for rectangle-related operations via the facade. 
     * Rationale: Provides an abstraction layer for managing rectangles in a clean and accessible way.
     */
    private Shape rectangle;
    
    /**
     * Purpose: Holds an instance of the Square class, making it easy to delegate square-related operations. 
     * Rationale: Supports shape-drawing functionality while keeping the design simple and cohesive.
     */
    private Shape square;
    
    /**
     * Purpose: Sets up the facade by creating instances of Circle, Rectangle, and Square. This makes it easy to manage and draw shapes.
     */
    public ShaperMakerFacade(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square= new Square();
    }   
    /**
     * Purpose: Draws a circle by delegating the task to the Circle object.
     * Returns: A string showing the drawing result: "Circle::Draw()".
     */
    public String drawCircle(){
        return this.circle.draw();
    }   
    /**
     * Purpose: Draws a rectangle by delegating the task to the Rectangle object.
     * Returns: A string showing the drawing result: "Rectangle::Draw()".
     */
    public String drawRectangle(){
        return this.rectangle.draw();
    }   
    /**
     * Purpose: Draws a square by delegating the task to the Square object.
     * Returns: A string showing the drawing result: "Square::Draw()".
     */
    public String drawSquare(){
        return this.square.draw();
    }
}
