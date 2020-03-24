/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung tegangan
 * listrik
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat "
                + "penghantar akan berbanding lurus dengan beda potensial "
                + "pada ujung-ujung kawat penghantar tersebut asalkan suhu "
                + "kawat dijaga konstan");
        System.out.println();
    }
    
    public Baterai(float kuat, float hamb) {
        this.kuatArus = kuat;
        this.hambatan = hamb;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}
