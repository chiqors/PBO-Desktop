/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan44.hukumohm;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung tegangan
 * listrik
 */
public class HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        Baterai bt1 = new Baterai();
        System.out.print("Masukkan Kuat Arus : ");
        float ka = scn.nextFloat();
        System.out.print("Masukkan Hambatan : ");
        float hb = scn.nextFloat();
        
        System.out.println();
        
        Baterai bt2 = new Baterai(ka, hb);
        float total = bt2.hitungTegangan();
        System.out.println("Hasil Tegangan = " + total + " Volt");
    }
    
}
