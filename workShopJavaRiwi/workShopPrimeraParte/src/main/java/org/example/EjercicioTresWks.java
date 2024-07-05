package org.example;
import java.util.Scanner;
public class EjercicioTresWks {
    public static void main(String[] args){
        //Ejercicio 3: Conversor de Unidades
        //Desarrolla un programa que convierta kilómetros a millas. El programa debe solicitar al usuario que
        //introduzca una distancia en kilómetros y luego debe mostrar la distancia equivalente en millas.
        //Utiliza el hecho de que una milla es igual a 1.60934 kilómetros.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Unidades");
        System.out.println("Ingrese la distancia en kilómetros: ");
        double kilometros = scanner.nextDouble();
        double millas = kilometros * 1.60934;
        System.out.printf("%.2f kilómetros son %.2f millas.%n", kilometros, millas);
        scanner.close();

    }
}
