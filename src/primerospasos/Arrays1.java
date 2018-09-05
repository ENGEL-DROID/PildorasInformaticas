
package primerospasos;

/**
 *
 * @author Antonella
 */
public class Arrays1 {
public static void main(String[] args){
    
    
    int[] mi_matriz=new int[5];
    // int mi_matriz[]=new int[]5;  OTRA OPCION TAMBIEN VALIDA
     
   mi_matriz[0]=5; 
   mi_matriz[1]=38;
   mi_matriz[2]=15;
   mi_matriz[3]=92;
   mi_matriz[4]=71;
   
   //imprimir un valor en posicion especifica
System.out.println("valor en posicion 3:  "+mi_matriz[3]);

System.out.println("Forma uno");
//imprimir todos los valores de la matriz
for(int i=0;i<5;i++){
  System.out.println("valor en posicion "+i+": "+ mi_matriz[i]);     
}

System.out.println("Forma dos");
//una forma simplificada de declarar  la matriz
 int mi_matriz2[]={5,38,15,92,71};
 for(int j=0;j<5;j++){
    System.out.println("valor en posicion "+j+": "+ mi_matriz[j]);     
}             
           
   }
}
