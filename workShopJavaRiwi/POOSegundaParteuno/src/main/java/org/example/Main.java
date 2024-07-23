package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        boolean opcion = true;
        while (opcion){
            System.out.println("Ingrese los datos del producto, por favor: ");
            System.out.println("Producto -> ");
            System.out.println("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Ingresa el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio: ");
            double precio = Double.parseDouble(sc.nextLine());

            System.out.println("el producto ingresado es especifico? (si - no): ");
            String especifico = sc.nextLine();

            if(especifico.equalsIgnoreCase("si")){
                System.out.println("Ingrese la categoria: ");
                String categoria = sc.nextLine();
                System.out.println("Ingrese la marca: ");
                String marca = sc.nextLine();

                ProductoEspecifico producto = new ProductoEspecifico(id, nombre,precio,categoria, marca);
                inventario.agregar(producto);
            }

            System.out.println("DEsea añadir un producto adicional? (si - no)");
            String respuesta = sc.nextLine();
            if(!respuesta.equalsIgnoreCase("si")){
                opcion = false;
            }
        }

        System.out.println("Inventarios de nuestros producto: ");
        inventario.informacionProducto();

    }
}