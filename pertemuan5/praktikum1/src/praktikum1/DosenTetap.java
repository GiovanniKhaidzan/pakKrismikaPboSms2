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
public class DosenTetap extends Dosen{
    private String nip;
    private int gajiBulan;
    
    
    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * @return the gajiBulan
     */
    public int getGajiBulan() {
        return gajiBulan;
    }

    /**
     * @param gajiBulan the gajiBulan to set
     */
    public void setGajiBulan(int gajiBulan) {
        this.gajiBulan = gajiBulan;
    }
    
    public void tambahDataDosen(String nip ,int gajiBulan, String namaDosen ,String prodi){
        this.nip = nip;
        this.gajiBulan = gajiBulan;
        super.namaDosen = namaDosen;
        super.prodi = prodi;
    }
    
    public void tampilDosenTetap(){
        System.out.println("=====================================");
        System.out.println("==============DOSEN TETAP============");
        System.out.println("=====================================");
        System.out.println("Nip                 : "+this.nip);
        super.tampilDataDosen();
        System.out.println("Gaji Bulan          : "+this.gajiBulan);

    }
}
