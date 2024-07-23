package org.example;

public class Persona {
    //creacionde atributos para la clase
    private String nombre;
    private int edad;

    // creacion del constructo , getters and setters

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return "Persona ==> "+
                "nombre = "+nombre+"\n"+
                "edad = "+ edad;
    }
}
