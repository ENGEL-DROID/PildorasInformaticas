/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * Ejemplo llenar arrays con nombre de ciudades
 */
public class Arrays2 {
    public static void main(String[] args){
     String[] ciudades=new String[5];
     
     for(int i=0;i<ciudades.length;i++){
         ciudades[i]=JOptionPane.showInputDialog("Introduce ciudad "+(i+1));
     }
     
     
     int contador=0;
     for(String e:ciudades){
         System.out.println("ciudad "+contador+": "+e);
     }
    }
}
