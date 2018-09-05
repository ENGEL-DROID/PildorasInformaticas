/*  crear empleado, este no debe dejar cambiar nombre
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

/**
 *
 * @author Antonella
 */
public class CostanteUsoDeFinal {
  public static void main (String[] arg){
        Empleados empleado=new Empleados("Luis");
        empleado.cambiaSeccion("cartera");
    //  empleado.cambianombre("lucho");
   System.out.println(empleado.DevuelveDatos()); 
  }
}

class Empleados{
    public Empleados(String nom){
        nombre=nom;
        seccion="Administracion";
    }
    
    public void cambiaSeccion(String seccion){
        this.seccion=seccion;
    }
    
  /*  public void cambianombre(String nombre){
        this.nombre=nombre;   //sale error por que no esta permitido cambiar el valor de este objeto
    }*/
    
    public String DevuelveDatos(){
    return "nombre: " + nombre+" seccion: "+seccion;
            }
    
    private final String nombre;
    private String seccion;
}   
