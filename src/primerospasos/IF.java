
package primerospasos;

import java.util.Scanner;

public class IF {
    public static void main(String[] arg){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad=entrada.nextInt();
        
        if(edad >=18 && edad < 120){
            System.out.println("Mayor de edad");
        }
        else if(edad <18){
            System.out.println("Menor de edad");
        }else{
            System.out.println("Edad incorrecta ");
        }
    }
}
