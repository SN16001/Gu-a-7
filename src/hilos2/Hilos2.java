/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos2;

/**
 *
 * @author sig
 */
public class Hilos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        programa param1 = new programa();
        programa2 param2 = new programa2();
        programa3 param3 = new programa3();
        Thread t1 = new Thread(param1);
        Thread t2 = new Thread(param2);
        Thread t3 = new Thread(param3);
        
        t1.start();
        t1.setName("El que ingresa datos mientras piensa en ella");
        t2.start();
        t2.setName("El que cuenta los segundos para verla de nuevo");
        t3.start();
        t3.setName("El que se mete en todo");
    }
    
    
}
