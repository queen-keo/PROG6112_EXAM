/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */

public class PrintProduct {

    private Product product;

    
    public PrintProduct(Product product) {
        this.product = product;
    }

    
    public void PrintTotalProductSales() {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    
    public void PrintAverageProductSales() {

        System.out.println("AVERAGE PRODUCT SALES: "
                + product.GetAverageProductSold());
    }

    
    public void PrintMostPopularProductSales() {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

    // showing the report
    public void PrintReport() {

        System.out.println("\nPRODUCT SALES REPORT - 2026");

        System.out.println(
            "\n********************************************");

        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProductSales();

        System.out.println(
            "********************************************");
    }
}

