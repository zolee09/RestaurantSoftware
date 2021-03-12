
package hu.unideb.inf;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class FXMLControllerTest {
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {

    }
/*
    @Override
    public void start(Stage stage) throws IOException {
        
// Create the FXMLLoader
        FXMLLoader loader = new FXMLLoader();
// Path to the FXML File
        String fxmlDocPath = "E://gitprojekt//RestaurantSoftware-master//RestaurantSoftware//src//main//resources//fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
// Create the Pane and all Details
        VBox root = (VBox) loader.load(fxmlStream);
// Create the Scene
        Scene scene = new Scene(root,300,300);
// Set the Scene to the Stage
        stage.setScene(scene);
// Set the Title to the Stage
        stage.setTitle("A simple FXML Example");
// Display the Stage
        stage.show();
        
    }
*/


    public FXMLControllerTest() {
    }
    
    @Test 
    public void empty() {
        
    }
    /*
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        FXMLController instance = new FXMLController();
        instance.initialize(url, rb);

    }

    @Test
    public void testHandleButtonNumber4Action() {
        System.out.println("handleButtonNumber4Action");
        ActionEvent event=null;
        int number=0;
        FXMLController instance = new FXMLController();
        instance.handleButtonNumber4Action(event);
        assertEquals(4,number);


    }
    @Test
    public void testHandleButtonFunctionWhenNumberIs0() {
        String foodName = "Palacsinta";
        int foodPrice = 299;
        int number = 0;
        FXMLController instance = new FXMLController();
        instance.handleButtonFunction(foodName, foodPrice);
        assertEquals(1, number);
    }
    @Test
    public void testHandleButtonFunction() {
        System.out.println("handleButtonFunction");
        String foodName = "alma";
        int foodPrice = 1;
        FXMLController instance = new FXMLController();
        instance.handleButtonFunction(foodName, foodPrice);

    }*/

}