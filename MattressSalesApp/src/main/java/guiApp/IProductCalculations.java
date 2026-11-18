/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guiApp;

/**
 *
 * @author Student
 */

public interface IProductCalculations {
    
    double GetVat(double Price);
    double GetCommission(double price);
    double GetTotal(double price);
}
