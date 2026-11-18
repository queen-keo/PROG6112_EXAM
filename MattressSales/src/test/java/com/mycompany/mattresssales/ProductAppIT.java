/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mattresssales;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ProductAppIT {
  
    
//For Unit Test 1
    
@Test
public void GetVat_WithValidData_ReturnsCorrectValue() {

    
    ProductCalculations product =
        new ProductCalculations(3500);
        double result = product.GetVat();
        
        assertEquals(525.0, result, 0.001);
    }

//Unit Test 2 


@Test
public void GetTotal_WithValidData_ReturnsCorrectValue() {

   
    ProductCalculations product =
        new ProductCalculations(3500);
        double result = product.GetTotal();
        
        assertEquals(4200.0, result, 0.001);
    }
}
