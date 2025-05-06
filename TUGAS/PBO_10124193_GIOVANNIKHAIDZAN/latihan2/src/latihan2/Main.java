package latihan2;
import latihan2.manusia.Manusia;
import java.util.Scanner;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        Manusia manusia1 = new Manusia();
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        manusia1.setTahunLahir(inputData.nextInt());
        manusia1.hitungUmur();
        manusia1.KeteranganUmur();
        manusia1.tampilUmur();
                
    }
    
}
