package org.example;

import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args){
        //decalramaos un objeto escaner para hacer uso de susmetos y pedir informacion al usuario
        Scanner sc = new Scanner(System.in);
        //pedimos al usuario que ingrese la dimension de la matriz
        System.out.println("Ingrese las dimensiones de la matriz cuadrada (filas = columnas): ");
        int dimension = sc.nextInt();
        //creamos la matriz
        int[][] matriz = new int[dimension][dimension];
        //Ingrese los elementos de la matriz
        for (int i=0; i < dimension; i++  ){
            for (int j=0; j < dimension; j++){
                System.out.println("ingrese el valor de la pocision: ["+i+"]["+j+"] : ");
                matriz[i][j] = sc.nextInt();
            }
        }
        //miramos si es simetrica
        boolean esSimetrica = true;

        for (int i=0; i < dimension; i++  ){
            for (int j=0; j < dimension; j++){
             if (matriz[i][j] != matriz[j][i])  {
                 esSimetrica = false;
                 break;
                }
            }
            if(!esSimetrica){
                break;
            }
        }
        if(esSimetrica){
            System.out.println("la matriz es simetrica");
        }else {
            System.out.println("La metriz no es simetrica");
        }

        sc.close();
    }
}
