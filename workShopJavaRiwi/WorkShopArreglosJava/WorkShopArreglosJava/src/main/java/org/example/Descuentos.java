import java.util.Scanner;
public class Descuentos {
    public static void main(String[] args) {
        //definimos una lista con todos los productos que tenemos en el almacen
        String[] productos = {"Banano", "Manzana", "Pera", "Patilla"};
        // aqui tenemos una lista que relaciona los precios con los productos
        double[] precios = {10.0, 25.23, 12.85, 56.23};
        // declaracion de la variable cantidad que seria la cantidad de producto que ncesita el cliente
        int cantidad = 0;
        // precio total de la venta
        double precioTotal = 0.0;
        Scanner sc = new Scanner(System.in);
        //opccion a elegir por parte del usuario
        int opcion;

        // Mostrar los productos y precios disponibles
        System.out.println("Los productos y precios son los siguientes:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i] + " -- Precio: $" + precios[i]);
        }

        // Variables para descuentos
        double porcentajeDescuento = 0.0;
        double montoMinimoDescuento = 0.0;

        // Menú de compra
        do {
            System.out.println("\n----------------------------------");
            System.out.println("Menú de compra");
            System.out.println("Seleccione el producto que desea agregar al carrito:");
            System.out.println("1. Producto Banano");
            System.out.println("2. Producto Manzana");
            System.out.println("3. Producto Pera");
            System.out.println("4. Producto Patilla");
            System.out.println("5. Finalizar compra");
            System.out.print("Ingrese la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    int indiceProducto = opcion - 1; // Calcular el índice del producto seleccionado
                    System.out.println("Ha seleccionado " + productos[indiceProducto]);
                    System.out.print("Ingrese la cantidad que desea llevar: ");
                    cantidad = sc.nextInt();
                    precioTotal += cantidad * precios[indiceProducto];
                    System.out.println("El precio total para " + cantidad + " unidades es: $" + precioTotal);
                    break;
                case 5:
                    // Calcular descuento según monto total de la compra
                    if (precioTotal >= 1000) {
                        porcentajeDescuento = 0.25; // 25%
                        montoMinimoDescuento = 1000;
                    } else if (precioTotal >= 500) {
                        porcentajeDescuento = 0.20; // 20%
                        montoMinimoDescuento = 500;
                    } else if (precioTotal >= 300) {
                        porcentajeDescuento = 0.15; // 15%
                        montoMinimoDescuento = 300;
                    } else if (precioTotal >= 200) {
                        porcentajeDescuento = 0.10; // 10%
                        montoMinimoDescuento = 200;
                    } else {
                        porcentajeDescuento = 0.0; // No aplica descuento
                    }

                    // Calcular descuento y precio final
                    double descuentoAplicado = precioTotal * porcentajeDescuento;
                    double precioConDescuento = precioTotal - descuentoAplicado;

                    // Mostrar resumen de la compra
                    System.out.println("\nTotal de compra:");
                    System.out.println("Precio total sin descuento: $" + precioTotal);
                    if (porcentajeDescuento > 0) {
                        System.out.println("Descuento aplicado (" + (porcentajeDescuento * 100) + "%): $" + descuentoAplicado);
                        System.out.println("Precio final con descuento: $" + precioConDescuento);
                    } else {
                        System.out.println("No se aplicó descuento.");
                        System.out.println("Precio final: $" + precioTotal);
                    }

                    // Salir del programa
                    System.out.println("\nGracias por comprar en nuestra tienda. Lo esperamos ");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
