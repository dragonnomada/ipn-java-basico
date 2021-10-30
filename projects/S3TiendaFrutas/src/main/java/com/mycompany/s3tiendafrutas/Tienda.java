package com.mycompany.s3tiendafrutas;

import java.util.ArrayList;
import java.util.Scanner;

/*
+========================================+
| Tienda                                 |
+----------------------------------------+
| - frutas : ArrayList<Fruta>            |
+----------------------------------------+
| + getFrutaByName(name) : Fruta         |
| + addFruta(fruta)                      |
| + venderFruta(fruta, peso) : boolean   |
+----------------------------------------+
| + menu()                               |
| + decribir()                           |
| + mostrarListaFrutas()                 |
+========================================+
 */
public class Tienda {

    private ArrayList<Fruta> frutas = new ArrayList<Fruta>();

    public Fruta getFrutaByName(String nombre) {
        for (Fruta fruta : this.frutas) {
            if (fruta.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return fruta;
            }
        }

        return null;
    }

    public void addFruta(Fruta fruta) {
        this.frutas.add(fruta);
    }

    public boolean venderFruta(Fruta fruta, double peso) {
        if (fruta.canRemoveCantidad(peso)) {
            fruta.removeCantidad(peso);
            return true;
        } else {
            return false;
        }
    }

    public void mostrarListaFrutas() {
        System.out.printf("Frutas: %d\n", this.frutas.size());
        for (Fruta fruta : this.frutas) {
            fruta.describir();
        }
    }

    public void describir() {
        System.out.println("Tienda de Fruta");
        System.out.println("-------------------------------------------");
        this.mostrarListaFrutas();
        System.out.println("-------------------------------------------");
    }

    public void menu() {
        int opcion;

        Scanner scanner = new Scanner(System.in);

        do {
            this.describir();

            System.out.println();

            System.out.println("Selecciona una opción");
            System.out.println("1. Agregar una fruta");
            System.out.println("2. Vender una fruta");
            System.out.println("----------------------");
            System.out.println("3. Salir");

            System.out.println("Opción:");
            opcion = scanner.nextInt(); scanner.nextLine();

            switch (opcion) {
                case 1:
                    Fruta fruta = new Fruta();
                    fruta.capturar(scanner);
                    this.addFruta(fruta);
                    System.out.println("Fruta agregada:");
                    fruta.describir();
                    pause(scanner);
                    break;
                case 2:
                    System.out.println("Se venderá una fruta:");
                    System.out.println("Dame el nombre:");
                    String nombre = scanner.nextLine();
                    Fruta frutaAVender = this.getFrutaByName(nombre);
                    if (frutaAVender == null) {
                        System.out.println("La fruta no existe :(");
                        break;
                    }
                    System.out.println("Dame el peso a vender (Kgs):");
                    double peso = scanner.nextDouble();
                    this.venderFruta(frutaAVender, peso);
                    System.out.println("Fruta vendida:");
                    frutaAVender.describir();
                    pause(scanner);
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("La opción no es válida");
                    pause(scanner);
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    public void pause(Scanner scanner) {
        System.out.println("[Presiona Enter para continuar]");
        scanner.nextLine();
    }

}
