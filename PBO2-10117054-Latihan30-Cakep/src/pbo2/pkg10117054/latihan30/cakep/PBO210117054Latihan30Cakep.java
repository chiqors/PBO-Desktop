/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Chiqo Rifky Saputra
 * Kelas : PBO2 
 * Nim : 10117054
 * Deskripsi Program : Program ini berisi program untuk menanyakan bila
 * user mengerjakan program secara sendirian atau bersamaan
 */
public class PBO210117054Latihan30Cakep {

    public static void main(String[] args) {
        String jawab;
        Warna warni = new Warna();
        Scanner scn = new Scanner(System.in);
        
        System.out.print(warni.ANSI_RED + "Kamu " + warni.ANSI_RESET);
        System.out.print(warni.ANSI_GREEN + "ngerjain sendiri " + warni.ANSI_RESET);
        System.out.print(warni.ANSI_YELLOW + "latihan 17 sampe " + warni.ANSI_RESET);
        System.out.print(warni.ANSI_BLUE + "latihan 30 ini? \n" + warni.ANSI_RESET);
        System.out.print(warni.ANSI_BLUE + "Jawab " + warni.ANSI_RESET);
        System.out.print(warni.ANSI_RED + "(Yoi/Enggak) : " + warni.ANSI_RESET);
        jawab = scn.next();
        
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(warni.ANSI_RED + "\nCakep Bener. " + warni.ANSI_RESET);
            System.out.print(warni.ANSI_PURPLE + "Good Job \n" + warni.ANSI_RESET);
        }else{
            System.out.print(warni.ANSI_RED + "\nTetep cakep sih. "+warni.ANSI_RESET);
            System.out.print(warni.ANSI_CYAN + "\nSing penting paham konsep nya yee. "
                     + warni.ANSI_RESET);
            System.out.print(warni.ANSI_BLACK + "\nKeep the code works dude." +
                    warni.ANSI_RESET);  
        }
    }
    
}
