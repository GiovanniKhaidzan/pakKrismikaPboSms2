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
public class Balok extends BangunDatar{
    private final double panjang;
    private final double lebar;

    
    public Balok( double panjang,double lebar ){
        this.panjang = panjang;   
        this.lebar = lebar;
        setNama("BALOK");
    }
    
    @Override
    public double hitungVolume(){
       return panjang * lebar ;
    }
    
    @Override
    public void tampilVolume(){
        System.out.println("TAMPIL VOLUME BALOK");
        System.out.println("Panjang Balok   = "+this.panjang);
        System.out.println("Lebar Balok     = "+this.lebar);
    }
    
}
