/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Cat extends Animal{
    public Cat (){
        super.namaHewan = "kucing";
    }
    @Override
    public void sound(){
        System.out.println(super.namaHewan+" Miawwwwww");
    }
}
