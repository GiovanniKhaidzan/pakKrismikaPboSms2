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
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Job knight = new Knight();
        Job archer = new Archer();
        Job wizard = new Wizard();
   
        Job.pilihJob(knight, archer,wizard);
       
        
    }
    
}
