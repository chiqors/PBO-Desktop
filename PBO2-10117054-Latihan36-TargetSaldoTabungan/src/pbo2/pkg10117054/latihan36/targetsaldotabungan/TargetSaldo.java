/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk mneghitung berapa
 * lamanya menabung untuk mencapai target tabungan dengan ditambah bunga
 * perbulannya
 */
public class TargetSaldo {
    public void hitungSaldoTabungan(int saldoTabungan, double saldoBulanan, double bunga) {
        int i;
        for(i = 1; saldoTabungan<=6000000; i++) {
            saldoBulanan = bunga * saldoTabungan;
            saldoTabungan = (int) (saldoTabungan + saldoBulanan);
            System.out.println("Saldo di Bulan ke-" + i + " Rp."
                    + saldoTabungan);
        }
    }
}
