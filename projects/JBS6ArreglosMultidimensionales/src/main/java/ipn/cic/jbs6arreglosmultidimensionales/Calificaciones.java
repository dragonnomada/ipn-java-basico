package ipn.cic.jbs6arreglosmultidimensionales;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        String[] parciales = {"Parcial 1", "Parcial 2", "Examen Final"};

        String[] materias = {"Matemáticas", "Geografía", "Historia", "Química", "Física"};

        double[][] calificaciones = new double[3][5];

        Scanner scanner = new Scanner(System.in);

        for (int p = 0; p < calificaciones.length; p++) { // Número de filas
            for (int m = 0; m < calificaciones[0].length; m++) { // Número de columnas
                System.out.printf("%s | %s\n", parciales[p], materias[m]);
                calificaciones[p][m] = scanner.nextDouble();
                scanner.nextLine();
            }
        }

        // Suma Horizontal | Fila por Fila
        for (int p = 0; p < calificaciones.length; p++) {
            double sumaParcial = 0;
            for (int m = 0; m < calificaciones[0].length; m++) {
                double calificacion = calificaciones[p][m];
                sumaParcial = sumaParcial + calificacion;
            }
            System.out.printf("%s | Promedio: %02.2f\n", parciales[p], sumaParcial / calificaciones[0].length);
        }

        // Suma Vertical | Columna por Columna
        for (int m = 0; m < calificaciones[0].length; m++) {
            double sumaMateria = 0;
            for (int p = 0; p < calificaciones.length; p++) {
                double calificacion = calificaciones[p][m];
                sumaMateria = sumaMateria + calificacion;
            }
            System.out.printf("%s | Promedio: %02.2f\n", materias[m], sumaMateria / calificaciones.length);
        }

        scanner.close();

    }

}
