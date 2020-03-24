/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk memghitung berapa besar
 * tunjangan dan gaji total yang akan diterima
 */
public class PBO210117054Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok;
        String status;

        Tunjangan tj = new Tunjangan();
        Scanner scn = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        gajiPokok = scn.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum) ? : ");
        status = scn.next();
        System.out.println();
        
        tj.doTunjangan(gajiPokok,status);
        System.out.println("Developed By : Chiqo Rifky Saputra");
    }
    
}
