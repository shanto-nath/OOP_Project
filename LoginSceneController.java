/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginSceneController implements Initializable {
    @FXML private ComboBox<String> userTypeComboBox;
    @FXML private PasswordField passwordTextField;
    @FXML private TextField idTextField;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       userTypeComboBox.getItems().addAll("CEO","CFO","Customer","Regulatory Officer","HR Manager","Retailer","System Administrator","Shop Clerk");
    } 

   
    @FXML
    private void newaccbutton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("NewAccountCreate.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.show();
    }
    @FXML
    private void loginOnMouseClick(ActionEvent event) throws IOException {
        if(userTypeComboBox.getValue().equals("CEO")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("CEO.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("GeneralManagerDashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userTypeComboBox.getValue().equals("CFO")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("CFO.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("ProducerDashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userTypeComboBox.getValue().equals("Customer")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Customer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("DirectorDashboardScene.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userTypeComboBox.getValue().equals("Regulatory Officer")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Regulatory Officer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("ProductionManagerdashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userTypeComboBox.getValue().equals("HR Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("HR Manager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("ArtistDashBoard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userTypeComboBox.getValue().equals("Retailer")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Retailer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("MarketingManagerDashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userTypeComboBox.getValue().equals("System Administrator")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("System Administrator.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("VenueManagerDashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userTypeComboBox.getValue().equals("Shop Clerk")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Shop Clerk.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    } else {
                        Alert();
                        }
                    
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }

    
    }
    
    private void Alert(){
        Alert a2 = new Alert(Alert.AlertType.ERROR);
        a2.setTitle("Warning ");
        a2.setHeaderText("LogIn Failed");
        a2.setContentText("Wrong ID/Password. Please Try Again");
        a2.showAndWait();
        }

    private static class idTextField {

        private static Object getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public idTextField() {
        }
    }

    private static class passwordTextField {

        private static Object getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public passwordTextField() {
        }
    }
    
    
}
