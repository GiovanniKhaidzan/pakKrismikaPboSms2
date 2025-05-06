/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Daftar film yang akan tayang di unikom tv");
        System.out.println("=========================================");
        Film film1 = new Film("Spiderman 3");
        film1.tambahFilm("ACTION, ADVANTURE, FANTASY", 8.2, 100);
        film1.tampilFilm();
        System.out.println();

        Film film2 = new Film("Frozen 2");
        film2.tambahFilm("ANIMATION, ADVANTURE, COMEDY", 8.2, 90);
        film2.tampilFilm();
        System.out.println();

        Film film3 = new Film("Kimi No Nawa");
        film3.tambahFilm("ANIMATION, DRAMA, SUPRANATURAL", 8.2, 103);
        film3.tampilFilm();
    }
    
}
