package org.example;
import java.util.Scanner;
public class EjercicioCincoWks {
    public static void main(String[] args){
        //Ejercicio 5: Clasificador de Números
        //Crea un programa que solicite al usuario un número y muestre un mensaje indicando si el número
        //es positivo, negativo o cero. Además, indica si el número es par o impar.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Clsificador de Números");
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        if(numero >= 0){
            System.out.println("El número " +numero+ " es POSITIVO");
            if(numero % 2 == 0){
                System.out.println("El número " +numero+ " es  es PAR");
            } else{
                System.out.println("El número " +numero+ " es  es IMPAR");
            }
        } else if (numero <= 0) {
            System.out.println("El número es " +numero+ " es  NEGATIVO");
            if(numero % 2 == 0){
                System.out.println("El número " +numero+ " es  negativo es PAR");
            } else{
                System.out.println("El número " +numero+ " es  negativo es IMPAR");
            }
        }

    }
}
