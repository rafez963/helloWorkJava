package org.example;

import java.util.Scanner;

public class EjercicioTreceWks {
    //Ejercicio 13: Calculadora de Tarifa de Taxi
    //Desarrolla un programa que calcule el costo de un viaje en taxi basándose en la distancia del viaje
    //(en kilómetros) y la tarifa base. Puedes añadir una tarifa adicional por kilómetro recorrido. El
    //usuario debe ingresar la distancia del viaje.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Tarifa de Taxi");
        System.out.println("Ingrese la distancia del viaje (en kilómetros): ");
        double distancia = scanner.nextDouble();
        double tarifaBase = 5.5;
        double tarifaAdicional = 0.5;
        double tarifaTotal = tarifaBase + (distancia * tarifaAdicional);
        System.out.printf("El costo del viaje es: %.2f%n", tarifaTotal);
        scanner.close();

    }
}
