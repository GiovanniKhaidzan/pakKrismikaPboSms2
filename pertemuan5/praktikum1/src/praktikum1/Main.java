/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;


/**
 *
 * @author GIOVANI DAVINCI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DosenLayanan dosenLayanan = new DosenLayanan();
        dosenLayanan.tambahDataDosen("telkom bandung", 1000000, "giovanni khaidzan", "Teknik informatika");
        dosenLayanan.tampilDataDosenLayanan();
        dosenLayanan.tampilStatus();
        
        DosenTetap dosenTetap = new DosenTetap();
        dosenTetap.tambahDataDosen("10283201", 1200000, "fajar sidik", "teknik informatika");
        dosenTetap.tampilDosenTetap();
        dosenTetap.tampilStatus();
        
        
    }
    
}
