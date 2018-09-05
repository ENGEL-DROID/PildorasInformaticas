/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 */
public class Decimales {
     public static void main(String[] args){
     String num1=JOptionPane.showInputDialog("Introduce numero");
     double num2=Double.parseDouble(num1);
     System.out.println("La raiz de "+ num2+ " es");
     System.out.printf("%1.4f",Math.sqrt(num2));  //"%1.4f" 4 decimales
         
     }
}
