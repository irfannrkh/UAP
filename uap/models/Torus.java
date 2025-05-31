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
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius; // jari-jari utama (dari pusat ke tengah tabung)
    private double minorRadius; // jari-jari kecil (radius tabung)

    public Torus() {}
    // Konstruktor Torus
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;// mnyimpan nilai jari-jari besar (jarak dari pusat ke pusat lubang)
        this.minorRadius = minorRadius;// menyimpan nilai jari-jari kecil (jari-jari penampang lingkaran)
    }

    // volume torus: 2π²Rr²
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;// rumus volume torus
    }

    // luas permukaan torus: 4π²Rr
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;// rumus luas pk torus 
    }

    // massa = DENSITAS × LUAS PERMUKAAN × TEBAL
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS; // ini massa torus dalam gram
    }

    // konversi gram ke kilogram
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // biaya kirim dibulatkan ke atas per kg
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    // menampilkan semua info torus
    public void printInfo() {
        System.out.printf("%-20s: %.2f\n", "Volume", getVolume());
        System.out.printf("%-20s: %.2f\n", "Luas permukaan", getSurfaceArea());
        System.out.printf("%-20s: %.2f\n", "Massa", getMass());
        System.out.printf("%-20s: %.2f\n", "Massa dalam kg", gramToKilogram());
        System.out.printf("%-20s: Rp%.0f\n", "Biaya kirim", calculateCost());
    }
}
