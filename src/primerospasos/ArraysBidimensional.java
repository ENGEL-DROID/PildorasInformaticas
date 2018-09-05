/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

/**
 *
 * Matriz de dos dimensiones
 */
public class ArraysBidimensional {
    public static void main(String[] args){
        int[][] matrix=new int[4][5];
    
    matrix[0][0]=10;
    matrix[0][1]=15;
    matrix[0][2]=18;
    matrix[0][3]=19;
    matrix[0][4]=21;
    
    matrix[1][0]=5;
    matrix[1][1]=25;
    matrix[1][2]=37;
    matrix[1][3]=41;
    matrix[1][4]=15;
    
    matrix[2][0]=7;
    matrix[2][1]=19;
    matrix[2][2]=32;
    matrix[2][3]=14;
    matrix[2][4]=90;
    
    matrix[3][0]=85;
    matrix[3][1]=2;
    matrix[3][2]=7;
    matrix[3][3]=40;
    matrix[3][4]=27;
    
    
    for(int i=0;i<4;i++){
        System.out.println();
        for(int j=0;j<5;j++){
            System.out.print(matrix[i][j]+" "); 
        }
        
    }  
    
    
    }
}
