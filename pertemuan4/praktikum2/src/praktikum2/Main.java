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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak kotak = new Kotak();
        Kotak kotak2 = new Kotak(6);
        Kotak kotak3 = new Kotak(10,8,6);
        
        System.out.println("Volume Kubus : "+kotak.hitungVolumeKubus(kotak2));
        System.out.println("Volume Balok  : "+kotak.hitungVolumeBalok(kotak3));
        
        
        
    }
    
}
