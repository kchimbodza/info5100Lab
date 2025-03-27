/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpattern;
/**
 * The ShapeFactory class provides a getShape method that creates and returns an object of the specific shape type (Circle, Rectangle, or Square) 
 * based on the input string, ensuring dynamic object creation, and returns null if the shape type is unsupported or invalid.
 * @author kudzayichimbodza
 * @version 1.0
 */
public class ShapeFactory {
   /**
    * Purpose: This method creates and returns an object of a specific shape (Circle, Rectangle, or Square) based on the input type. It uses the Factory design pattern to simplify shape creation. 
    * @param shapeType: The type of shape requested ("CIRCLE", "RECTANGLE", or "SQUARE"). Case-insensitive.
    * @return A Shape object corresponding to the requested type, or null if the type is invalid or not recognized.
    */
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}
