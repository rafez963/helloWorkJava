package org.example;

import java.util.Scanner;

public class TranspuesMatriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //solicitar al usuario el numero de filas
        System.out.println("Ingrese por favor el numero de filas que quiere en su matriz: ");
        int filas = sc.nextInt();
        //Solicitar al usuario el numero de columnas
        System.out.println("Ingrese por favor el numero de columnas que quiere en su matriz: ");
        int columnas = sc.nextInt();

        // creamos la matriz en relacion a las filas y columnas ingresadas por el usuario
        int[][] matriz = new int[filas][columnas];

        // llenamos la matriz
        for (int i=0; i < filas; i++  ){
            for (int j=0; j < columnas; j++){
                System.out.println("ingrese el valor de la pocision: ["+i+"]["+j+"] : ");
                matriz[i][j] = sc.nextInt();
            }
        }

        //mostramos la matriz orginal

        // llenamos la matriz
        for (int i=0; i < filas; i++  ){
            for (int j=0; j < columnas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        // creamos la matriz transpuesta
        int[][] transpuesta = new int[filas][columnas];

        // llenamos la matriz transpuesta en relacion a la matriz original
        for (int i=0; i < filas; i++  ){
            for (int j=0; j < columnas; j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
        //mostramos la matriz transpuesta:
        for (int i=0; i < filas; i++  ){
            for (int j=0; j < columnas; j++){
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

    }
}
