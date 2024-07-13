import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_NOTAS_TOTAL = 8;
        final int PUNTAJE_MINIMO_APROBACION = 76;

        int[] calificaciones = new int[NUM_NOTAS_TOTAL];
        int sumaCalificacionesIngresadas = 0;

        // Ingreso de las calificaciones obtenidas
        System.out.println("Ingrese las calificaciones obtenidas:");
        for (int i = 0; i < NUM_NOTAS_TOTAL; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextInt();
            sumaCalificacionesIngresadas += calificaciones[i];
        }

        // Calcular calificaciones faltantes y puntaje máximo posible
        int calificacionesFaltantes = NUM_NOTAS_TOTAL - sumaCalificacionesIngresadas;
        int puntajeMaximoPosible = calificacionesFaltantes * 100;

        // Calcular el puntaje mínimo total requerido para aprobar
        int puntajeMinimoTotal = PUNTAJE_MINIMO_APROBACION * NUM_NOTAS_TOTAL;

        // Calcular el promedio necesario en las calificaciones faltantes para aprobar
        double promedioNecesario = (double) (puntajeMinimoTotal - sumaCalificacionesIngresadas) / calificacionesFaltantes;

        // Mostrar resultados
        System.out.println("\n------------------\nResumen del cálculo:");
        System.out.println("Calificaciones ya obtenidas: " + sumaCalificacionesIngresadas);
        System.out.println("Calificaciones faltantes: " + calificacionesFaltantes);
        System.out.println("Puntaje máximo posible obteniendo las calificaciones faltantes: " + puntajeMaximoPosible);
        System.out.println("Promedio necesario en las calificaciones faltantes para aprobar: " + promedioNecesario);

        sc.close();
    }
}
