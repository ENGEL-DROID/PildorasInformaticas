/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Antonella
 */
public class UsoVehiculo {

 public static void main(String[] arg){
      
    Coche micoche1=new Coche();
    micoche1.establece_color("rojo");
    
    
    furgoneta_HERENCIA mifurgoneta1=new furgoneta_HERENCIA(7,580);
    mifurgoneta1.establece_color("Amarillo");
    mifurgoneta1.configura_asientos_cuero("si");
    mifurgoneta1.configura_climatizador("si");
    
    System.out.println(micoche1.dimedatosgenerales());
    System.out.println(mifurgoneta1.dimedatosgenerales()+mifurgoneta1.DimeDatosFurgoneta());
  
 }   
}
