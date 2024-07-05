package org.example;
import java.util.Scanner;

public class EjercicioOnceWks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       //Ejercicio 11: Calculadora de Promedio de Calificaciones
        //Escribe un programa que solicite al usuario ingresar 5 calificaciones y calcule el promedio de las mismas.
        //El programa debe imprimir el promedio con dos decimales.

        System.out.println("Promedio de calificaciones");
        System.out.println("================================");
        System.out.println("Ingrese las calificaciones: ");
        System.out.println("================================");
        System.out.println("Calificaion uno: ");
        double calificacion1 = scanner.nextDouble();
        System.out.println("Calificacion dos: ");
        double calificacion2 = scanner.nextDouble();
        System.out.println("Calificacion tres: ");
        double calificacion3 = scanner.nextDouble();
        System.out.println("Calificaion cuatro: ");
        double calificacion4 = scanner.nextDouble();
        System.out.println("Calificacion cinco: ");
        double calificacion5 = scanner.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5) / 5;
        System.out.printf("El promedio de las calificaciones es %.2f%n", promedio);

    //Crea un programa que solicite al usuario ingresar tres números enteros y luego los muestre
        //ordenados de menor a mayor. Intenta resolverlo primero con if y else, y luego intenta crear una
        //solución usando el operador ternario para práctica adicional.

        System.out.println("Ingrese por favor tres numeros");
        System.out.println("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer nuemro entero: ");
        int num3 = scanner.nextInt();

        int minNum = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;
        int maxNum = (num3 > num1 && num3 > num2) ? num3 : (num2 > num1) ? num2 : num1;
        int midNum = (num1 + num2 + num3) - minNum - maxNum;

        System.out.println("Números ordenados de menor a mayor:"+ minNum+" - "+ maxNum+" - "+ midNum);
    }
}
