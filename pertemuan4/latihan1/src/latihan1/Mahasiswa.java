/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Mahasiswa {
    //properties
    String namaMhs;
    String nim;
    String kelas;
    String programStudi;
    String angkatan;
    final String UNIVERSITAS = "UNIKOM";
    
    Mahasiswa(){
        //construktor
        System.out.println("text ini akan tampil saat program tampil di terminal");
    }
    //method
    void tambahDataMhs(String namaMhs, String nim, String kelas, String studi, String angkatan){
        this.namaMhs = namaMhs;
        this.nim = nim;
        this.kelas = kelas;
        this.programStudi = studi;
        this.angkatan = angkatan;
    }
    
    void tampilDataMhs(){
        System.out.println("Nama mahasiswa : "+namaMhs);
        System.out.println("Nim            : "+nim);
        System.out.println("Kelas          : "+kelas);
        System.out.println("Program Studi  : "+programStudi);
        System.out.println("Angkatan       : "+angkatan);
        System.out.println("Universitas    : "+UNIVERSITAS);

    }
}   
