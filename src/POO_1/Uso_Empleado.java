/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_1;

/**
 *
 * @author Antonella
 */
public class Uso_Empleado {
   public static void main(String[] args){
 
   /* Metodo largo    
   Empleado empleado1=new Empleado("luis",85000,1990,12,17);
   Empleado empleado2=new Empleado("carlos",86000,1991,12,17);
   Empleado empleado3=new Empleado("garcia",87000,1992,12,17);
   
   empleado1.setsubeSueldo(5);
   empleado1.setsubeSueldo(5);
   empleado1.setsubeSueldo(5);
   
   System.out.println("Nombre: "+ empleado1.getdameNombre() + " Sueldo: "+ empleado1.getdameSueldo()+ " Fecha alta "+ empleado1.getdameFechaContrato());
   System.out.println("Nombre: "+ empleado2.getdameNombre() + " Sueldo: "+ empleado2.getdameSueldo()+ " Fecha alta "+ empleado2.getdameFechaContrato());
   System.out.println("Nombre: "+ empleado3.getdameNombre() + " Sueldo: "+ empleado3.getdameSueldo()+ " Fecha alta "+ empleado3.getdameFechaContrato());
   
  
   
*/
   
   
 //metodo simplificado ocn for  
   
 Empleado[] empleado=new Empleado[4];
 empleado[0]=new Empleado("luis",85000,1990,12,17);
 empleado[1]=new Empleado("carlos",85000,1991,12,17);
 empleado[2]=new Empleado("garcia",87000,1992,12,17);
 empleado[3]=new Empleado("Antonella");
 //for normal
 /*
 for(int i=0;i<3;i++){
     empleado[i].setsubeSueldo(5);
 }  */
 
 for(Empleado e: empleado){
   e.setsubeSueldo(5);
 }   
  
 for(int i=0;i<empleado.length;i++){
     System.out.println("Nombre: "+ empleado[i].getdameNombre() + " Sueldo: "+ empleado[i].getdameSueldo()+ " Fecha alta "+ empleado[i].getdameFechaContrato());
 }
 
    }
}
