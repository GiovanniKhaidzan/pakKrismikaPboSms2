package praktikum1;
/**
 *
 * @author GIOVANI DAVINCI
 */


public class Mahasiswa {
    //PROPERTIES
    String namaMahasiswa;
    String nim;
    String kelas;
    char gender;
    final String Univ = "UNIKOM";
    
    //METHOD
    void tambahDataMhs(String ParamNamaMahasiswa, String ParamNim, String ParamKelas){
        namaMahasiswa = ParamNamaMahasiswa;
        nim = ParamNim;
        kelas = ParamKelas;
             
    }
    
    void tampilDataMhs(){
        System.out.println("Nama mahasiswa  : " +namaMahasiswa);
        System.out.println("Nim mahasiswa   : " +nim);
        System.out.println("Kelas mahasiswa : " +kelas);
        System.out.println("Universitas: " +Univ);
            
    }
    
  
        
}