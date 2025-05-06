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
public class Dog extends Animal {
    public Dog (){
        super.namaHewan = "Anjing";
    }
    @Override
    public void sound(){
        System.out.println(super.namaHewan+" Gouggg");
    }
}
