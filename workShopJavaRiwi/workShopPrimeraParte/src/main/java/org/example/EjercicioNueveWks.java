package org.example;
import java.util.Scanner;

public class EjercicioNueveWks {
    public static void main(String[] args){
        //Ejercicio 9: Calculadora de Año Bisiesto
        //Escribe un programa que le pida al usuario que ingrese un año y determine si es un año bisiesto o
        //no. Recuerda que un año es bisiesto si es divisible entre 4, excepto aquellos que son divisibles entre
        //100, a menos que también sean divisibles entre 400.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Año Bisiesto");
        System.out.println("Ingrese un año:");

        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " es un año bisiesto.");
                } else {
                    System.out.println(year + " no es un año bisiesto.");
                }
            } else {
                System.out.println(year + " es un año bisiesto.");
            }

        }
    }
}
