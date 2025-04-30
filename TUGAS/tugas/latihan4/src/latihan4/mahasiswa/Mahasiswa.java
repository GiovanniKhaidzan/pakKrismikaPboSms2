package latihan4.mahasiswa;
import latihan4.nilai.Nilai;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Mahasiswa {
    private String namaMhs;
    private String nimMhs;
    private String kelas;
    private String programStd;
    private Nilai nilai;
    private double rataRata; 
    private char indeks;
    
    
    public Mahasiswa(){
    
    }
    
    
    
    public Mahasiswa(String namaMhs, String nimMhs, String kelas, int prak, int tgs, int uts, int uas){
        this.namaMhs = namaMhs;
        this.nimMhs = nimMhs;
        this.kelas = kelas;
        this.programStd = "Teknik informatika";
        this.nilai = new Nilai(prak,tgs,uts,uas);
    }

    /**
     * @return the namaMhs
     */
    public String getNamaMhs() {
        return namaMhs;
    }

    /**
     * @param namaMhs the namaMhs to set
     */
    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    /**
     * @return the nimMhs
     */
    public String getNimMhs() {
        return nimMhs;
    }

    /**
     * @param nimMhs the nimMhs to set
     */
    public void setNimMhs(String nimMhs) {
        this.nimMhs = nimMhs;
    }

    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    /**
     * @return the programStd
     */
    public String getProgramStd() {
        return programStd;
    }

    /**
     * @param programStd the programStd to set
     */
    public void setProgramStd(String programStd) {
        this.programStd = programStd;
    }

    public double getRataRata(){
        return rataRata;
    }
    
    public char getIndeks(){
        return indeks;
    }
    
    public Nilai getNilai(){
        return nilai;
    }
    
    public void hitungRataRata(){
        rataRata = (nilai.getTgs() + nilai.getPrak() + nilai.getUas()+ nilai.getUts()) / 4;
    }
    
   
    public void indeksNilai() {
        if (rataRata > 79) {
            indeks = 'A';
        } else if (rataRata > 69 && rataRata < 80) {
            indeks = 'B';
        } else if (rataRata > 59 && rataRata < 70) {
            indeks = 'C';
        } else if (rataRata > 49 && rataRata < 60) {
            indeks = 'D';
        } else {
            indeks = 'E';
        }
    }
    
    public void tampilData(int urutan) {
    System.out.println("======= Mahasiswa ke-" + urutan + " =======");
    System.out.println("Nama mahasiswa  : " + this.getNamaMhs());
    System.out.println("Nim mahasiswa   : " + this.getNimMhs());
    System.out.println("Kelas           : " + this.getKelas());
    System.out.println("Program Studi   : " + this.getProgramStd());
    System.out.println("Nilai Praktikum : " + nilai.getPrak());
    System.out.println("Nilai Tugas     : " + nilai.getTgs());
    System.out.println("Nilai UTS       : " + nilai.getUts());
    System.out.println("Nilai UAS       : " + nilai.getUas());
    System.out.println("Nilai Akhir     : " + rataRata);
    System.out.println("Indeks Nilai    : " + indeks);
}

    
    
}
