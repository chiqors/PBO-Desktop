/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk menghitung rata - rata
 * nilai Mahasiswa
 */
public class PBO210117054Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahSiswa;
        Scanner scn = new Scanner(System.in);
        Nilai rata2 = new Nilai();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahSiswa = scn.nextInt();
        
        rata2.hitungNilai(jumlahSiswa);
        System.out.println("Rata-rata nilai : " + rata2.hitungRata2Nilai(rata2.jumlahNilai, jumlahSiswa));
    }
    
}
