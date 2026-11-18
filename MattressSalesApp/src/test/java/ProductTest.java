/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import consoleApp.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Student
 */

public class ProductTest {
    
    @Test
    public void GetTotalProductsSales_WithValidData_ReturnsCorrectValue() {
        String[] names = {"A", "B", "C"};
        int[][] data = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        Product p = new Product(data, names);
        
        // Total should be 153 based on the prompt screenshot
        assertEquals(153, p.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] names = {"A", "B", "C"};
        int[][] data = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        Product p = new Product(data, names);
        
        // 153 total / 9 months = 17
        assertEquals(17.0, p.GetAverageProductSold(), 0.01);
    }
}
    