/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal;
        double bunga;
        double saldoTarget;
        int bulan;
        
        saldoAwal = 1000000;
        bunga = 0.10;
        saldoTarget = 2000000;
        bulan = 1;
        
        while(saldoAwal < saldoTarget){
            saldoAwal += saldoAwal * bunga;
            System.out.printf("Saldo di bulan ke-%d = Rp. %.0f\n", bulan, saldoAwal);
            bulan++;
        }
    }
    
}
