/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan19.saldotabungan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk menghitung saldo
 * tabungan ditambah bunga bulanan
 */
public class PBO210117054Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bulan = 6;
        int i = 1;
        int saldoTabungan = 2500000;
        double bunga = 0.15;
        double saldoBulanan;

        //Penghitungan Saldo Bulanan + bunga
        for (i = 1; i <= bulan; i++) {
            saldoBulanan = bunga * saldoTabungan;
            saldoTabungan = (int)(saldoTabungan + saldoBulanan);
            System.out.println("Saldo bulan ke-" + i + " Rp."
                    + (int) saldoTabungan);
        }

    }

}
