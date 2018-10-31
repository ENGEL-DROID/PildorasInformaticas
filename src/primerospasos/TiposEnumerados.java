/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;

/**

 
public class TiposEnumerados {
    
    enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};  
    
    public static void main(String[] arg){
     Talla s= Talla.MINI;
     Talla m=Talla.MEDIANO;
     Talla l=Talla.GRANDE;
     Talla xl=Talla.MUY_GRANDE;
    }
}
*/

public class TiposEnumerados {
    
    enum Talla{
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
    
        
        
        private Talla(String abreviatura){
        this.abreviatura=abreviatura;
        }

      
        public String dameAbreviatura() {
            return abreviatura;
        }
    
        
          private String abreviatura;
    }  
    
    
     public static void main(String[] arg){
     Scanner entrada=new Scanner(System.in);
     System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE,MUY_GRANDE");
     String entrada_datos=entrada.next().toUpperCase();
     Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
     System.out.println("Talla=" + la_talla);
     System.out.println("Abreviatura: "+ la_talla.dameAbreviatura());
    }
}