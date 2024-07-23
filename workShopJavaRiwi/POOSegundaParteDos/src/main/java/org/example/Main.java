package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionEmpleado administracionEmpleado = new GestionEmpleado();

        // pediremos los datos del empleado en cuestion
        boolean opcion = true;
        while (opcion){
            //obtenemos los datos del empeleado
            System.out.println("Ingrese los datos del empleado: ");
            System.out.println("Nombre del empleado: ");
            String nombreEmpleado = sc.nextLine();
            System.out.println("Edad del empleado: ");
            int edadEmpleado = Integer.parseInt(sc.nextLine());
            System.out.println("Id del empleado: ");
            int idEmpleado= Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el salario del empleado: ");
            double salarioEmpleado = Double.parseDouble(sc.nextLine());

            System.out.println("¿El empleado que esta ingresando es Temporal o Permanente: ");
            String tipoEmpleado = sc.nextLine();

            // vamos a pedir informacion en relacion al tipo de empledo en relacion a su contrato
            //temporal o permanente

            if(tipoEmpleado.equalsIgnoreCase("temporal")){
                System.out.println("Fecha de finalizacion de la contratacion -> dd / mm / yyyy");
                String contratoFechaFinalizacion = sc.nextLine();
                EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(nombreEmpleado, edadEmpleado, idEmpleado, salarioEmpleado, contratoFechaFinalizacion);
            }else {
                System.out.println("Fecha de ingreso -> dd / mm / yyyy : ");
                String contratoFechaIngreso = sc.nextLine();
                EmpleadorPermanente empleadorPermanente = new EmpleadorPermanente(nombreEmpleado, edadEmpleado, idEmpleado, salarioEmpleado, contratoFechaIngreso);
                administracionEmpleado.agregarEmpleado(empleadorPermanente);
            }

            System.out.println("¿Desea agregar un empleado adicional? (si - no ): ");
            String respuesta = sc.nextLine();
            if(!respuesta.equalsIgnoreCase("si")){
                opcion = false;
            }
        }
        System.out.println("Listado de empleados: ");
        administracionEmpleado.imprimirEmpleado();
    }
}
