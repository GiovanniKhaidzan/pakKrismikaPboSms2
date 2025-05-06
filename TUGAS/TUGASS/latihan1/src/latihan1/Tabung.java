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
public class Tabung extends BangunDatar{
    private final double jariJariTabung;
    private final double tinggiTabung;
    
    public Tabung(double jariJariTabung, double tinggiTabung){
        this.jariJariTabung = jariJariTabung;
        this.tinggiTabung = tinggiTabung;
        setNama("TABUNG");
    }
    @Override
    
    public double hitungVolume(){
        double phi = 3.14;
        return phi * jariJariTabung * jariJariTabung * tinggiTabung; 
    }
    
    @Override
    public void tampilVolume(){
        System.out.println("TAMPIL VOLUME TABUNG");
        System.out.println("Jari Jari Tabung = "+this.jariJariTabung);
        System.out.println("Tinggi Tabung    = "+this.tinggiTabung);
    }
}
