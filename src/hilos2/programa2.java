/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sig
 */
public class programa2 implements Runnable{
     public void run() {
        for (int i=1;i<=120;i++) {
            System.out.println("Este es un mensaje del thread de fondo van: "+i+"segundos de ejecucion");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(programa.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("El programa se cago y fallo en programa2");
            }
        }
        
        
    }
}
