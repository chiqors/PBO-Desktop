/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung gaji
 * karyawan dan manager
 */
public class PBO210117054Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan kar = new Karyawan();
        Manager man = new Manager();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukkan NIK : ");
        String nik = scn.next();
        System.out.print("Masukkan Nama : ");
        String nama = scn.next();
        System.out.print("Masukkan Golongan (1/2/3) : ");
        int golongan = scn.nextInt();
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        String jabatan = scn.next();
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int hadir = scn.nextInt();
        
        man.setNik(nik);
        man.setNama(nama);
        man.setJabatan(jabatan);
        man.setGolongan(golongan);
        man.setKehadiran(hadir);
        
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK : " + man.getNik());
        System.out.println("NAMA : " + man.getNama());
        System.out.println("GOLONGAN : " + man.getGolongan());
        System.out.println("JABATAN : " + man.getJabatan());
        
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN : " + man.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN : " + man.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN : " + man.tunjanganKehadiran(hadir));
        
        System.out.println();
        System.out.println("Gaji Total : " + man.gajiTotal());
    }
    
}
