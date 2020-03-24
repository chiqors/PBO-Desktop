/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan21.rataratanilai;

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
public class PBO210117054Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahSiswa;
        double rataRata;
        int i;
        double jumlahNilai = 0;
        double nilai;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahSiswa = scan.nextInt();

        for(i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scan.nextDouble();
            jumlahNilai = jumlahNilai + nilai;
        }
        System.out.println("");

        rataRata = jumlahNilai / jumlahSiswa;
        System.out.println("Rata-rata nilai : " + rataRata);
    }

}
