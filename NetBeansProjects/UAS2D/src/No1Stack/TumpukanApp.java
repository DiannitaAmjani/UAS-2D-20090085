/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1Stack;

/**
 *
 * @author LENOVO
 */
public class TumpukanApp {
    public static void main(String [] args){
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(85);
        tumpukan.baca();
        
        tumpukan.push(30);
        tumpukan.baca();
        
        System.out.println("Nama saya adalah Diannita Amjani");
        System.out.println("nilai yang dihapus = "+tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println(" ");
        
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        
    }
    
}
