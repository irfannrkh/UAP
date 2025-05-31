/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uap.mains;
import uap.models.Torus;
import uap.models.Sphere;
import java.util.Scanner;
import uap.bases.Shape;

/**
 *
 * @author Lenovo
 */
// kelas utama (entry point) program
public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // header tampilan 
        System.out.println("============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("MUKHAMAD IRFAN NUR KHAKIM"); 
        System.out.println("245150701111021");          
        System.out.println("============================================");

        // Input dan output untuk donat dengan lubang (torus)
        System.out.println("Donat dengan lubang");
        System.out.println("============================================");
        System.out.print("Isikan Radius\t: ");
        double R = input.nextDouble(); // radius besar
        System.out.print("Isikan radius\t: ");
        double r = input.nextDouble(); // radius kecil
        System.out.println("============================================");

        Shape torus = new Torus(R, r); 
        torus.printInfo(); // tampilkan info torus

        // Input dan output untuk donat tanpa lubang (bola)
        System.out.println("============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("============================================");
        System.out.print("Isikan radius\t: ");
        double rad = input.nextDouble(); // radius bola
        System.out.println("============================================");

        Sphere bola = new Sphere(rad); 
        bola.printInfo(); //  info bola

        System.out.println("============================================");

        input.close(); // tutup scanner
    }
}

