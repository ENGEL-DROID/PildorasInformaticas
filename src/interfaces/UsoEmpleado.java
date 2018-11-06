/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import herencia_y_polimorfismo.*;
import java.util.Arrays;

/**
 *
 * @author Antonella
 */
public class UsoEmpleado {
    public static void main(String[] arg){
     Jefe JefeRecursosHumanos=new Jefe("luis",  55000, 2006, 9,25);
     JefeRecursosHumanos.EstableceIncentivo(2570);
     
     Empleado[] misEmpleados=new Empleado[4];
     misEmpleados[0]=new Empleado("antonella", 30000, 2000, 07, 07);
     misEmpleados[1]=new Empleado("tatiana", 50000, 1995, 06, 15);
     misEmpleados[2]=JefeRecursosHumanos;//Polimorfismo en accion
     misEmpleados[3]=new Jefe("thiago", 95000, 1999, 5, 26);
    
    for(Empleado e: misEmpleados){
       e.setsubeSueldo(5);
       }         
    
    Arrays.sort(misEmpleados);
    
    for(int i=0;i<misEmpleados.length;i++){
     System.out.println("Nombre: "+misEmpleados[i].getdameNombre()+" sueldo: "+misEmpleados[i].getdameSueldo()+" Fecha de alta:"+misEmpleados[i].getdameFechaContrato());    
    }
    
    
    }
}
