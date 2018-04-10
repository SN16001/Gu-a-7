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
public class programa implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=5;i++) {
         String texto=JOptionPane.showInputDialog(null, "Ingresa un texto que deses mostrar");
         JOptionPane.showMessageDialog(null, "Ingresaste el texto " +texto+ " Has visto este mensaje "+i+ "vez/veces");
            try {
                System.out.println("El thread duerme un rato ZZZZ");
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(programa.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("El programa se cago y fallo :v");
            }
        
        }
        
        
    }
    
}
