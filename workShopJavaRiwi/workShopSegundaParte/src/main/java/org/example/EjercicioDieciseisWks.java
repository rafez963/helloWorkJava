package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjercicioDieciseisWks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su contraseña: ");
        String contrasena = scanner.nextLine();

        if (contrasena.length() > 12) {
            boolean mayuscula = false;
            boolean numero = false;
            boolean letraOsimbolo = false;
            boolean especial = false;

            // Define caracteres especiales (escapando caracteres especiales)
            Pattern special = Pattern.compile("[?!¡@¿.,´)]");
            Matcher hasSpecial = special.matcher(contrasena);

            for (int i = 0; i < contrasena.length(); i++) {
                char l = contrasena.charAt(i);

                if (Character.isDigit(l)) {
                    numero = true;
                }
                if (Character.isLetter(l)) {
                    letraOsimbolo = true;
                }
                if (Character.isUpperCase(l)) {
                    mayuscula = true;
                } if (hasSpecial.find()) {
                    especial = true;
                }
            }

            if (numero && mayuscula && letraOsimbolo && especial) {
                System.out.println("Tu contraseña es segura");
            } else {
                System.out.println("Contraseña es insegura");
            }
        } else {
            System.out.println("Contraseña con menos de 12 caracteres no es admitida");
        }
    }
}
