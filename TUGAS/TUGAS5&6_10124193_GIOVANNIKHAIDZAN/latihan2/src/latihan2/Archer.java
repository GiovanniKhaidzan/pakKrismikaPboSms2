/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Archer extends Job{
    public Archer() {}

    public Archer(String namaChar){
        super(namaChar);
    }

    @Override
    protected void setStatus(){
        setNamaJob("Archer");
        setLevel(1);
        setWeapoonJob("Bow");
        setHealth(120);
        setMagic(80);
        setPower(120);
        setDefend(100);
    }

    @Override
    public void tampilChar(){
        System.out.println("\n==== TAMPIL STATUS HERO ====");
        System.out.println("Nama Karakter  : " + getNamaChar());
        System.out.println("Level          : " + getLevel());
        System.out.println("Job            : " + getNamaJob());
        System.out.println("Senjata        : " + getWeapoonJob());
        System.out.println("Health         : " + getHealth());
        System.out.println("Magic          : " + getMagic());
        System.out.println("Power          : " + getPower());
        System.out.println("Defend         : " + getDefend());
        System.out.println("Hero Menyerang Menggunakan " + getWeapoonJob() + " Dengan Power " + getPower());
        System.out.println("=============================");
    }
}