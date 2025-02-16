/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import model.User;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class PrimaryFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    TextField nameTextField;
    
    @FXML
    TextField ageTextField;
    
    @FXML
    TextField emailTextField;
    
    public void submit(){
        
  try {
        User userObject = new User();
        
        // Initialize Object
        userObject.setName(this.nameTextField.getText());
        userObject.setEmail(this.emailTextField.getText());
        userObject.setAge(Integer.parseInt(this.ageTextField.getText()));

            if (userObject.getAge() <= 0 || userObject.getAge() >=100)   {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText("Invalid number");
            errorAlert.setContentText("Acceptable age is from 1 to 99 years");
            errorAlert.showAndWait();
            return;
            } else if (userObject.getName().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText("Name is blank!");
            errorAlert.setContentText("Please enter a valid name");
            errorAlert.showAndWait();
            return;
        } else if (userObject.getEmail().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Input Error");
            errorAlert.setHeaderText("Email is blank!");
            errorAlert.setContentText("Please enter a valid email address!");
            errorAlert.showAndWait();
            return;
        } else 
       
        System.out.println(" Thanks for submitting");
        System.out.println(userObject);
        
        //Alert
        Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("Success!");
        userAlert.setHeaderText("Thanks for Submitting");
        userAlert.setContentText("" + userObject);
        userAlert.showAndWait( );
    } catch (NumberFormatException e) {
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle("Input Error");
        errorAlert.setHeaderText("Invalid Age Input");
        errorAlert.setContentText("Please enter a valid number for age.");
        errorAlert.showAndWait();
        }
    }
}
