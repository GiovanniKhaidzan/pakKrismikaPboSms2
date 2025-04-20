/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 
        int sisi = 10;
        int KelPersegi = 4 * sisi;
        int luasPersegi = sisi * sisi;

        int panjang = 10;
        int lebar = 5;
        int KelPersegiPanjang = 2 * (panjang + lebar);
        int LuasPersegiPanjang = panjang * lebar;

        double jariJari = 7;
        double pi = 3.14; 
        double KelLingkaran = 2 * pi * jariJari;
        double LuasLingkaran = pi * jariJari * jariJari;

        System.out.println("====================================");
        System.out.println("Menghitung Keliling Dan Luas Persegi");
        System.out.println("====================================");
        System.out.println("Keliling Persegi = " + KelPersegi);
        System.out.println("Luas Persegi     = " + luasPersegi);
        System.out.println();

        System.out.println("=============================================");
        System.out.println("Menghitung Keliling Dan Luas Persegi Panjang");
        System.out.println("=============================================");
        System.out.println("Keliling Persegi Panjang = " + KelPersegiPanjang);
        System.out.println("Luas Persegi Panjang     = " + LuasPersegiPanjang);
        System.out.println();

        System.out.println("=======================================");
        System.out.println("Menghitung Keliling Dan Luas Lingkaran");
        System.out.println("=======================================");
        System.out.printf("Keliling Lingkaran= %.2f\n", KelLingkaran);
        System.out.printf("Luas Lingkaran     = %.2f\n", LuasLingkaran);
        
    }
    
}
