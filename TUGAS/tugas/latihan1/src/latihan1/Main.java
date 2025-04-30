package latihan1;
import latihan1.printer.Printer;
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
        // TODO code application logic here
        Scanner inputData = new Scanner(System.in);
        Printer printer1 = new Printer();
        System.out.print("Masukan Nama Anda : "); printer1.setNamaAnda(inputData.nextLine());
        System.out.print("Masukan Berapa Kali Di Cetak : "); printer1.setCetakBerapaKali(inputData.nextInt());
        printer1.tampilNama();
        
        
        
    }
    
}
