package org.example;

import java.util.ArrayList;

public class GestionEmpleado {
    private ArrayList<Empleado> listaEmpleados;
//metodo constructor
    public GestionEmpleado(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public GestionEmpleado() {

    }

    // metodo para agregar un empleado
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    //metodo para eliminar un empleado
    public void eliminarEmpleado(int id){
        listaEmpleados.removeIf(empleado -> empleado.getId() == id);
    }

    // metodo para imprimir los resultados
    public void imprimirEmpleado(){
        for(Empleado empleado : listaEmpleados){
            System.out.println(empleado);
        }
    }
}

