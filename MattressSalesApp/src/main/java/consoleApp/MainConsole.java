/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleApp;

import java.util.Scanner;
/**
 *
 * @author Student
 */

public class MainConsole {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Setup single-dimensional array for names
        String[] names = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };
        
        // Setup two-dimensional array for sales (3 products, 3 months)
        int[][] sales = new int[3][3];

        // Ask the user for input
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + names[i] + ": ");
                sales[i][j] = input.nextInt();
            }
        }

        // Create objects
        Product productObj = new Product(sales, names);
        PrintProduct printer = new PrintProduct();

        // Print the report
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");
        printer.PrintTotal(productObj);
        printer.PrintAverage(productObj);
        printer.PrintPopular(productObj);

        input.close();
    }
}
