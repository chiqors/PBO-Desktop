/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan48.kalkulator;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung nilai1 dan
 * nilai2 dengan pertambahan, pengurangan, perkalian dan pembagian
 */
public class Kalkulator {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject(String nameProject) {
        System.out.println(nameProject);
    }
    
    public void setNoteProject(String noteProject) {
        System.out.println(noteProject);
    }
    
    public double add(double value1, double value2) {
        return value1 + value2;
    }
    
    public double minus(double value1, double value2) {
        return value1 - value2;
    }
    
    public double multiplication(double value1, double value2) {
        return value1 * value2;
    }
    
    public double division(double value1, double value2) {
        return value1 / value2;
    }
}
