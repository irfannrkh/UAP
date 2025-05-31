/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uap.interfaces;

/**
 *
 * @author Lenovo
 */
// Interface untuk menghitung biaya pengiriman berdasarkan berat
public interface ShippingCostCalculator {
    int PRICE_PER_KG = 2000;
    double calculateCost();
}
