/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Dosen extends Member {
    
    @Override
    public void isiData(){
        setStatus("Dosen");
        System.out.println("=====INPUT DATA DOSEN=====");
        System.out.print("NIDN          : ");
        setNidn(input.nextInt());
        input.nextLine(); // <-- Tambahkan ini

        System.out.print("Nama Lengkap  : ");
        setName(input.nextLine());

        System.out.print("Alamat        : ");
        setAlamat(input.nextLine());

        System.out.print("Email         : "); // ini sebelumnya 'println', salah
        setEmail(input.nextLine());

        statusNotif();
    }
   @Override
   public void statusNotif(){
       System.out.println(getName()+"Telat terdaftar sebagai "+getStatus()+", password nya adalah : "+getNidn()+" email telat etrkirim ke alamat : "+getEmail());
       
   }
    
}
