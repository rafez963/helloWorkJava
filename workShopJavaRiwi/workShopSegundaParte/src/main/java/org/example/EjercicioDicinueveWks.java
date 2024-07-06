package org.example;
import java.util.Random;
import java.util.Scanner;
public class EjercicioDicinueveWks {
    public static void main(String[] args){
        //Ejercicio 18: Juego de piedra, papel o tijera:
        //Crear un programa que simule el juego de piedra, papel o tijera
        //contra el usuario. Permitir al usuario elegir entre piedra, papel o
        //tijera. Determinar el ganador del juego y mostrar el resultado.

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingresa tu eleccion piedra-papel-tijera");
        String eleccionUsuario = sc.nextLine().toLowerCase();
        int eleccionPC = random.nextInt(3);
        String eleccionPcString = "";
        if(eleccionPC == 0){
            eleccionPcString = "piedra";
        }else if(eleccionPC == 1){
            eleccionPcString = "papel";
        }else if(eleccionPC == 2 ){
            eleccionPcString = "tijera";
        };

        if(eleccionUsuario.equals("piedra") || eleccionUsuario.equals("papel") || eleccionUsuario.equals("tijera")){
            if(eleccionUsuario.equals(eleccionPcString)){
                System.out.println("Quedaron Empatados");
            }else if( eleccionUsuario.equals("piedra") && eleccionPcString.equals("tijera")){
                System.out.println("Gano el Usuario");
            }else if(eleccionUsuario.equals("papel") && eleccionPcString.equals("piedra")){
                System.out.println("Gano Usuarios");
            }else{
                System.out.println("GANA LA MAQUINA");
            };
        }else {
            System.out.println("No es una opcion correcta.");
        }


    }
}
