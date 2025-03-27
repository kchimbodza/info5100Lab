/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletondesignpattern;
/**
 * SingleObject is a class implementing the Design Pattern
 * @author kudzayichimbodza
 * @version 1.0
 */
public class SingleObject {
   
    /**
     * Purpose: Ensures that only one instance of the SingleObject class exists throughout the application. 
     * Rationale: The static keyword allows the instance to be shared globally, while private access prevents external modification, ensuring Singleton behavior.
     */
    private static SingleObject instance = new SingleObject();
    
    /**
     * Purpose: A private constructor prevents external instantiation of the class. 
     * Rationale: This guarantees that the class can only be instantiated internally, enforcing the Singleton design pattern.
     */
    private SingleObject(){
    }
     /**
      * Purpose: This method implements the Singleton design pattern by providing a way to access the single instance of the SingleObject class ensuring that only one object of the SingleObject class is created throughout the application.
      * @return SingleObject: The single instance of the SingleObject class.
     */
    
    public static SingleObject getInstance(){
        return instance;
    }
     /**
      * Purpose: This method outputs a message to the console and returns the same message as a string. 
      * It demonstrates the functionality of the Singleton instance.
      * @return String: The message "Hello Singleton Class" is returned after being printed to the console.
     */
    public String showMessage(){
        System.out.println("Hello Singleton World");
        return"Hello Singleton Class";
    }
}
