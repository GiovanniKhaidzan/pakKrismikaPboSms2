/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1.printer;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Printer {
    private String namaAnda;
    private int cetakBerapaKali;
    int i;
    
    
    public Printer(){

    }
    
    public Printer(String namaAnda){
        this.namaAnda = namaAnda;
    }
    
    public Printer(int cetakBerapaKali){
        this.cetakBerapaKali = cetakBerapaKali;
        
    
    }

    public String getNamaAnda() {
        return namaAnda;
    }


    public void setNamaAnda(String namaAnda) {
        this.namaAnda = namaAnda;
    }

  
    public int getCetakBerapaKali() {
        return cetakBerapaKali;
    }

    public void setCetakBerapaKali(int cetakBerapaKali) {
        this.cetakBerapaKali = cetakBerapaKali;
    }
    
    public void tampilNama(){
        System.out.println("Nama Anda : "+this.namaAnda);
        System.out.println("Hasil Cetak : ");
        for (i = 0; i < this.cetakBerapaKali; i++){
            System.out.println(i+1+"."+this.namaAnda);
        }
    }
    
    
}
