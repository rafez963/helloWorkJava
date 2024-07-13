package org.example;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        double numUno = 0, numDos = 0;

        do {
            //menu
            System.out.println("-");
            System.out.println("----------------------------------\nMenu Matematico");
            System.out.println("1. Suma.");
            System.out.println("2. Resta.");
            System.out.println("1. Multiplicacion.");
            System.out.println("1. Division.");
            System.out.println("5. Salir");
            System.out.println("Que operacion desea realizar: ");
            opcion = sc.nextInt();

            if(opcion >=1 && opcion<=4){
                System.out.println("Ingresa los numero para realizar la operacion");
                System.out.println("Numero Uno: ");
                numUno = sc.nextDouble();
                System.out.println("Numero Dos: ");
                numDos = sc.nextDouble();
            };

            switch (opcion){
                case 1:
                    System.out.println("La suma del numero uno "+ numUno +" mas " +
                            + numDos +" es igual : "+ (numUno + numDos));
                    break;

                case 2:
                    System.out.println("La resta del numero uno "+ numUno +" menos " +
                            + numDos +" es igual : "+ (numUno - numDos));
                    break;
                case 3:
                    System.out.println("La multiplicacion del numero uno "+ numUno +" mas " +
                            + numDos +" es igual : "+ (numUno * numDos));
                    break;
                case 4:
                    if(numDos !=0 ){
                        System.out.println("La division del numero uno "+ numUno +" mas " +
                                + numDos +" es igual : "+ (numUno / numDos));
                    }else{
                        System.out.println("No es posible dividir entre cero.");
                    }
                case 5:
                    System.out.println("SALIENDO DEL PROGRAMA ... ");
                    break;
                default:
                    System.out.println("Opcion no valida");

                    break;
            }

        }while (opcion != 5);

        sc.close();
    }
}
