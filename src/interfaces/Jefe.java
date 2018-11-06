/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import herencia_y_polimorfismo.*;

/**
 *
 * @author Antonella
 */
public class Jefe extends Empleado implements jefes{
  
    public Jefe(String nom, double sue, int agno, int mes, int dia) {
        super(nom,  sue,  agno,  mes,  dia);
    }
   
    public void EstableceIncentivo(double b){
    incentivo=b;
}
    
    @Override
    public double getdameSueldo(){
        double SueldoJefe=super.getdameSueldo();
        return SueldoJefe + incentivo;
    }
    
    public String tomar_decisiones(String decision) {
        return "Un miembro de la Dr ha tomado la decision de: "+decision;
    }
    
  private double incentivo;

   
}
