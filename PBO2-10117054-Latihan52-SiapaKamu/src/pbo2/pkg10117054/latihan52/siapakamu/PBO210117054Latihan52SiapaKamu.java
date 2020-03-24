/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan52.siapakamu;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menampilkan mahasiswa
 * dan dosen
 */
public class PBO210117054Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dos = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        dos.setNama("Rizky");
        dos.setUmur(27);
        dos.setMataKuliah("PBO");

        mhs.setNama("Chiqo RS");
        mhs.setUmur(19);
        mhs.setKelas("PBO-2");

        dos.mengajarApa();
        System.out.println();
        mhs.kelasApa();
    }
    
}
