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
public class DosenLayanan extends Dosen{
    private String homeBase;
    private int honorSks;

    /**
     * @return the homeBase
     */
    public String getHomeBase() {
        return homeBase;
    }

    /**
     * @param homeBase the homeBase to set
     */
    public void setHomeBase(String homeBase) {
        this.homeBase = homeBase;
    }

    /**
     * @return the honorSks
     */
    public int getHonorSks() {
        return honorSks;
    }

    /**
     * @param honorSks the honorSks to set
     */
    public void setHonorSks(int honorSks) {
        this.honorSks = honorSks;
    }
    
    public void tambahDataDosen(String homeBase, int honorSks, String namaDosen, String prodi){
        this.namaDosen = namaDosen;
        this.prodi = prodi;
        this.honorSks = honorSks;
        this.homeBase = homeBase;
    }
    public void tampilDataDosenLayanan(){
        System.out.println("=====================================");
        System.out.println("=============DOSEN LAYANAN===========");
        System.out.println("=====================================");
        System.out.println("Asal                : "+this.homeBase);
        this.tampilDataDosen();
        System.out.println("Honor sks           : "+this.honorSks);
    }
}
