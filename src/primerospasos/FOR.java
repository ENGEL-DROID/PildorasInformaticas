package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 pide cuantas veces imprimir tu nombre
 */
public class FOR {
  public static void main(String[] args){
    formen imp=new formen();
    imp.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre"));
    imp.setNumero((int) Integer.parseInt(JOptionPane.showInputDialog("ingresa veces a imprimir")));
    imp.imprime();
  }
}


class formen{
   private int numero;
   private String nombre;
    
    public formen(){
    
    }

       
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprime(){
         for(int i=0;i<numero;i++){
         System.out.println(nombre+" "+i);  
     }       
 
    }
    
}