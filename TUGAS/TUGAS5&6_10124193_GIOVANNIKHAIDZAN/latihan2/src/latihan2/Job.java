package latihan2;
import java.util.Scanner;

public class Job {
    protected String namaChar;
    protected int level;
    protected String namaJob;
    protected String weapoonJob;
    protected int health;
    protected int magic;
    protected int power;
    protected int defend;
    protected int pilih;

    protected static Scanner input = new Scanner(System.in);
    
    public Job() {}

    public Job(String namaChar){
        this.namaChar = namaChar;
    }
    
    
    public String getNamaChar() {
        return namaChar;
    }

    public void setNamaChar(String namaChar) {
        this.namaChar = namaChar;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNamaJob() {
        return namaJob;
    }

    public void setNamaJob(String namaJob) {
        this.namaJob = namaJob;
    }

    public String getWeapoonJob() {
        return weapoonJob;
    }

    public void setWeapoonJob(String weapoonJob) {
        this.weapoonJob = weapoonJob;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getPilih() {
        return pilih;
    }

    public void setPilih(int pilih) {
        this.pilih = pilih;
    }
    
    protected void setStatus(){
    
    };
    public void tampilChar() {
        System.out.println("");
    }


    
    public static void pilihJob(Job knight, Job archer, Job wizard) {
        System.out.println("=== CREATE CHARACTER GAME ===");
        System.out.print("Masukkan Nama Karakter Anda: ");
        String nama = input.nextLine();

        System.out.println("Pilih Job Anda:");
        System.out.println("1. KNIGHT");
        System.out.println("2. ARCHER");
        System.out.println("3. WIZARD");
        System.out.print("Masukkan Pilihan [1/2/3]: ");
        int pilihan = input.nextInt();
        input.nextLine(); // consume newline

        switch (pilihan) {
            case 1:
                knight.setNamaChar(nama);
                knight.setStatus();
                knight.tampilChar();
                break;
            case 2:
                archer.setNamaChar(nama);
                archer.setStatus();
                archer.tampilChar();
                break;
            case 3:
                wizard.setNamaChar(nama);
                wizard.setStatus();
                wizard.tampilChar();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
}


}
