/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

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
        tabungan tabungan1 = new tabungan();
        tabungan1.hitungTabunganPerbulan(1000000, 2000000, 0.10);
        tabungan1.tampilTabunganPerbulan();
    }
    
}
