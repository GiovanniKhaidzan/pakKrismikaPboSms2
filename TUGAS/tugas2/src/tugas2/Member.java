/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Member {
    protected int nidn;
    protected String name;
    protected String alamat;
    protected String email;
    protected int pilih;
    protected String status;
    
    protected static Scanner input = new Scanner(System.in);

    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPilih() {
        return pilih;
    }

    public void setPilih(int pilih) {
        this.pilih = pilih;
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner aInput) {
        input = aInput;
    }
    
    public void isiData(){}
    public void statusNotif(){}
    public void menu2(){
       int pilihan;
       do{
        System.out.println("========================");
        System.out.println("FORM TAMBAH DATA ANGGOTA");
        System.out.println("========================");
        System.out.println("1. Tambah data dosen");
        System.out.println("2. Tambah data karyawan");
        System.out.println("3. Tambah data mahasiswa");
        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
                case 1:
                    Dosen dosen = new Dosen();
                    dosen.isiData();
                    break;
                case 2:
                    System.out.println("Tambah data karyawan");
                    break;
                case 3:
                    System.out.println("Tambah data mahasiswa");
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
       } while (pilihan != 4);
    }
    
    public void menuUtama(){
       int pilihan;
       do{
        System.out.println("=========================");
        System.out.println("SISTEM INFORMASI AKADEMIK");
        System.out.println("=========================");
        System.out.println("1. Tambah Member");
        System.out.println("2. Keluar");
        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
                case 1:
                    menu2();
                    break;
                case 2:
                    System.out.println("Keluar");
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
       } while (pilihan != 2);
     
        
        
    }
    
    
    
}
