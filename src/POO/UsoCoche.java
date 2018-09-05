/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 */
public class UsoCoche {
     public static void main(String[] arg){
 
    Coche carro= new Coche();
    carro.establece_color(JOptionPane.showInputDialog("Introduce color"));
    System.out.println(carro.damelargo());
    carro.configura_asientos_cuero(JOptionPane.showInputDialog("tiene asientos de cuero"));
    System.out.println(carro.dime_asientos());
    carro.configura_climatizador("si"); 
    System.out.println(carro.dime_climatizador());
    System.out.println(carro.dime_peso_coche());
    System.out.println("Precio del cohce "+carro.precio_coche());
   }    
}
