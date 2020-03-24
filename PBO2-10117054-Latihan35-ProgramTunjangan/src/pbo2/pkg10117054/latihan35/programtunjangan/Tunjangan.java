/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan35.programtunjangan;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk memghitung berapa besar
 * tunjangan dan gaji total yang akan diterima
 */
public class Tunjangan {
    public double tunjangan;
    public double totalGaji;
    
    public void doTunjangan(Double gajiPokok, String status) {
        System.out.println("=========Hasil Perhitungan Gaji==========");
        System.out.println("Gaji Pokok/t/t: " + gajiPokok);

        //tunjangan
        tunjangan = (status.equals("Menikah")) ? 0.35 * gajiPokok : 0;

        System.out.println("Tunjangan : Rp. " + tunjangan);
        //totalgaji
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Gaji : Rp. " + totalGaji);
    }
}
