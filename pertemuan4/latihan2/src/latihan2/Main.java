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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Daftar film yang akan tayang di unikom tv");
        Film film1 = new Film("Naruto");
        film1.tambahFilm("PUNKROCK", 8.2, 100);
        film1.tampilFilm();
        System.out.println();

        Film film2 = new Film("Boruto");
        film2.tambahFilm("PUNKROCK", 8.2, 100);
        film2.tampilFilm();
        System.out.println();

        Film film3 = new Film("Sasuke");
        film3.tambahFilm("PUNKROCK", 8.2, 100);
        film3.tampilFilm();
    }
    
}
