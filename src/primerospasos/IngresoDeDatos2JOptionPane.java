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
public class IngresoDeDatos2JOptionPane {
     public static void main(String[] args) {
     String nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
     int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
     System.out.println("Nombre: "+nombre+" Edad: "+edad);
    }

}
