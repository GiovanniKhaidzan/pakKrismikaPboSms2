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
public class Bola extends BangunDatar {
    private final int jarijariBola;
    
    public Bola (int jarijariBola){
        this.jarijariBola = jarijariBola;
        setNama("BOLA");
    }
    
    @Override 
    public double hitungVolume(){
        double pi = 3.141592653589793;
        double rCubed = jarijariBola * jarijariBola * jarijariBola; 
        return (4.0 / 3.0) * pi * rCubed;
    }
    @Override 
    public void tampilVolume(){
        System.out.println("TAMPIL BOLA");
        System.out.println("Jari Jari Bola =  "+this.jarijariBola);
        
    }
}
