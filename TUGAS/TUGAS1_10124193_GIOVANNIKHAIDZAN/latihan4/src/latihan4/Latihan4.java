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
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String namamhs;
        String kelas;
        String keterangan;
        int nilaiPraktikum;
        int nilaiTugas;
        int nilaiUts;
        int nilaiUas;
        double nilaiAkhir;
        char indeks;
        
        //Operasi Pengisian nilai kedalam variable
        namamhs = "Selamet";
        kelas = "IF-6";
        nilaiPraktikum = 100;
        nilaiTugas = 80;
        nilaiUts = 60;
        nilaiUas = 80;
        
        //Operasi menghitung nilai akhir mahasiswa
        nilaiAkhir = (0.10 * nilaiPraktikum) + (0.20 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);
        
        //Operasi mencetak informasi ke layar konsol
        System.out.println("Nama Mahasiswa :" +namamhs);
        System.out.println("Kelas :" +kelas);
        System.out.println("Nilai Praktikum :" +nilaiPraktikum);
        System.out.println("Nilai Tugas :" +nilaiTugas);
        System.out.println("Nilai UTS :" +nilaiUts);
        System.out.println("Nilai UAS :" +nilaiUas);
        System.out.println("Nilai Akhir :" +nilaiAkhir);
        
        //Menampilkan status mahasiswa
        if(nilaiAkhir>=30) {
            //Badan percabanagan
            System.out.println("Status :" +namamhs+" Dinyatakan LULUS mata kuliah PBO");
    }
        else{
            System.out.println("Status :" +namamhs+" Dinyatakan TIDAK LULUS mata kuliah PBO");
        }
      
      //Membuat operasi konversi nilai akhir
      if((nilaiAkhir >= 80) && (nilaiAkhir <=100)){
          indeks = 'A';
          keterangan = "anda lulus dengan sangat memuaskan";
      }
      else if((nilaiAkhir >=60) && (nilaiAkhir<=80)){
          indeks = 'B';
          keterangan = "anda lulus dengan cukup memuaskan";

      }
      else if((nilaiAkhir >=45) && (nilaiAkhir<=60)){
          indeks = 'C';
          keterangan = "anda lulus dengan memuaskan";

      }    
      else if((nilaiAkhir >=30) && (nilaiAkhir<=45)){
          indeks = 'D';
          keterangan = "anda lulus dengan kurang memuaskan";
      }           
      else {
          indeks = 'E';
          keterangan = "anda tidak lulus";

      }
        System.out.println("Indeks nilai PBO :" +indeks);
        System.out.println(keterangan);
    }
    
}
