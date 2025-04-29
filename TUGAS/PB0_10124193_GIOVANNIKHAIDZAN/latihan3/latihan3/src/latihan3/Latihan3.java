/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hitungLuasDanKeliling persegi = new hitungLuasDanKeliling();
        persegi.hitungKelLuasPersegi(10);
        persegi.tampilKelLuasPersegi();
        
        hitungLuasDanKeliling persegiPanjang = new hitungLuasDanKeliling();
        persegiPanjang.hitungKelLuasPersegiPanjang(10, 5);
        persegiPanjang.tampilKelLuasPersegiPanjang();
        
        hitungLuasDanKeliling lingkaran = new hitungLuasDanKeliling();
        lingkaran.hitungLingkaran(7);
        lingkaran.tampilLingkaran();
    }
    
}
