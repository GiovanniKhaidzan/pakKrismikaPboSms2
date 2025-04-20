/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menampilkan bilangan genap dari 1 s/d 100");
        System.out.println("========================================");

        int count = 0; // menghitung jumlah bilangan genap per baris

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i);

                count++;

                // Kalau belum 5 angka di baris ini, tambahkan koma
                if (count % 5 != 0 && i != 100) {
                    System.out.print(", ");
                } else {
                    System.out.println(); // ganti baris
                }
            }
        }
    }
    
}
