/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan50.energikinetik;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung energi
 * kinetik dan nilai usahanya
 */
public class EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola();
        b.setMassa(145);
        b.setKecepatan(25);
        System.out.println("1 buah baseball dengan massa = " + b.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " + b.getKecepatan() + " m/s");
        
        double massa = b.getMassa();
        double kecepatan = b.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + b.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + b.usaha());
        System.out.println("Catatan : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
}
