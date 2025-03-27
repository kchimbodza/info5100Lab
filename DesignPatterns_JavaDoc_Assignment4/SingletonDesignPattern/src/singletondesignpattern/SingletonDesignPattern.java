
package singletondesignpattern;
/**
 * Provides the implementation of the Singleton Design Pattern.
 * @author kudzayichimbodza
 * @version 1.0
 */
public class SingletonDesignPattern {
  /**
     * Purpose: This is the entry point for a Java application which demonstrates the usage of the Singleton pattern by obtaining the single instance of the SingleObject class through the getInstance() method, and then calling the showMessage() method to display a message.
     * @param args An array of String arguments passed to the application from the command line. In this context, it is not used but is required for the method signature in Java.
     */
    public static void main(String[] args) { 
        SingleObject so =SingleObject.getInstance();
        so.showMessage();
    } 
}
