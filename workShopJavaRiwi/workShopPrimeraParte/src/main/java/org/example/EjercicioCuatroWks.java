package org.example;
import java.util.Scanner;

public class EjercicioCuatroWks {
    public static void main(String[] args){
        //Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC)
        //Escribe un programa que calcule el índice de masa corporal (IMC) de una persona. El programa
        //debe pedir al usuario su peso en kilogramos y su altura en metros, calcular el IMC y mostrar un
        //mensaje con el resultado. La fórmula para calcular el IMC es peso / (altura * altura).

        // Aquí va el código para calcular el IMC
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Indice de Masa Corporal (IMC)");
        System.out.println("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Su IMC es %.2f%n", imc);


    }
}
