/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sig
 */
public class programa3 implements Runnable{
    public void run() {
        for (int i=1;i<=5;i++) {
            JOptionPane.showMessageDialog(null, "Este es un mensaje molesto");
            System.out.println("Se esta mostrando un mensaje molesto :v");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(programa.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("El programa se cago y fallo en programa3");
            }
        }
        
        
    }
}
