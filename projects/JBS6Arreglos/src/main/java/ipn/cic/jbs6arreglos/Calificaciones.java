package ipn.cic.jbs6arreglos;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        
        double[] calificaciones = new double[10];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.printf("Calificación %d:\n", i + 1);
            calificaciones[i] = scanner.nextDouble(); scanner.nextLine();
        }
        
        double suma = 0;
        
        for (double calificacion : calificaciones) {
            System.out.println(calificacion);
            suma = suma + calificacion; // suma += calificacion;
        }
        
        System.out.println("--------------");
        
        System.out.printf("Suma: %.2f\n", suma);
        System.out.printf("Promedio: %.2f\n", suma / calificaciones.length);
        
        scanner.close();
        
    }
    
}
