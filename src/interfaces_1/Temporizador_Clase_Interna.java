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
public class Temporizador_Clase_Interna {
    
    
    public static void main(String[] args){
    Reloj mireloj=new Reloj(3000, true);
    mireloj.enMarcha();
    JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
    System.exit(0);
    }
    
}


class Reloj{

 public Reloj(int intervalo, boolean sonido){
     this.intervalo=intervalo;
     this.sonido=sonido;
 }
 
 public void enMarcha(){
   ActionListener oyente=new DamelaHora();
   Timer mitemporizador=new Timer(intervalo, oyente);
   mitemporizador.start();
 }
 
 
 private int intervalo;
 private boolean sonido;
 private class DamelaHora implements ActionListener{
     public void actionPerformed(ActionEvent evento){
         Date ahora=new Date();
         System.out.println("Te pongo la hora cada 3 sg "+ ahora);
         if(sonido){
             Toolkit.getDefaultToolkit().beep();
         }
     }
 }
}