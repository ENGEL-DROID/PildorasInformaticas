/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_y_polimorfismo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Antonella
 */
public class Empleado {
    public Empleado(String nom){      
       this(nom, 3000, 1991,01,01);  //Llama a otro constructor para asignar un  valor por defecto
   } 
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre=nom;
        sueldo = sue;
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
        altaContrato=calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;
        
    }
    
   public String getdameNombre(){
       return nombre+" Id: "+ Id;
   }
   public double getdameSueldo(){
       return sueldo;
   }
   public Date getdameFechaContrato(){
       return altaContrato;
   }
   
   public void setsubeSueldo(double porcentaje){
      double aumento=sueldo*porcentaje/100;
      sueldo+=aumento;
   }
   
   
   private String nombre;
   private double sueldo;
   private Date altaContrato;
   private int Id;
   private static int IdSiguiente=1;
   
}
