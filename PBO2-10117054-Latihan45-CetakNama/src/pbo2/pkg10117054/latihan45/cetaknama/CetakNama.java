/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menampilkan nama
 * dalam jumlah cetak yang ditentukan oleh user
 */
public class CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Printer pr = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        String nama = scn.next();
        System.out.print("Mau Cetak Berapa? : ");
        int cetak = scn.nextInt();
        System.out.println();
        
        pr.setNama(nama);
        pr.setJmlCetak(cetak);
        pr.cetak(nama);
        pr.cetak(cetak, nama);
    }
    
}
