/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class IngresoDeDatos1Scanner {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("introduce tu nombre");
    String nombre=entrada.nextLine();
    System.out.println("introduce edad");
    int edad=entrada.nextInt();
    System.out.println("tu nombre: "+ nombre+ " edad: "+edad);
    
    }
}
