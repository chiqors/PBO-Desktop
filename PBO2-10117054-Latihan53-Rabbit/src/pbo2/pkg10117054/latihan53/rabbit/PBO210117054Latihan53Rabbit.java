/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan53.rabbit;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menampilkan data 
 * kelinci
 */
public class PBO210117054Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit r = new Rabbit("Peter",false,"grass",4,"grey");
        r.isVegetarian();
        r.getEats();
        r.getNoOfLegs();
        
        System.out.println("Hello, his name is " + r.getName());
        System.out.println(r.getName() + " is Vegetarian? " + r.isVegetarian());
        System.out.println(r.getName() + " eats " + r.getEats());
        System.out.println(r.getName() + " color is " + r.getColor());
    }
    
}
