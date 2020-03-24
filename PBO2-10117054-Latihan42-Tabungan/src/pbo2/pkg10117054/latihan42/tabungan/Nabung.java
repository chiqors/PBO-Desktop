/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung penarikan
 * uang dari saldo awal
 */
public class Nabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);

        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        int uang = scn.nextInt();
        System.out.print("Jumlah ang yang diambil : ");
        int ambil = scn.nextInt();

        Tabungan tab = new Tabungan(uang);
        int saldonow = tab.ambilUang(ambil);
        System.out.println();
        System.out.println("Saldo Anda Sekarang : " + saldonow);
    }
    
}
