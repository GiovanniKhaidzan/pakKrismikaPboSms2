/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1.buku;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Buku {
    
    private String isbn;
    private String judulBuku;
    private String author;
    private int harga;
    int count = 0;
    
    public Buku (){
        
    }
    
    public String getIsbn(){
        return this.isbn;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public String getJudulBuku(){
        return this.judulBuku;
    }
    
    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public int getHarga(){
        return this.harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
        
    }
        
    public void tampilBuku(){
        System.out.println("ISBN        :"+this.isbn);
        System.out.println("JUDUL BUKU  :"+this.judulBuku);
        System.out.println("AUTHOR      :"+this.author);
        System.out.println("HARGA       :"+this.harga);
    }
    
    
}
