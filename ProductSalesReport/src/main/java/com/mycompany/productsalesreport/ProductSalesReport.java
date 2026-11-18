/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;
import java.util.Scanner;

/**
 *
 * @author Student
 */

import java.util.Scanner;

public class ProductSalesReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // These are the Product names
        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress" };

        // creating Two-dimensional array for sales
        int[][] sales = new int[3][3];

        // Here we are getting the sales information from user
        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(
                    "Enter number of sales for month "
                    + (j + 1) + " for "
                    + productNames[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // We are creating a Product object
        Product product = new Product(sales);

        // We are creating a PrintProduct object
        PrintProduct printer = new PrintProduct(product);

        // This will show our results
        printer.PrintReport();

        input.close();
    }
}

        
