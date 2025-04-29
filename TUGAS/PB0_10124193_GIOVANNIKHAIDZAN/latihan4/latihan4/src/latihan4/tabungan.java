/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

public class tabungan {
    double saldoAwal;
    double saldoTarget;
    double bunga;
    int bulan = 0;
    
    void hitungTabunganPerbulan(double saldoAwal, double saldoTarget, double bunga){
       this.saldoAwal = saldoAwal;
       this.saldoTarget = saldoTarget;
       this.bunga = bunga;
       
       while(this.saldoAwal < this.saldoTarget){
           this.saldoAwal += this.saldoAwal * this.bunga;
           this.bulan++;
           System.out.printf("Saldo di bulan ke-%d = Rp. %.0f\n", bulan, this.saldoAwal);
       }
    }
    
    void tampilTabunganPerbulan(){
         System.out.printf("Target tercapai di bulan ke-%d dengan saldo = Rp. %.0f\n", bulan, saldoAwal);
    }
}
