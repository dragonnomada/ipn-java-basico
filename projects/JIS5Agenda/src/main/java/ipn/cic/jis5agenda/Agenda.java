package ipn.cic.jis5agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        Scanner scanner = new Scanner(System.in);

        MENU:
        while (true) {

            System.out.println("Agenda");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Ver Personas");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Persona persona = new Persona();
                    persona.capturar(scanner);
                    listaPersonas.add(persona);
                    break;
                case 2:
                    for (Persona personaIterada : listaPersonas) {
                        personaIterada.describir();
                    }
                    break;
                case 3:
                    break MENU;
            }

        }

        scanner.close();

    }

}
