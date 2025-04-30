package latihan4;
import java.util.Scanner;
import latihan4.mahasiswa.Mahasiswa;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.print("Berapa banyak mahasiswa yang ingin dimasukkan? ");
        int jumlah = input.nextInt();
        input.nextLine(); 
        Mahasiswa[] dataMhs = new Mahasiswa[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();

            System.out.print("Nilai Praktek : ");
            int prak = input.nextInt();
            System.out.print("Nilai Tugas   : ");
            int tgs = input.nextInt();
            System.out.print("Nilai UTS     : ");
            int uts = input.nextInt();
            System.out.print("Nilai UAS     : ");
            int uas = input.nextInt();
            input.nextLine(); 

            dataMhs[i] = new Mahasiswa(nama, nim, kelas, prak, tgs, uts, uas);
            dataMhs[i].hitungRataRata();
            dataMhs[i].indeksNilai();
        }

       System.out.println("\n========== DATA SEMUA MAHASISWA ==========");
       for (int i = 0; i < dataMhs.length; i++) {
            dataMhs[i].tampilData(i + 1);
}

    }
    
}
