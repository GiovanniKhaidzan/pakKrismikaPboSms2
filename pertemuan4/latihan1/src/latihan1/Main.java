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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        System.out.println("Tampil data mahasiswa ke 1");
        mhs1.tambahDataMhs("Giovanni Khaidzan", "10124193", "if-5", "Teknik komputer", "2024");
        mhs1.tampilDataMhs();
        
        System.out.println("\n");
        
        System.out.println("Tampil data mahasiswa ke 2");
        mhs2.tambahDataMhs("Izal julian", "10124197", "if-5", "Teknik komputer", "2024");
        mhs2.tampilDataMhs();
    }
    
}
