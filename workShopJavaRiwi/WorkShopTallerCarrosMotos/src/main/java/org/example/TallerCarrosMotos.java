package org.example;

import java.util.Scanner;

public class TallerCarrosMotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definimos el número total de empleados permitido
        System.out.println("Ingrese el número total de empleados: ");
        int maxEmployees = Integer.parseInt(sc.nextLine());

        // Creamos un array tridimensional
        String[][][] tallerArray = new String[maxEmployees][2][4];

        System.out.println("Ingrese por favor el número de trabajos registrados: ");
        int numeroTrabajos = Integer.parseInt(sc.nextLine());

        // Comparamos si el número de trabajos es acorde con el número de trabajadores
        if (maxEmployees < numeroTrabajos) {
            System.out.println("El número de trabajadores excede el límite permitido.");
            return;
        }

        for (int i = 0; i < numeroTrabajos; i++) {
            System.out.println("Ingrese por favor, el nombre del empleado: ");
            String empleado = sc.nextLine();

            System.out.println("Ingrese por favor la clase de vehículo: moto (0) - carro (1)");
            int tipoVehiculo = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese la marca del vehículo: ");
            String marca = sc.nextLine();

            System.out.println("Ingrese el modelo del vehículo: ");
            String modelo = sc.nextLine();

            System.out.println("Ingrese el año del vehículo: ");
            int año = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese el estado PENDIENTE - EN REPARACION - REPARADO ");
            String estado = sc.nextLine();

            tallerArray[i][tipoVehiculo][0] = marca;
            tallerArray[i][tipoVehiculo][1] = modelo;
            tallerArray[i][tipoVehiculo][2] = String.valueOf(año);
            tallerArray[i][tipoVehiculo][3] = estado;
        }

        mostrarVehiculos(tallerArray, numeroTrabajos);
        estadoVehiculos(tallerArray, numeroTrabajos);
        buscarVehiculo(tallerArray, numeroTrabajos, sc);
        actualizarEstado(tallerArray, numeroTrabajos, sc);
    }

    private static void mostrarVehiculos(String[][][] tallerArray, int numeroTrabajos) {
        System.out.println("Agenda de trabajos:");
        System.out.println(" - Tipo - Marca - Modelo - Año - Estado");

        for (int i = 0; i < numeroTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (tallerArray[i][j][0] != null) {
                    String tipo = (j == 0) ? "Moto" : "Carro";
                    String result = "| " + tipo + " | " +
                            tallerArray[i][j][0] + " | " +
                            tallerArray[i][j][1] + " | " +
                            tallerArray[i][j][2] + " | " +
                            tallerArray[i][j][3] + " | ";
                    System.out.println(result);
                }
            }
        }
    }

    private static void estadoVehiculos(String[][][] tallerArray, int numeroTrabajos) {
        int pendientes = 0;
        int reparandose = 0;
        int reparados = 0;

        for (int i = 0; i < numeroTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (tallerArray[i][j][3] != null) {
                    switch (tallerArray[i][j][3].toLowerCase()) {
                        case "pendiente":
                            pendientes++;
                            break;
                        case "en reparacion":
                            reparandose++;
                            break;
                        case "reparado":
                            reparados++;
                            break;
                    }
                }
            }
        }
        System.out.println("Estado de los vehículos en el taller:");
        System.out.println("Pendientes: " + pendientes);
        System.out.println("En Reparación: " + reparandose);
        System.out.println("Reparado: " + reparados);
    }

    private static void buscarVehiculo(String[][][] tallerArray, int numeroTrabajos, Scanner sc) {
        System.out.println("Ingrese por favor la marca del vehículo que desea buscar en nuestro taller:");
        String busquedaMarca = sc.nextLine().toLowerCase();

        System.out.println("Ingrese por favor el modelo del vehículo que desea buscar en nuestro taller:");
        String busquedaModelo = sc.nextLine().toLowerCase();

        boolean ubicado = false;

        for (int i = 0; i < numeroTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (tallerArray[i][j][0] != null && tallerArray[i][j][0].toLowerCase().equals(busquedaMarca) &&
                        tallerArray[i][j][1].toLowerCase().equals(busquedaModelo)) {
                    String tipo = (j == 0) ? "Moto" : "Carro";
                    System.out.println("El vehículo buscado --> Tipo: " + tipo +
                            " - Marca: " + tallerArray[i][j][0] +
                            " - Modelo: " + tallerArray[i][j][1] +
                            " - Año: " + tallerArray[i][j][2] +
                            " - Estado: " + tallerArray[i][j][3]);
                    ubicado = true;
                }
            }
        }

        if (!ubicado) {
            System.out.println("No encontramos el vehículo indicado.");
        }
    }

    private static void actualizarEstado(String[][][] tallerArray, int numeroTrabajos, Scanner sc) {
        System.out.println("Ingrese la marca del vehículo a actualizar:");
        String busquedaMarca = sc.nextLine().toLowerCase();

        System.out.println("Ingrese el modelo del vehículo que se actualizará en el taller:");
        String busquedaModelo = sc.nextLine().toLowerCase();

        boolean ubicado = false;

        for (int i = 0; i < numeroTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (tallerArray[i][j][0] != null && tallerArray[i][j][0].toLowerCase().equals(busquedaMarca) &&
                        tallerArray[i][j][1].toLowerCase().equals(busquedaModelo)) {
                    System.out.println("Ingrese el nuevo estado PENDIENTE - EN REPARACION - REPARADO");
                    String estadoNew = sc.nextLine();
                    tallerArray[i][j][3] = estadoNew;
                    System.out.println("Estado actualizado para el vehículo: " + tallerArray[i][j][0] + " " + tallerArray[i][j][1] + " - " + estadoNew);
                    ubicado = true;
                }
            }
        }

        if (!ubicado) {
            System.out.println("No se encontró el vehículo buscado para actualizar.");
        }
    }
}
