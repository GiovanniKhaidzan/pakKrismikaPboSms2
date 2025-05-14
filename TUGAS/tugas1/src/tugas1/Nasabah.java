    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package tugas1;

    /**
     *
     * @author GIOVANI DAVINCI
     */
    public class Nasabah extends Tabungan{

        public void dataNasabah(){
            setNama("Giovanni Khaidzan");
            setNoRek(1092836280);
            setAlamat("Banjaran, Bandung Selatan");
            setSaldoTb(9000000);
        }

        @Override
        public void tampilDataNasabah(){
            System.out.println("DATA TABUNGAN BANK MAJU MUNDUR");
            System.out.println("==============================");
            System.out.println("Nama Nasabah   : "+getNama());
            System.out.println("No Rekening    : "+getNoRek());
            System.out.println("Alamat         : "+getAlamat());
            System.out.println("Saldo Tabungan : "+getSaldoTb());
        }

    }
