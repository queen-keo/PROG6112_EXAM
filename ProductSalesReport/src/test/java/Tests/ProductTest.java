/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Tests;

/**
 *
 * @author Student
 */

import com.mycompany.productsalesreport.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
public void GetTotalProductsSales_WithValidData_ReturnsCorrectValue() {


    int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    Product product = new Product(sales);
    int result = product.GetTotalProductsSold();

    assertEquals(153, result);
}

//For Unit Test 2

@Test
public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

    // Arrange
    int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    Product product = new Product(sales);
    int result = product.GetAverageProductSold();
    
    assertEquals(17, result);
}

}