/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleApp;

/**
 *
 * @author Student
 */

public class PrintProduct {
   
    public void PrintTotal(Product p) {
        System.out.println("TOTAL PRODUCT SALES: " + p.GetTotalProductsSold());
    }

    public void PrintAverage(Product p) {
        System.out.println("AVERAGE PRODUCT SALES: " + (int)p.GetAverageProductSold());
    }

    public void PrintPopular(Product p) {
        System.out.println("MOST POPULAR PRODUCT: " + p.GetMostPopularProduct());
    }
}
