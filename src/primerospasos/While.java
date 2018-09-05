
package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 * Ingreso login
 */
public class While {
   public static void main(String[] args){
     
     String clave="Luis";
     String pass="";
     
     while(clave.equals(pass)==false){
         pass=JOptionPane.showInputDialog("Introduce contraseña, por favor");
         if(clave.equals(pass)==false){
            System.out.println("Contraseña incorrecta");   
          }
       
     }
     System.out.println("Contraseña correcta");
   } 
}
