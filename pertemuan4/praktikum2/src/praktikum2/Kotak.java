/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Kotak {
    private String bentuk;
    private int sisi;
    private int panjang;
    private int lebar;
    private int tinggi;
    
    
    public Kotak(){
        
    }
    public Kotak(int sisi){
        this.sisi = sisi;
        this.bentuk = "kubus";
    }
    
    public Kotak (int panjang, int lebar , int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.bentuk = "balok";
    }
    
    


    public String getBentuk() {
        return bentuk;
    }


    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

  
    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

   
    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }


    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public int hitungVolumeKubus(Kotak kubus){
        int volume;
        volume = kubus.sisi * kubus.sisi * kubus.sisi;
        
        return volume;
    }
    
    public int hitungVolumeBalok(Kotak balok){
        int volume;
        volume = balok.panjang * balok.lebar *  balok.tinggi;
        
        return volume;
    }
    
}
