import java.util.Scanner;

public class Productos {
    public static void main(String[] args) {
        String[] productos = {"Bananno", "Manzana", "Pera", "Patilla"};
        double[] precios = {10.0, 25.23, 12.85, 56.23};
        int cantidad = 0;
        double precioTotal = 0.0;
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Mostrar los productos y precios disponibles
        System.out.println("Los productos y precios son los siguientes:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i] + " -- Precio: $" + precios[i]);
        }

        // Menú de compra
        do {
            System.out.println("\n----------------------------------");
            System.out.println("Menú de compra");
            System.out.println("Seleccione el producto que desea agregar al carrito:");
            System.out.println("1. Producto Banano");
            System.out.println("2. Producto Manzana");
            System.out.println("3. Producto Pera");
            System.out.println("4. Producto Patilla");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado " + productos[0]);
                    System.out.print("Ingrese la cantidad que desea llevar: ");
                    cantidad = sc.nextInt();
                    precioTotal = cantidad * precios[0];
                    System.out.println("El precio total para " + cantidad + " unidades es: $" + precioTotal);
                    break;
                case 2:
                    System.out.println("Ha seleccionado " + productos[1]);
                    System.out.print("Ingrese la cantidad que desea llevar: ");
                    cantidad = sc.nextInt();
                    precioTotal = cantidad * precios[1];
                    System.out.println("El precio total para " + cantidad + " unidades es: $" + precioTotal);
                    break;
                case 3:
                    System.out.println("Ha seleccionado " + productos[2]);
                    System.out.print("Ingrese la cantidad que desea llevar: ");
                    cantidad = sc.nextInt();
                    precioTotal = cantidad * precios[2];
                    System.out.println("El precio total para " + cantidad + " unidades es: $" + precioTotal);
                    break;
                case 4:
                    System.out.println("Ha seleccionado " + productos[3]);
                    System.out.print("Ingrese la cantidad que desea llevar: ");
                    cantidad = sc.nextInt();
                    precioTotal = cantidad * precios[3];
                    System.out.println("El precio total para " + cantidad + " unidades es: $" + precioTotal);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}

