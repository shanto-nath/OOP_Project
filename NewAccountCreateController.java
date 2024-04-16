/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class NewAccountCreateController implements Initializable {
    @FXML private ComboBox<String> newselectuser;
    @FXML private PasswordField passwordTextField;
    @FXML private TextField idTextField;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       newselectuser.getItems().addAll("CEO","CFO","Customer","Regulatory Officer","HR Manager","Retailer","System Administrator","Shop Clerk");
    }     
    }    
    

