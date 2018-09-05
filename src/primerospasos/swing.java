/*
 Area figura trigonometrica
 */
package primerospasos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 */
public class swing {
public static void main(String[] arg){
    Scanner entrada=new Scanner(System.in);
    System.out.println("Elige una opcion: \n1: cuadrado \n2: Rectangulo \n3: Triangulo \n4: circulo ");
    int figura=entrada.nextInt();
    switch (figura){
        case 1:
        int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce lado"));
        System.out.println("El area del cuadrado es: "+ Math.pow(lado, 2));
        break;
         
        case 2:
          int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
          int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
          System.out.println("El area del rectangulo es: "+ base*altura);
          break;
            
        case 3:
          base=Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
          altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
          System.out.println("El area del triangulo es: "+ ((base*altura)/2));
          break;
       
        case 4:
          int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
          System.out.print("El area del circulo es: ");
          System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
          break;
       
        default:
          System.out.println("la opcion no es correcta");  
        
    }
    
}    
}
