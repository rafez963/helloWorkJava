package org.example;

public class ProductoEspecifico extends Producto {
    //CReacionde los metodos
    private String marca;
    private String categoria;

    //creacion del metodo construcotcon el super para llamar a los atributos
    // de la clase padre
    public ProductoEspecifico(int id, String nombre, double precio) {
        super(id, nombre, precio);
        this.marca = marca;
        this.categoria = categoria;
    }

    public ProductoEspecifico(int id, String nombre, double precio, String marca, String categoria) {
        super(id, nombre, precio);
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
