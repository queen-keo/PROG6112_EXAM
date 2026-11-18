/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */

public class Product implements IProduct {

    // a one-dimensional array for product names
    private String[] productNames = {
        "Cozy Nights Monarch mattress",
        "Restonic Barbados mattress",
        "Sealy Phuket mattress"
    };

    // a two-dimensional array for monthly sales
    private int[][] sales = new int[3][3];

    // created a constructor
    public Product(int[][] sales) {
        this.sales = sales;
    }

    // Calculating the total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    // Calculating the average products sold
    @Override
    public int GetAverageProductSold() {

        int total = GetTotalProductsSold();

        return total / (sales.length * sales[0].length);
    }

    // here we are determining the most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularIndex = i;
            }
        }

        return productNames[popularIndex] +
               "(" + highestSales + ")";
    }
}
