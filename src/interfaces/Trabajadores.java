/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ASistemas
 */
public interface Trabajadores {
   
    
   //se da porsupuesto que es public abstract , asi no se ponga
    double establece_bonus(double gratificacion);

    //se da porsupuesto que es public static final  asi no se ponga  
    double bonus_base=1500; 
}
