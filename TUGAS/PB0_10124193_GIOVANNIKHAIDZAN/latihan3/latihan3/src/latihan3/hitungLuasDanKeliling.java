/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class hitungLuasDanKeliling {
    int sisi;
    int kelPersegi;
    int luasPersegi;
    int panjang;
    int lebar;
    int kelPersegiPanjang;
    int luasPersegiPanjang;
    double jariJari;
    double pi = 3.14;
    double kelilingLingkaran;
    double luasLingkaran;
    
    void hitungKelLuasPersegi(int sisi){
        this.sisi = sisi;
        this.kelPersegi = 4 * sisi;
        this.luasPersegi = sisi * sisi;
    }
    
    void tampilKelLuasPersegi(){
        System.out.println("====================================");
        System.out.println("Menghitung Keliling Dan Luas Persegi");
        System.out.println("====================================");
        System.out.println("Keliling Persegi = " + kelPersegi);
        System.out.println("Luas Persegi     = " + luasPersegi);
        System.out.println();
    }
    
    void hitungKelLuasPersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.kelPersegiPanjang = 2 *(panjang + lebar);
        this.luasPersegiPanjang = panjang * lebar;
    }
    
    void tampilKelLuasPersegiPanjang(){
        System.out.println("=============================================");
        System.out.println("Menghitung Keliling Dan Luas Persegi Panjang");
        System.out.println("=============================================");
        System.out.println("Keliling Persegi Panjang = " + kelPersegiPanjang);
        System.out.println("Luas Persegi Panjang     = " + luasPersegiPanjang);
        System.out.println();
    }
    
    void hitungLingkaran(double jariJari){
        this.jariJari = jariJari;
        this.kelilingLingkaran= 2 * pi * jariJari;
        this.luasLingkaran = pi * jariJari * jariJari;
    }
    
    void tampilLingkaran(){
        System.out.println("=======================================");
        System.out.println("Menghitung Keliling Dan Luas Lingkaran");
        System.out.println("=======================================");
        System.out.printf("Keliling Lingkaran= %.2f\n", kelilingLingkaran);
        System.out.printf("Luas Lingkaran     = %.2f\n", luasLingkaran);
    }
}
