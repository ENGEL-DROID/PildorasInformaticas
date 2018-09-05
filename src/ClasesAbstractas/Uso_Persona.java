/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAbstractas;

/**
 *
 * @author Antonella
 */
public class Uso_Persona {
    
    
    public static void main(String args[]){
    Persona[] lasPersonas=new Persona[2];
    lasPersonas[0]=new Empleado("CARLOS",50000,2009,02,25); 
    lasPersonas[1]=new Alumno("LUIS","INFORMATICA");

    
    for(Persona p:lasPersonas){
        System.out.println(p.dameNombre()+" "+p.dameDescripcion());
    }
    
    
    for(int i=0;i<lasPersonas.length;i++){
        System.out.println(lasPersonas[i].dameNombre()+" "+lasPersonas[i].dameDescripcion());
    }
       }
    }
