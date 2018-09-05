/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAbstractas;

import herencia_y_polimorfismo.*;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Antonella
 */
public class Empleado extends Persona {
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
        altaContrato=calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;
        
    }
    
  public String dameDescripcion(){
  return "Sueldo "+sueldo+" alta contrato "+altaContrato;    
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
  
   
   
   private double sueldo;
   private Date altaContrato;
   private int Id;
   private static int IdSiguiente=1;
   
}
