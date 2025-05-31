/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap.models;
import uap.bases.Shape;
import uap.interfaces.*;

/**
 *
 * @author Lenovo
 */
public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius; // jari-jari bola

    public Sphere() {} 

    // konstruktor Sphere
    public Sphere(double radius) { // menyimpan nilai radius ke dalam atribut objek Sphere
        this.radius = radius;
    }

    // volume bola: 4/3 πr³
    public double getVolume() {
        return 4.0 / 3 * PI * radius * radius * radius; // volume bola
    }

    // luas pk bola: 4πr²
    public double getSurfaceArea() {
        return 4 * PI * radius * radius; // luas permukaan bola
    }

    // // menghitung massa bola 
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // konversi gram ke kg
    public double gramToKilogram() {
        return getMass() / DENOMINATOR; // Konversi gram ke kg 
    }

    // biaya pengiriman
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG; // biaya kirim per kg, dibulatkan ke atas
    }

    // mengeprint semua info sphere
    public void printInfo() {
        System.out.printf("%-20s: %.2f\n", "Volume", getVolume());
        System.out.printf("%-20s: %.2f\n", "Luas permukaan", getSurfaceArea());
        System.out.printf("%-20s: %.2f\n", "Massa", getMass());
        System.out.printf("%-20s: %.2f\n", "Massa dalam kg", gramToKilogram());
        System.out.printf("%-20s: Rp%.0f\n", "Biaya kirim", calculateCost());
    }
}
