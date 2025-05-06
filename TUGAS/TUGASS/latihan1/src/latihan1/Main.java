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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balok balok = new Balok(10,5);
        Tabung tabung = new Tabung(10, 8);
        Bola bola = new Bola(10);
        
        CetakVolume.cetak(balok);
        System.out.println("");
        CetakVolume.cetak(tabung);
        System.out.println("");
        CetakVolume.cetak(bola);

    }
    
}
