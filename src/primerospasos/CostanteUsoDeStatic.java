/* Crear empleados asignandole ID automaticamente el programa
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

/**
 *
 * @author Antonella
 */
public class CostanteUsoDeStatic {
  public static void main (String[] arg){
       /*Empleado empleado1=new Empleado("Luis",1);
        Empleado empleado2=new Empleado("Carlos",2); */
      Empleado empleado1=new Empleado("Luis");
      Empleado empleado2=new Empleado("Carlos");  
      Empleado empleado3=new Empleado("Garcia");  
      empleado1.cambiaSeccion("cartera");
      System.out.println(empleado1.DevuelveDatos() + "\n"+ empleado2.DevuelveDatos()+
              "\n"+empleado3.DevuelveDatos()); 
      
      System.out.println(Empleado.dameIdSiguiente());
      
      
  }
}

class Empleado{
    public Empleado(String nom){
        this.nombre=nom;
        seccion="Administracion";
        Id=IdSiguiente;
        IdSiguiente++;
    }
       
    
    public void cambiaSeccion(String seccion){
        this.seccion=seccion;
    }
    
    public String DevuelveDatos(){
    return "nombre: " + nombre+" seccion: "+seccion+" Id: "+ Id;
            }
    
    public static String dameIdSiguiente(){
        return " El IdSiguiente es: " + IdSiguiente;
    }
    
    
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;
}   
 