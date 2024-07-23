package org.example;

public class EmpleadorPermanente extends Empleado{
    private String fechaIngresoEmpleado;

    // creacion de metodo constructor y medotos getters and setters

    public EmpleadorPermanente(String nombre, int edad, int id, double salario, String fechaIngresoEmpleado) {
        super(nombre, edad, id, salario);
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
    }

    public String getFechaIngresoEmpleado() {
        return fechaIngresoEmpleado;
    }

    public void setFechaIngreseEmpleado(String fechaIngresoEmpleado) {
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
    }

    public String toString(){
        return "Empleado Permanente: "+
                "Empleado => "+
                "Fecha de ingreso del empleado = "+ fechaIngresoEmpleado+"\n"+
                " -- " + super.toString() + " .";
    }
}
