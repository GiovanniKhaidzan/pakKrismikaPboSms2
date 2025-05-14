package tugas1;

import java.util.Scanner;

/**
 * Author: GIOVANI DAVINCI
 */
public class Tabungan {
    protected String nama;
    protected int noRek;
    protected String alamat;
    protected int saldoTb;
    protected int pilih;

    protected static Scanner input = new Scanner(System.in);

    public Tabungan() {}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoRek() {
        return noRek;
    }

    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getSaldoTb() {
        return saldoTb;
    }

    public void setSaldoTb(int saldoTb) {
        this.saldoTb = saldoTb;
    }

    public int getPilih() {
        return pilih;
    }

    public void setPilih(int pilih) {
        this.pilih = pilih;
    }

    public void tampilDataNasabah() {
        System.out.println("===== DATA NASABAH =====");
        System.out.println("Nama    : " + getNama());
        System.out.println("No. Rek : " + getNoRek());
        System.out.println("Alamat  : " + getAlamat());
        System.out.println("Saldo   : " + getSaldoTb());
    }

    // Pengisian saldo
    public void isiTabungan() {
        System.out.println("===== MENU PENGISIAN TABUNGAN =====");
        System.out.println("Saldo Saat Ini : " + getSaldoTb());
        System.out.print("Masukkan Nominal Uang : ");
        int isiSaldo = input.nextInt();
        input.nextLine();
        saldoTb += isiSaldo;
        System.out.println("Saldo Setelah Diisi : " + saldoTb);
    }

    public void tarikSaldo() {
        System.out.println("===== MENU PENARIKAN TABUNGAN =====");
        System.out.println("Saldo Saat Ini : " + getSaldoTb());
        System.out.print("Masukkan Nominal Uang : ");
        int tarik = input.nextInt();
        input.nextLine();
        if (tarik > saldoTb) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldoTb -= tarik;
            System.out.println("Saldo Setelah Penarikan : " + saldoTb);
        }
    }

    public void menu() {
        int pilihan;

        do {
            System.out.println("\n=== APLIKASI ATM BANK MAJU MUNDUR ===");
            System.out.println("1. Lihat Data Tabungan");
            System.out.println("2. Pengisian Saldo Tabungan");
            System.out.println("3. Penarikan Saldo Tabungan");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");
            
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tampilDataNasabah();
                    break;
                case 2:
                    isiTabungan();
                    break;
                case 3:
                    tarikSaldo();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }
}
