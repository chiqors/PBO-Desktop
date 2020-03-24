/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan48.kalkulator;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung nilai1 dan
 * nilai2 dengan pertambahan, pengurangan, perkalian dan pembagian
 */
public class Hitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();
        
        System.out.print("Masukkan Value 1 : ");
        double a = scn.nextDouble();
        System.out.print("Masukkan Value 2 : ");
        double b = scn.nextDouble();
        System.out.println();
        
        kal.setNameProject("Project Calculator");
        kal.setNoteProject("The project shown you how to manage method in java");
        
        System.out.println();
        System.out.println("Result Add is = " + kal.add(a, b));
        System.out.println("Result Minus is = " + kal.minus(a, b));
        System.out.println("Result Multiple = " + kal.multiplication(a, b));
        System.out.println("Result Division = " + kal.division(a, b));
    }
    
}
