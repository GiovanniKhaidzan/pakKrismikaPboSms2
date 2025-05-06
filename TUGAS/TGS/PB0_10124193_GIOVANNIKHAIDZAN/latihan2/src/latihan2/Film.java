/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;


//
public class Film {
    String namaFilm;
    String genre;
    double rating;
    int durasi;
    
    Film(String namaFilm){
        this.namaFilm = namaFilm;
    }
    void tambahFilm(String genre, double rating, int durasi){
        this.genre = genre;
        this.rating = rating;
        this.durasi = durasi;
    }
            
    void tampilFilm(){
        System.out.println("Nama film   : "+namaFilm);
        System.out.println("Genre film  : "+genre);
        System.out.println("Rating film : "+rating);
        System.out.println("Durasi      : "+durasi+" menit");
    }
}
