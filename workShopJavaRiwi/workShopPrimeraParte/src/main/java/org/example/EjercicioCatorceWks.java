package org.example;
import java.util.Scanner;

public class EjercicioCatorceWks {
    //Ejercicio 14: Convertidor de Temperatura
    //Crea un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe
    //poder elegir si quiere convertir de Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
    //Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a
    //Fahrenheit.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertidor de Temperatura");
        System.out.println("===============================");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();

        double temperatura;
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la temperatura en Celsius: ");
                temperatura = scanner.nextDouble();
                double fahrenheit = (temperatura * 9/5) + 32;
                System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit", temperatura, fahrenheit);
                break;
            case 2:
                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                temperatura = scanner.nextDouble();
                double celsius = (temperatura - 32) * 5/9;
                System.out.printf("%.2f grados Fahrenheit son %.2f grados Celsius", temperatura, celsius);
                break;
            default:
                System.out.println("convercion no aceptable en el programa");
        }
        scanner.close();
    }
}
