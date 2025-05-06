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
public class Duck extends Animal{
    public Duck(){
        super.namaHewan = "bebek";
    }
    
    @Override
    public void sound(){
        System.out.println(super.namaHewan+" QUACK");
    }
}
