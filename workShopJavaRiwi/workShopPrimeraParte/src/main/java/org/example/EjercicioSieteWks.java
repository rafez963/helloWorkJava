package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioSieteWks {
    public static void main(String[] args){
       //Ejercicio 7: Menú Interactivo
        //Implementa un programa que muestre un menú con opciones para realizar diferentes operaciones
        //matemáticas (por ejemplo, sumar, restar, multiplicar, dividir). El usuario debe poder seleccionar una
        //opción ingresando un número, y luego el programa debe pedir los números necesarios para realizar
        //la operación elegida y mostrar el resultado. Utiliza una estructura switch para manejar las opciones
        //del menú.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Interactivo0");
        System.out.println("------Menú------------\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. multiplicar\n" +
                "4. dividir\n");
        System.out.println("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
        System.out.println("Ingrese dos numeros para realizar la opracion elegida: ");
        System.out.println("Nunemero Uno");
        double num1 = scanner.nextDouble();
        System.out.println("Numero Dos");
        double num2 = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("------------SUMA----------------");
                System.out.println("Resultado: " +num1+" + "+num2+ " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("------------RESTA----------------");
                System.out.println("Resultado: " +num1+" - "+num2+ " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("------------MULTIPLICAR----------------");
                System.out.println("Resultado: " +num1+" * "+num2+ " = " + (num1 * num2));
                break;
            case 4:
                if(num2!= 0){
                    System.out.println("------------DIVIDIR----------------");
                    System.out.println("Resultado: " +num1+" / "+num2+ " = " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Opción Invalida");
        }

    }
}
