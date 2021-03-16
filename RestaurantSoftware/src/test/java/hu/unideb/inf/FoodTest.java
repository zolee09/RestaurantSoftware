package hu.unideb.inf;

import hu.unideb.inf.Food;
import hu.unideb.inf.FoodDataReader;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.BDDMockito.given;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.Test;
//git
public class FoodTest {
    
    @Mock
    private Food underTest1, underTest2;
    private FoodDataReader fdr;
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        FoodDataReader fdr = mock(FoodDataReader.class);
        given(fdr.getName()).willReturn("Palacsinta", "Aranygaluska");
        given(fdr.getPrice()).willReturn(299, 499);
        given(fdr.getQuantity()).willReturn(1, 2);
        
        underTest1 = Food.scannedFood(fdr);
        underTest2 = Food.scannedFood(fdr);
        
        verify(fdr, times(2)).getName();
        verify(fdr, times(2)).getPrice();
        verify(fdr, times(2)).getQuantity();
    }
    
    @Test
    public void testSetQuantity() {
        //Food food = new Food(1, "Name", 1);
        underTest2.setQuantity(10);
        assertEquals(10, underTest2.getQuantity());
    }
    
    @Test
    public void testSetName() {
        //Food food = new Food(1, "Name", 1);
        underTest1.setName("Test");
        assertEquals("Test", underTest1.getName());

    }
    @Test
    public void testSetPrice() {
        //Food food = new Food();
        underTest2.setPrice(1);
        assertEquals(1, underTest2.getPrice());
    }


    @Test
    public void testToString() {
        String expected = "1 x Palacsinta, 299Ft";
        assertEquals(expected, underTest1.toString());
    }
}

