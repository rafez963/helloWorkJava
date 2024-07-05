package org.example;
import java.util.Scanner;
public class EjercicioDoswks {
    //Ejercicio 2: Verificador de Edad
    //Crea un programa que solicite la edad del usuario y determine si es mayor de edad (18 años o más).
    //El programa debe imprimir un mensaje indicando si el usuario es mayor de edad o no.

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificador de Edad");

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if(edad >= 18){
            System.out.println("El usuario es MAYOR de edad");
        }else{
            System.out.println("El usuario es MENOR de edad");
        }
    }
}
