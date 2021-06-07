/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author LENOVO
 */
public class AntrianApp {
    public static void main(String[] args){
           System.out.println("Diannita Amjani");
           System.out.println("20090085");
           System.out.println(" ");
        
           Antrian antrian = new Antrian(10);
           
           antrian.enqueue(40);
           antrian.display();
           System.out.println();
           
           antrian.enqueue(33);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai yang paling depan = "+ antrian.peek());
           
           antrian.enqueue(60);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai diambil dari antrian = "+ antrian.dequeue());
           antrian.display();
           System.out.println();
           
           System.out.println("nilai diambil dari antrian = "+ antrian.dequeue());
           antrian.display();
           System.out.println();
           
           antrian.enqueue(54);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai yang paling depan =  "+ antrian.peek());
    
    }
}
