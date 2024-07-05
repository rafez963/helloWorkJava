package org.example;
import java.util.Scanner;
public class EjercicioQuinceWks {
    //Ejercicio 15: Sistema de Calificaciones
    //Implementa un programa que le pida al usuario la calificación de un examen (0-100). Basado en la
    //calificación, el programa debe mostrar una letra (A, B, C, D, F), donde A es 90-100, B es 80-89,
    //etc. Considera utilizar if o switch.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de Calificaciones");

        System.out.println("Ingrese su calificación del examen entre (0-100): ");
        int calificacion = scanner.nextInt();
        if(calificacion >= 0 && calificacion <=100) {
            if (calificacion >= 90 && calificacion <= 100) {
                System.out.println("Calificaion => Letra: A");
            }else if (calificacion >= 80 && calificacion <=89) {
                System.out.println("Calificaion => Letra: B");
            } else if (calificacion >= 60 && calificacion <=79) {
                System.out.println("Calificaion => Letra: C");
            } else if (calificacion >= 40 && calificacion <= 59) {
                System.out.println("Calificaion => Letra: D");
            } else if (calificacion >= 0 && calificacion <= 39) {
                System.out.println("Calificaion => Letra: F");
            }
        }else {
            System.out.println("Calificación no válida. Ingrese un número entre 0 y 100.");
        }

    }
}
