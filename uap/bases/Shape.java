/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap.bases;

/**
 *
 * @author Lenovo
 */
// kelas abstrak sesuai dengan yang di class diagram
public abstract class Shape {
    private String name;

    public Shape() {}

    // setter nama bentuk
    public void setName(String inputName) {
        this.name = inputName;
    }

    // getter nama bentuk
    public String getName() {
        return this.name;
    }

    // method abstrak untuk menampilkan informasi bentuk
    public abstract void printInfo();
}

