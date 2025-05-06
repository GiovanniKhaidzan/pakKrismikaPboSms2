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
public class Dosen {
    protected String namaDosen;
    protected String prodi;
    
    public void tampilStatus(){
        System.out.println(this.namaDosen+ " bekerja sebagai dosen di UNIKOM");
    }
    
    public void tampilDataDosen(){
        System.out.println("Nama dosen          : "+this.namaDosen);
        System.out.println("Prodi               : "+this.prodi);
    }
}
