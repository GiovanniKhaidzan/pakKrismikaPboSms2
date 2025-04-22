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
    String namaMhs;
    String nim;
    String kelas;
    String programStudi;
    String angkatan;
    final String UNIVERSITAS = "UNIKOM";
            
    void tambahDataMhs(String ParamNama, String ParamNim, String ParamKelas, String ParamStudi, String ParamAngkatan){
        namaMhs = ParamNama;
        nim = ParamNim;
        kelas = ParamKelas;
        programStudi = ParamStudi;
        angkatan = ParamAngkatan;
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
