package org.example;

import java.util.Scanner;

public class EjercicioDoceWks {

    //Ejercicio 12: Generador de Horóscopo
    //Implementa un programa que le pida al usuario su mes y día de nacimiento. Luego, basado en esa
    //información, muestra su signo del zodíaco. Utiliza una estructura switch para manejar los meses y if
    //para los días.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Signo del sodiaco: ");
        System.out.println("Ingrese el mes de nacimiento entre(1 - 12): ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el numero de dia en el que naciste (1- 31): ");
        int dia = scanner.nextInt();
        String signo = "";
        switch (mes) {
            case 1:
                if (dia >= 20) {
                    signo = "Acuario";
                } else {
                    signo = "Capricornio";
                }
                break;
            case 2:
                if (dia >= 19) {
                    signo = "Piscis";
                } else {
                    signo = "Acuario";
                }
                break;
            case 3:
                if (dia >= 21) {
                    signo = "Aries";
                } else {
                    signo = "Piscis";
                }
                break;
            case 4:
                if (dia >= 20) {
                    signo = "Tauro";
                } else {
                    signo = "Aries";
                }
                break;
            case 5:
                if (dia >= 21) {
                    signo = "Géminis";
                } else {
                    signo = "Tauro";
                }
                break;
            case 6:
                if (dia >= 21) {
                    signo = "Cáncer";
                } else {
                    signo = "Géminis";
                }
                break;
            case 7:
                if (dia >= 23) {
                    signo = "Leo";
                } else {
                    signo = "Cáncer";
                }
                break;
            case 8:
                if (dia >= 23) {
                    signo = "Virgo";
                } else {
                    signo = "Leo";
                }
                break;
            case 9:
                if (dia >= 23) {
                    signo = "Libra";
                } else {
                    signo = "Virgo";
                }
                break;
            case 10:
                if (dia >= 23) {
                    signo = "Escorpio";
                } else {
                    signo = "Libra";
                }
                break;
            case 11:
                if (dia >= 22) {
                    signo = "Sagitario";
                } else {
                    signo = "Escorpio";
                }
                break;
            case 12:
                if (dia >= 22) {
                    signo = "Capricornio";
                } else {
                    signo = "Sagitario";
                }
                break;
            default:
                System.out.println("Mes ingresado no válido.");
                break;
        }
        scanner.close();
    }
}
