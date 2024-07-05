package org.example;

import java.util.Scanner;

public class EjercicioDiezWks {
    public static void main(String[] args){
         //Ejercicio 10: Calculadora de Propina
        //Desarrolla un programa que calcule cuánto dejar de propina en un restaurante. El usuario debe
        //ingresar el total de la cuenta y el porcentaje de propina que desea dejar. El programa debe mostrar
        //cuánto dinero en propina debe dejar.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Propina");

        System.out.println("Ingrese el valor de la cuenta: ");
        double valor = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de propina: ");
        double propina = scanner.nextDouble();

        double propinaCalculada = valor * (propina / 100);

    }
}
