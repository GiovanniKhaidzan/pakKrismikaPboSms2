
package latihan3.bangunRuang;
import java.util.Scanner;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class BangunRuang {
    private int pilih;
    private int jariJari;
    private int tinggi;
    private int panjang;
    private int lebar;
    double phi = 3.14;
    
    Scanner inputJr = new Scanner(System.in);
    Scanner inputTinggi = new Scanner(System.in);
    Scanner inputPanjang = new Scanner(System.in);
    Scanner inputLebar = new Scanner(System.in);


    
    public BangunRuang(){
        System.out.println("Program menghitung VOLUME bangun ruang");
        System.out.println("======================================");
    }

    public void menuPilihan(){
        System.out.println("1. Volume Balok");
        System.out.println("2. Volume Tabung");
        System.out.println("3. Volume Bola");
    }
    public int getPilih() {
        return pilih;
    }

    public void setPilih(int pilih) {
        this.pilih = pilih;
    }
    
    
    public void menuTabung(){
        System.out.println("");
        System.out.println("==================================");
        System.out.println("Menu Tabung");
        System.out.println("Masukan nilai jari jari dan tinggi");
        System.out.println("==================================");
        System.out.print("Jari jari : ");
        this.jariJari= inputJr.nextInt();
        System.out.print("Tinggi    : ");
        this.tinggi = inputTinggi.nextInt();
        tampilTabung();

    }
    
    public void tampilTabung(){
        double volumeTabung = this.phi * jariJari * jariJari * tinggi;
        System.out.println();
        System.out.println("Tampil Volume Tabung : "+volumeTabung);
        System.out.println("==================================");

    }

 
    public int getJariJari() {
        return jariJari;
    }


    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }


    public int getTinggi() {
        return tinggi;
    }

 
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

  
    public int getPanjang() {
        return panjang;
    }

   
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public void menuBalok(){
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("Menu Balok");
        System.out.println("Masukan nilai panjang, lebar dan tinggi");
        System.out.println("=======================================");
        System.out.print("Panjang : ");
        this.panjang= inputPanjang.nextInt();
        System.out.print("Tinggi  : ");
        this.tinggi = inputTinggi.nextInt();
        System.out.print("Lebar   : ");
        this.lebar = inputLebar.nextInt();
        System.out.println();
        tampilBalok();
    }
    
    public void tampilBalok(){
        double volumeBalok = this.panjang * this.tinggi * this.lebar;
        System.out.println("Volumen balok : "+volumeBalok);
        System.out.println("=======================================");

    }
    
    public void menuJariJari(){
        System.out.println("");
        System.out.println("==================================");
        System.out.println("Menu Bola");
        System.out.println("Masukan nilai jari jari");
        System.out.println("==================================");
        System.out.print("Jari jari : ");
        this.jariJari = inputJr.nextInt();
        tampilBola();
        
    }
    
    public void tampilBola(){
        double volumeBola = (4.0/3.0) * phi * jariJari * jariJari * jariJari;
        System.out.println();
        System.out.println("Volume Bola : " + volumeBola);
        System.out.println("==================================");
    }

    
    
    public void menentukanMenu(){
        switch(this.pilih){
            case 1 :
                menuBalok();
                break;
            case 2 :
                menuTabung();
                break;
            case 3 :
                menuJariJari();
                break;
            default:
                System.out.println("Pilihan tidak ada");
        }
    }
    
    
}
