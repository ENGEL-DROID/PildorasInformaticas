/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_1;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author ASistemas
 */
public class PruebaTemporizador {
    
    
    public static void main(String[] args){
        
        
     DameLaHora oyente=new DameLaHora();   
     Timer mitemporizador=new Timer(5000, oyente);
     mitemporizador.start();
     JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
     System.exit(0);
    }
    
}




class DameLaHora implements ActionListener{

    public void actionPerformed(ActionEvent e) {
      
      Date ahora=new Date();  
      System.out.println("Te pongo la hora cada 5 sg: "+ ahora);
      Toolkit.getDefaultToolkit().beep();
    }
 
}