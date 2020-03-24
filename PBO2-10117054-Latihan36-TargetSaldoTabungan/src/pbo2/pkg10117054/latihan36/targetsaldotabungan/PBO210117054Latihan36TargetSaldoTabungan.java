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
public class PBO210117054Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoTabungan = 3500000;
        double bunga = 0.08;
        double saldoBulanan = 0;

        TargetSaldo tst = new TargetSaldo();
        tst.hitungSaldoTabungan(saldoTabungan, saldoBulanan, bunga);
    }
    
}
