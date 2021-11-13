package ipn.cic.sesion4;

import java.util.Scanner;

public class Jarra {

    private int capacidadMaxima;
    private int capacidadOcupada;

    public int vertir(Jarra otra, int porcentaje) {
        //1.obtener la cantidad a vertir
        int cantidad = this.calcularCantidadPorcentaje(porcentaje);
        //2.descontar la cantidad a vertir
        this.capacidadOcupada -= cantidad;
        //3.agregar a la otra jarra la cantidad a vertir
        otra.agregarCantidad(cantidad);
        // regresamos la cantidad que se virtió
        return cantidad;
    }

    private int calcularCantidadPorcentaje(int porcentaje) {
        // cantidad en militros que representa el porcentaje de la jarra
        int cantidad = (int) ((this.capacidadMaxima * 1000) * (1.0 * porcentaje / 100));
        // Si la cantidad es mayor al líquido ocupado
        if (cantidad > this.capacidadOcupada) {
            // la cantidad será el la capacidad ocupada por la jarra
            cantidad = this.capacidadOcupada;
        }
        // devolvemos la cantidad que se debería vertir
        return cantidad;
    }

    public int calcularPorcentajeOcupado() {
        // Calcula el porcentaje entre lo ocupado y lo máximo
        // Nota: La capacidad máxima está en Litros, multiplicamos por 1000 para los mililitros
        // Nota: El porcentaje será un entero del 0 al 100 (multiplicamos por 100)
        // Nota: La división entre 2 enteros es una división entera, debemos
        // convertir alguno de los dos en double para forzar la división decimal
        // Por práctica es recomentdable garantizar un numerador decimal
        int porcentaje = (int) ((1.0 * this.capacidadOcupada / (this.capacidadMaxima * 1000)) * 100);
        // Regresamos ese valor como resultado del método
        return porcentaje;
    }

    public void agregarCantidad(int cantidad) {
        // Aumentamos la nueva cantidad a lo ocupado en la jarra
        this.capacidadOcupada = this.capacidadOcupada + cantidad;
        // Si lo ocupado supera la capacidad máxima,
        if (this.capacidadOcupada > this.capacidadMaxima * 1000) {
            // Lo ocupado es lo máximo (lo demás se pierde)
            this.capacidadOcupada = this.capacidadMaxima * 1000;
        }
    }

    public void describir() {
        System.out.println("+----------------------+");
        System.out.printf("| %4d ml / %2d L (%02d%%) |\n",
                this.capacidadOcupada,
                this.capacidadMaxima,
                this.calcularPorcentajeOcupado()
        );
        System.out.println("+----------------------+");
    }

    public void capturar(Scanner scanner) {
        System.out.println("datos de la jarra: ");
        System.out.println("capacidad Máxima: (Litros) ");
        this.capacidadMaxima = scanner.nextInt();
        scanner.nextLine();
        System.out.println("capacidad ocupada: (ml) ");
        this.capacidadOcupada = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Jarra capturada");
        this.describir();
    }
    
}
