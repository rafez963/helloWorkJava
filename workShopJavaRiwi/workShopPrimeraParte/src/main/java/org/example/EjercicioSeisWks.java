package org.example;
import java.util.Scanner;

public class EjercicioSeisWks {
    public static void main(String[] args){
        //Ejercicio 6: Calculadora de Días del Mes
        //Desarrolla un programa que pida al usuario el número de un mes (1-12) y muestre el número de días
        //de ese mes. Asume que febrero tiene 28 días. Utiliza una estructura switch para resolverlo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Días del Mes");

        System.out.println("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días.");
                break;
            case 2:
                System.out.println("El mes tiene 28 días.");
                break;
            default:
                System.out.println("El número ingresado no corresponde a un mes válido.");
                break;
        }
    }
}
