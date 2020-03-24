/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk menghitung aritmatika
 */
public class PBO210117054Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator k = new Kalkulator();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan angka ke-1 : ");
        Double value1 = scn.nextDouble();
        System.out.print("Masukkan angka ke-2 : ");
        Double value2 = scn.nextDouble();
        System.out.println();
        System.out.println("Hasil Pertambahan : " + k.tambahBilangan(value1,value2));
        System.out.println("Hasil Pengurangan : " + k.kurangBilangan(value1,value2));
        System.out.println("Hasil Perkalian : " + k.kaliBilangan(value1,value2));
        System.out.println("Hasil Pembagian : " + k.bagiBilangan(value1,value2));
        System.out.println("Hasil Sisa Pembagian : " + k.sisaBilangan(value1,value2));
    }
    
}
