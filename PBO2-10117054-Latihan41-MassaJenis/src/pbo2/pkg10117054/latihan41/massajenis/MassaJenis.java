/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung massa
 * jenis dan menampilkannya
 */
public class MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus kub = new Kubus();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Massa Jenis=====");
        System.out.print("Sisi : ");
        int sisi = scn.nextInt();
        System.out.print("Massa : ");
        int massa = scn.nextInt();

        kub.setSisi(sisi);
        kub.setMassa(massa);
        int volume = kub.hitungVolume(sisi);

        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + kub.hitungMassaJenis(massa,volume));
    }
    
}
