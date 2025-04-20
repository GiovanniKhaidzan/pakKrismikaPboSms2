/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namamhs;
        String kelas;
        String keterangan;
        int nilaiPraktikum;
        int nilaiTugas;
        int nilaiUts;
        int nilaiUas;
        double nilaiAkhir;
        char indeks;
        
        namamhs = "GiooVanni";
        kelas = "IF 5";
        nilaiPraktikum = 90;
        nilaiTugas = 95;
        nilaiUts = 90;
        nilaiUas = 70;
        nilaiAkhir = (0.1 * nilaiPraktikum)+(0.2 * nilaiTugas)+(0.3 * nilaiUts)+(0.4 * nilaiUas);
        
        System.out.println("Nama Mahasiswa    :" +namamhs);
        System.out.println("Kelas             :" +kelas);
        System.out.println("Nilai Praktikum   :" +nilaiPraktikum);
        System.out.println("Nilai Tugas       :" +nilaiTugas);
        System.out.println("Nilai UTS         :" +nilaiUts);
        System.out.println("Nilai UAS         :" +nilaiUas);
        System.out.println("Nilai Akhir       :" +nilaiAkhir);
        
       
        
      if((nilaiAkhir >= 80) && (nilaiAkhir <=100)){
          indeks = 'A';
          keterangan = "Status            :"+namamhs+" anda lulus dengan sangat memuaskan";
      }
      else if((nilaiAkhir >=60) && (nilaiAkhir<80)){
          indeks = 'B';
          keterangan ="Status             :"+namamhs+ " anda lulus dengan cukup memuaskan";

      }
      else if((nilaiAkhir >=45) && (nilaiAkhir<60)){
          indeks = 'C';
          keterangan = "Status            :"+namamhs+" anda lulus dengan memuaskan";

      }    
      else if((nilaiAkhir >=30) && (nilaiAkhir<45)){
          indeks = 'D';
          keterangan = "Status            :"+namamhs+" anda lulus dengan kurang memuaskan";
      }           
      else {
          indeks = 'E';
          keterangan = "Status            :"+namamhs+" anda tidak lulus";

      }
        System.out.println("Indeks nilai PBO  :" +indeks);
        System.out.println(keterangan);
    
    }
    
}
