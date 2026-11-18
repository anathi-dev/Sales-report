/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleApp;

/**
 *
 * @author Student
 */

public class Product implements IProduct {
    private int[][] salesData;
    private String[] productNames;

    // Constructor to receive the arrays
    public Product(int[][] salesData, String[] productNames) {
        this.salesData = salesData;
        this.productNames = productNames;
    }

    public int GetTotalProductsSold() {
        int total = 0;
        // Loop through the 2D array to add all numbers
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int totalMonths = 0;
        // Count how many months there are in total
        for (int i = 0; i < salesData.length; i++) {
            totalMonths += salesData[i].length;
        }
        // Use Math.round to get a whole number average like the example
        return Math.round((double) total / totalMonths);
    }

    public String GetMostPopularProduct() {
        int maxSales = -1;
        String popularProduct = "";
        
        // Loop through each product (row)
        for (int i = 0; i < salesData.length; i++) {
            int currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
            }
            // Check if this product sold more than the previous highest
            if (currentProductTotal > maxSales) {
                maxSales = currentProductTotal;
                popularProduct = productNames[i] + "(" + maxSales + ")";
            }
        }
        return popularProduct;
    }

    @Override
    public int GetTotalProductSold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double GetAverageProductDold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String GetMOstPopularProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    