/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 * Adivinar numero aleatorio
 */
public class DoWhile {
 public static void main(String[] args){
 int aleatorio=(int)(Math.random()*100);
 int numero=0;
 int intentos=0;
 Scanner entrada=new Scanner(System.in);
 do{
     intentos++;
     System.out.println("Introduce un numero por favor");
     numero=entrada.nextInt();
     if(aleatorio<numero){
           System.out.println("Mas bajo");
      }else if(aleatorio>numero){
           System.out.println("Mas alto");
        } 
              
   }while(numero!=aleatorio);
 System.out.println("Numero correcto, intentos: "+ intentos);
     
  }   
}
