package org.example;

public class EmpleadoTemporal extends Empleado{
    //creqacion de atributos
    private String fechaFinContrato;
    //creacion de constructor y getter and setter
    public EmpleadoTemporal(String nombre, int edad, int id, double salario, String fechaFinContrato) {
        super(nombre, edad, id, salario);
        this.fechaFinContrato = fechaFinContrato;
    }

    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public String toString(){
        return "Empleado Temporal: "+
                "Empleado => "+
                "Fecha de Inicio del contrato = "+ fechaFinContrato+"\n"+
                " -- " + super.toString() + " .";
    }

}
