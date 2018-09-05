package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * verificar si un email tiene @
 */
public class FOR2 {
public static void main(String[] args){
int arroba =0;
boolean punto=false;
String mail=JOptionPane.showInputDialog("ingresa tu email");

 for(int i=0;i<mail.length();i++){
     if(mail.charAt(i)=='@'){
         arroba++;       
     }
    
     if(mail.charAt(i)=='.'){
         punto=true;
     }
    
   }
 
   if(arroba==1 && punto==true){
        System.out.println("email valido");
     }else{
        System.out.println("email incorrecto");
    }

 }   
}
