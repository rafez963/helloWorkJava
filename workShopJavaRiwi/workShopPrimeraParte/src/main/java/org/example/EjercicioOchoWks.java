package org.example;

import java.util.Scanner;

public class EjercicioOchoWks {
    public static void main(String[] args){

        //Ejercicio 8: Cálculo de Promedio
        //Escribe un programa que solicite al usuario ingresar tres calificaciones, calcule el promedio y
        //muestre un mensaje indicando si el alumno aprueba o no (considera que se aprueba con un
        //promedio de 6 o más).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de Promedio. ");
        System.out.println("Ejercicio 8: Cálculo de Promedio");

        System.out.println("Ingrese la primera calificación: ");
        int calificacion1 = scanner.nextInt();

        System.out.println("Ingrese la segunda calificación: ");
        int calificacion2 = scanner.nextInt();

        System.out.println("Ingrese la tercera calificación: ");
        int calificacion3 = scanner.nextInt();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        System.out.printf("El promedio de las calificaciones es %.2f%n", promedio);

    }
}
