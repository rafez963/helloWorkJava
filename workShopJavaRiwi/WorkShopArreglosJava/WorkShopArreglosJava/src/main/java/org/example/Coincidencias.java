package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Coincidencias {
    public static void main(String[] args){
        // CREAMOS UN OBJETO SCANNER PARA OBTENER DEL USUARIO LA CADENA A BUSCAR
        Scanner sc = new Scanner(System.in);
        // CREAEREMOS UN ARRAY CON LA LISTA DE LOS NOMBRE
        String[] nombres = {"carlos","camilo","juan jose","karen","alejandra","veronica","emilino" };
        //PETICION AL USUARIO PARA QUE INGRESE EL NOMBRE QUE DESEA BUSCAR
        System.out.println("Ingrese el nombre que desea buscar en la lista de nombres: ");
        String busqueda = sc.nextLine();
        int posicion = -1;
        boolean encontrado = false;

        //buscar el nombre
        for (int i=0; i < nombres.length; i++){
            if (nombres[i].equalsIgnoreCase(busqueda)){
                encontrado = true;
                posicion = i+1;
                break;
            }
        }

        if (encontrado){
            System.out.println("El nombre "+busqueda+" se encuentra la pocision "+posicion+ " de nuestra lista de nombre");

        }else {
            System.out.println("El nombre "+busqueda+" no se encuentra en nuestra lista de nombres");

        }

    }
}
