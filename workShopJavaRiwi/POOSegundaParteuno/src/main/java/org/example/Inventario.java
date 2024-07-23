package org.example;

import java.util.ArrayList;

public class Inventario {
    //cracion para el array de los producto del inventario
    private ArrayList<Producto> inventarioProductos;

    public Inventario() {
        this.inventarioProductos = inventarioProductos;
    }

    //creacion de metodo para agregar un nuevo producto a nuestro inventario
    public void agregar(Producto producto){
        inventarioProductos.add(producto);
    }

    //creacion de metodo para eleminiar un producto de nuestro inventario
    public void eliminaro(int id){
        for ( Producto producto : inventarioProductos ){
            if(producto.getId() == id){
                inventarioProductos.remove(producto);
                break;
            }
        }
    }

    public void informacionProducto(){
        System.out.println("-_-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-_");
        System.out.println("Productos que tenemos en nuestra tienda: ");
        for (Producto producto : inventarioProductos){
            System.out.println("PRODUCTO -> \n");
            System.out.println("ID: "+producto.getId());
            System.out.println("Nombre: "+ producto.getNombre());
            System.out.println("Precion: $ "+producto.getPrecio());
            System.out.println("-_-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-_");
            if (producto instanceof ProductoEspecifico){
                ProductoEspecifico productoEspecifico = (ProductoEspecifico) producto;
                System.out.println("Categoria: "+ productoEspecifico.getCategoria());
                System.out.println("Marca: "+ productoEspecifico.getMarca());
            }
            System.out.println("-_-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-__-_-_");

        }
    }

    //Metodo para buscar un producto en relacion a su nombre
    public Producto buscarNombreProducto(String nombre){
        for(Producto producto : inventarioProductos){
            if(producto.getNombre().equalsIgnoreCase(nombre)){
                return producto;
            }
        }
        //si no encontramos el producto por el nombre
        return null;
    }

    //metodo para buscar los productos del invenrario mediente la categorias
    public ArrayList<Producto> buscarCategoria(String categoria){
        ArrayList<Producto> productosCategoria = new ArrayList<>();
        for(Producto producto : inventarioProductos){
            if(producto instanceof ProductoEspecifico){
                ProductoEspecifico productoEspecifico = (ProductoEspecifico) producto;
                if (productoEspecifico.getCategoria().equalsIgnoreCase(categoria)){
                    productosCategoria.add(producto);
                }
            }
        }
        return productosCategoria;
    }

}
