    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan54.koordinat;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menampilkan warna dan
 * letak koordinat
 */
public class PBO210117054Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        int y = 4;
        String warna = "Jingga";
        WarnaKoordinat w = new WarnaKoordinat(x,y,warna);
        w.setNamaWarna(warna);
        w.setX(x);
        w.setY(y);
        
        System.out.println("Warna Koordinat : " + w.getNamaWarna());
        System.out.println("Koordinat Sumbu : " + w.getX() + ", y : " + w.getY());
    }
    
}
