package ipn.cic.sesion4;

import java.util.Scanner;

public class DosJarras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jarra jarra1 = new Jarra();
        Jarra jarra2 = new Jarra();

        // EJERCICIO: Agregar una jarra más (jarra3) con sus opciones
        // 3. Vertir de Jarra 1 a Jarra 3
        // 4. Vertir de Jarra 3 a Jarra 1
        // 5. Vertir de Jarra 2 a Jarra 3
        // 6. Vertir de Jarra 3 a Jarra 2
        // 7. Salir
        
        System.out.println("Captura Jarra 1");
        jarra1.capturar(scanner);

        System.out.println("Captura Jarra 2");
        jarra2.capturar(scanner);

        while (true) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            jarra1.describir();
            jarra2.describir();
            System.out.println("1. Vertir de Jarra 1 a Jarra 2");
            System.out.println("2. Vertir de Jarra 2 a Jarra 1");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("Danos el porcentaje a vertir");
                int porcentaje = scanner.nextInt();
                scanner.nextLine();
                jarra1.vertir(jarra2, porcentaje);
            } else if (opcion == 2) {
                System.out.println("Danos el porcentaje a vertir");
                int porcentaje = scanner.nextInt();
                scanner.nextLine();
                jarra2.vertir(jarra1, porcentaje);
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("La opción no es válida");
            }

        }

        scanner.close();
    }

}
