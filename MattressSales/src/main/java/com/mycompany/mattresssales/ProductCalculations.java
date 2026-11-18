/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Student
 */

public class ProductCalculations implements IProductCalculations {

    private double price;

    // Constructor
    public ProductCalculations(double price) {
        this.price = price;
    }

    // Calculate VAT (15%)
    @Override
    public double GetVat() {

        return price * 0.15;
    }

    // Calculate Commission (5%)
    @Override
    public double GetCommission() {

        return price * 0.05;
    }

    // Calculate Total Sale Amount
    @Override
    public double GetTotal() {

        return price + GetVat() + GetCommission();
    }
}
