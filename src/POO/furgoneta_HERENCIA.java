/*
Solo se puede heredar de una clase
 */
package POO;

public class furgoneta_HERENCIA extends Coche {
  private int capacidad_carga, plazas_extra;
  
  public furgoneta_HERENCIA(int plazas_extra, int capacidad_carga){
  super(); //llama al constructor de la clase padre
  this.capacidad_carga=capacidad_carga; //this para diferencia la variable de clase a la variable del argumento que se recibe
  this.plazas_extra=plazas_extra;
  
  }
  
  public String DimeDatosFurgoneta(){
    return "capacidad de carga: " + capacidad_carga+ " plazas son: "+ plazas_extra;
}
}
  
