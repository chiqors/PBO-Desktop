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
public class Nilai {
    
    public double rataRata;
    public double jumlahNilai = 0;
    
    public void hitungNilai(int jumlahSiswa) {
        int i;
        double nilai;
        Scanner scn = new Scanner(System.in);
        
        for(i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scn.nextDouble();
            jumlahNilai = jumlahNilai + nilai;
        }
    }
    
    public double hitungRata2Nilai(double jumlahNilai, int jumlahSiswa) {
        rataRata = jumlahNilai / jumlahSiswa;
        return rataRata;
    }
}
