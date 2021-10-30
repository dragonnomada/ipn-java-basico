package com.mycompany.s3tiendafrutas;

import java.util.Scanner;

/*
+========================================+
| Fruta                                  |
+----------------------------------------+
| - nombre : String                      |
| - precio : double                      |
| - cantidad : double                    |
+----------------------------------------+
| + getNombre() : String                 |
| + setNombre(nombre)                    |
| + getPrecio() : double                 |
| + setPrecio(precio)                    |
| + getCantidad() : double               |
+----------------------------------------+
| + addCantidad(peso)                    |
| + canRemoveCantidad(peso) : boolean    |
| + removeCantidad(peso) : double        |
+----------------------------------------+
| + capturar()                           |
+----------------------------------------+
| + describir()                          |
+========================================+
*/

public class Fruta {
    
    private String nombre;
    private double precio;
    private double cantidad;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

       
    public void addCantidad(double peso) {
        this.cantidad += peso; // a += b | a = a + b
    }
    
    public boolean canRemoveCantidad(double peso) {
        return this.cantidad >= peso;
    }
    
    public double removeCantidad(double peso) {
        double diferencia = this.cantidad - peso;
        
        this.cantidad -= peso; // a -= b | a = a - b
        
        return diferencia;
    }
    
    public void capturar(Scanner scanner) {        
        System.out.println("Datos de la fruta:");
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        this.setNombre(nombre);
        System.out.println("Precio (x Kg):");
        double precio = scanner.nextDouble(); scanner.nextLine();
        this.setPrecio(precio);
        System.out.println("Cantidad (Kgs):");
        double peso = scanner.nextDouble(); scanner.nextLine();
        this.removeCantidad(this.getCantidad());
        this.addCantidad(peso);
    }
    
    public void describir() {
        System.out.printf(
            "%20s | $%.2f | %.2f Kg\n",
            this.nombre,
            this.precio,
            this.cantidad
        );
    }
}
