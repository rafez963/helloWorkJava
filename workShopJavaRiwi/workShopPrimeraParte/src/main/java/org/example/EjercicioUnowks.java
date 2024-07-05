package org.example;
import java.util.Scanner;

public class EjercicioUnowks {

    //Ejercicio 1: Calculadora Básica
    //Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar,
    //multiplicar y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y
    //los resultados.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the trading game");
        System.out.println("Enter your first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter your second number:");

        double num2 = scanner.nextDouble();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

        scanner.close();

    }
}