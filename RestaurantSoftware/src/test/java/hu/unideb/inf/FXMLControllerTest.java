/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;


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
    
    @AfterEach
    public void tearDown() {
        
    }

    @Test
    public void testItCanWriteATest() {
        
    }
    
   
    @Test
    public void testHandleButtonFunctionWhenNumberIs0() {
        String foodName = "Palacsinta";
        int foodPrice = 299;
        int number = 0;
        FXMLController instance = new FXMLController();
        instance.handleButtonFunction(foodName, foodPrice);
        assertEquals(1,number);
        
    }
    
    @Test
    public void test() {
        int number = 0;
        ActionEvent ae = new ActionEvent();
        FXMLController instance = new FXMLController();
        instance.handleButtonNumber4Action(ae);
        assertEquals(4, number);
    }
    
}
