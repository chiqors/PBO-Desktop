/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk memasukkan login data
 */
public class PBO210117054Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User signin = new User();
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Username\t: ");
        String user = scn.next();
        System.out.print("Masukkan Password\t: ");
        String pass = scn.next();
        System.out.println();
        
        signin.pengecekanLogin(user,pass);
    }
    
}
