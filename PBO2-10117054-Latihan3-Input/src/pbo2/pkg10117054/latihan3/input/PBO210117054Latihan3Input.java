/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk memasukkan nilai
 *                        dari keyboard dan menampilkan ke layar
 */
public class PBO210117054Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan nama anda : ");
        Scanner scn = new Scanner(System.in);
        
        String nama = scn.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
