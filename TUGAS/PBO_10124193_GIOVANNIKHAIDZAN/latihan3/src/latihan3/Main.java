package latihan3;
import java.util.Scanner;
import latihan3.bangunRuang.BangunRuang;


/**
 *
 * @author GIOVANI DAVINCI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputPilih = new Scanner(System.in);
        String ulang;

        do {
            BangunRuang bangunruang = new BangunRuang();
            bangunruang.menuPilihan();
            System.out.print("Pilihan Anda : ");
            bangunruang.setPilih(inputPilih.nextInt());
            bangunruang.menentukanMenu();

            System.out.print("\nKembali ke menu utama? (Y/T): ");
            ulang = inputPilih.next();

        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Program selesai. Terima kasih.");

    }
    
}
