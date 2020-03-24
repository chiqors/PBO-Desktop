/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan39.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra 
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk menghitung nilai 
 * terbesar dan nilai terkecil
 */
public class PBO210117054Latihan39NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int jumlahSiswa;

        Nilai result = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya nilai Mahasiswa :  ");
        jumlahSiswa = scn.nextInt();
        System.out.println();

        result.inputNilaiMahasiswa(jumlahSiswa);
        System.out.println();
        result.tampilNilaiTerbesarTerkecil(jumlahSiswa);
        
        System.out.println("Nilai Terbesar : " + result.max);
        System.out.println("Nilai Terkecil : " + result.min);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
    
}
