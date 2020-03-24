/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk menghitung Lingkaran
 */
public class PBO210117054Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String d;
        double diameter; //operand
        Scanner scn = new Scanner(System.in);
        Lingkaran circle = new Lingkaran();
        
        System.out.println("===Perhitungan Lingkaran===");
        
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scn.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        
        System.out.println("===Hasil Perhitungan Lingkaran===");
        diameter = Double.parseDouble(d); 
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",circle.jari2Lingkaran(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm %n",circle.luasLingkaran(circle.jari2Lingkaran(diameter)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",circle.kelilingLingkaran(circle.jari2Lingkaran(diameter)));
    }
    
}
