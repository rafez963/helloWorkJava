package org.example;
import java.util.Scanner;

public class EjercicioDiecisiete {
    public static void main(String[] args){
        //Crea un programa que pida al usuario un carácter e imprima en
        //consola si es una consonante, vocal o carácter especial.
        Scanner sc = new Scanner(System.in);
        //Definimos el caracter que el usuario va a ingresar
        System.out.println("Ingrese un caracter, por favor: ");
        char caracter = sc.next().charAt(0);
        char l = Character.toLowerCase(caracter);
        if(l >= 'a' && l <= 'z') {

            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                System.out.println("El caracter ingresado es una vocal.");
            }
            else {
                System.out.println("El caracter ingresado es una consonate.");
            }
            if(!Character.isLetterOrDigit(l)){
                System.out.println("EL caracter ");
            }
        }else{
            System.out.println("No es permitido lo que acabas de ingresar");
        }

    }
}
