package POO;

public class Coche {

private int ruedas, largo, ancho, motor, peso_total, peso_plataforma;    
private String color;
private boolean asientos_cuero, climatizador;

public Coche(){
    ruedas=4;
    largo=2000;
    ancho=300;
    motor=1600;
    peso_plataforma=500;
    
   }

public String dimedatosgenerales(){
    return "color: "+color+" ruedas: "+ruedas+" ancho: "+ ancho+" motor: "+motor+" peso plataforma: "+ peso_plataforma;
}

public String damelargo(){ //metodo getter
 
    return "el largo es "+largo+" de color "+color;
   }


public void establece_color(String color){           //metodo setter  
    this.color=color;
}

public void configura_asientos_cuero(String asientos_cuero){
    
if(asientos_cuero.equalsIgnoreCase("si")){   //para comparar cadena 
 this.asientos_cuero=true;
}else{
    this.asientos_cuero=false;
 } 
}

public String dime_asientos(){
   if(asientos_cuero==true){
       return "El coche tiene asientos de cuero";
   }else{
       return "El coche tiene asientos de serie";
   }
 }

public void configura_climatizador(String climatizador){
    if(climatizador=="si"){
        this.climatizador=true;
    }else{
        this.climatizador=false;
    }
  }

  public String dime_climatizador(){
      if(climatizador==true){
          return "El coche incorpora climatizador";
      }else{
          return "El coche tiene aire acondicionado";
      }
  }
  
  
  public String dime_peso_coche(){
      int peso_carroceria=500;
      peso_total=peso_plataforma+peso_carroceria;
      if(asientos_cuero==true){
          peso_total=peso_total+50;
      }
      if(climatizador==true){
          peso_total=peso_total+20;
      }
      return "El peso del coche es:  "+peso_total;
  }
  
  public int precio_coche(){
      int precio_final=10000;
      if(asientos_cuero==true){
          precio_final+=2000;
      }
      if(climatizador==true){
          precio_final+=1500;
      }
      return precio_final;
  }
}

