/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan4.kambing;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program deklarasi variabel lokal
 *                        lalu mengaksesnya
 */
public class PBO210117054Latihan4Kambing {

    /**
     * @param args the command line arguments
     */
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210117054Latihan4Kambing kambingJantan = new 
        PBO210117054Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
