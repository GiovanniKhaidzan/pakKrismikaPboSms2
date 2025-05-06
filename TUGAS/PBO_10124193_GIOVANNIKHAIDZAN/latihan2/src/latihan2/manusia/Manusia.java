/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.manusia;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Manusia {
    private int tahunLahir ;
    int tahun = 2025;
    private int umurKamuSaatIni;
    private String keterangan;
    
    public Manusia(){
        System.out.println("=======APLIKASI TANDA NYA KAMU=======");
    }
    public Manusia(int tahunLahir){
        this.tahunLahir = tahunLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
    
    public int getUmur() {
        return umurKamuSaatIni;
    }

    public void setUmur(int umurKamuSaatIni) {
        this.umurKamuSaatIni = umurKamuSaatIni;
    }
    
    public String getKet() {
        return keterangan;
    }

    public void setKet(String keterangan) {
        this.keterangan = keterangan;
    }
    
    
    public void hitungUmur(){
       this.umurKamuSaatIni = (this.tahun - this.tahunLahir);
    }
    
    public void KeteranganUmur(){
        if (umurKamuSaatIni < 5 &&  umurKamuSaatIni >= 0){
            this.keterangan = "Lagi Lucu Lucu Nya";
        } else if (umurKamuSaatIni < 10 && umurKamuSaatIni >= 5){
            this.keterangan = "masih anak anak";
        } else if (umurKamuSaatIni < 13 && umurKamuSaatIni >= 10){
            this.keterangan = "masih remadja";
        } else if (umurKamuSaatIni < 19 && umurKamuSaatIni >= 13){
            this.keterangan = "alay";
        } else if (umurKamuSaatIni < 29 && umurKamuSaatIni >= 19){
            this.keterangan = "lagi galau nyari jodoh";
        } else if (umurKamuSaatIni < 35 && umurKamuSaatIni >= 29 ){
            this.keterangan = "lagi sibuk nyari uang";
        } else if (umurKamuSaatIni < 150 && umurKamuSaatIni >= 35){
            this.keterangan = "sudah tua";
        } else {
            this.keterangan = "tidak terdeteksi kehidupan";
        }
    }
    
    public void tampilUmur(){
        System.out.println("========Hasil Perhitungan Umur=======");
        System.out.println("tahun lahir anda   : "+this.tahunLahir);
        System.out.println("hari ini tahum     : "+this.tahun);
        System.out.println("umur kamu saat ini : "+this.umurKamuSaatIni);
        System.out.println("TANDANYA KAMU      : "+this.keterangan);
        
    }
    
}
