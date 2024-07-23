package org.example;

public class Empleado extends Persona {
    private int id;
    private double salario;

    // creacion del contructor y los metodos getters and setters
    public Empleado(String nombre, int edad, int id, double salario) {
        super(nombre, edad);
        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
