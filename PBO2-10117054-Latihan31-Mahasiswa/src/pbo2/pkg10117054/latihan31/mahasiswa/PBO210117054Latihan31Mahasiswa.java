/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan31.mahasiswa;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk menampilkan nim dan nama
 * Mahasiswa
 */
public class PBO210117054Latihan31Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10117054";
        mhs.nama = "Chiqo Rifky Saputra";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);
        
        System.out.println();
        
        mhs.nim = "10117055";
        mhs.nama = "Ajeng";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);
    }
}
