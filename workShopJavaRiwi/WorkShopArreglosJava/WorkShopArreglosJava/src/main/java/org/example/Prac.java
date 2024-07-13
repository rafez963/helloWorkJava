package org.example;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Solicitar el tamaño del array
                System.out.println("Ingrese el tamaño del array:");
                int n = sc.nextInt();

                // Crear el array
                int[] array = new int[n];

                // Leer los elementos del array
                System.out.println("Ingrese los elementos del array:");
                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
                }

                // Contar las frecuencias de los elementos
                int[][] frecuencias = new int[n][2]; // Array para almacenar elementos y sus frecuencias
                int uniqueElements = 0; // Contador de elementos únicos

                for (int i = 0; i < n; i++) {
                    boolean found = false;
                    for (int j = 0; j < uniqueElements; j++) {
                        if (array[i] == frecuencias[j][0]) {
                            frecuencias[j][1]++;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        frecuencias[uniqueElements][0] = array[i];
                        frecuencias[uniqueElements][1] = 1;
                        uniqueElements++;
                    }
                }

                // Ordenar las frecuencias de mayor a menor
                for (int i = 0; i < uniqueElements - 1; i++) {
                    for (int j = 0; j < uniqueElements - i - 1; j++) {
                        if (frecuencias[j][1] < frecuencias[j + 1][1]) {
                            int[] temp = frecuencias[j];
                            frecuencias[j] = frecuencias[j + 1];
                            frecuencias[j + 1] = temp;
                        }
                    }
                }

                // Imprimir los resultados
                System.out.println("Elementos ordenados por frecuencia (de mayor a menor):");
                for (int i = 0; i < uniqueElements; i++) {
                    System.out.println("Elemento: " + frecuencias[i][0] + " - Frecuencia: " + frecuencias[i][1]);
                }

                // Cerrar el objeto Scanner
                sc.close();
            }
        }





