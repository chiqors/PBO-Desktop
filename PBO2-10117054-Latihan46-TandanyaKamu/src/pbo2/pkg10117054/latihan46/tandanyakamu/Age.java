/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117054.latihan46.tandanyakamu;

/**
 *
 * @author
 * NAMA                 : Chiqo Rifky Saputra
 * KELAS                : PBO2
 * NIM                  : 10117054
 * Deskripsi Program    : Program ini berisi program untuk menghitung umur dan
 * dan detail tanda-tanda usia.
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return this.yearNow - this.yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        if(umur >= 0 && umur <= 5) {
            this.red = "LAGI LUCU-LUCUNYA";
            return red;
        } else if(umur > 5 && umur <= 10) {
            this.red = "MASIH ANAK-ANAK";
            return red;
        } else if(umur > 10 && umur <= 13) {
            this.red = "MASIH REMAJA";
            return red;
        } else if(umur > 13 && umur <= 19) {
            this.red = "ALAY";
            return red;
        } else if(umur > 19 && umur <= 29) {
            this.red = "LAGI GALAU NYARI JODOH";
            return red;
        } else if(umur > 29 && umur <= 35) {
            this.red = "LAGI SIBUK NYARI UANG";
            return red;
        } else if(umur > 35 && umur <= 150) {
            this.red = "SUDAH TUA";
            return red;
        } else {
            this.red = "TIDAK TERDETEKSI DI KEHIDUPAN";
            return red;
        }
    }
}
