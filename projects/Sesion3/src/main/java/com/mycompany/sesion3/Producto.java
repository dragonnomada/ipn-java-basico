package com.mycompany.sesion3;

// CLASE -> MODELO (ESTADOS, ACCIONES) -> OBJETO
public class Producto {
            
    // ATRIBUTOS -> ESTADOS | PROPIEDADES
    String sku;
    String nombre;
    String descripcion;
    int existencias;
    double precio;
    float alto;
    float ancho;
    float largo;
    boolean activo;
    
    // MÉTODOS -> ACCIONES | FUNCIONALIDADES
    void describir() {
        System.out.printf(
            "Producto [%s] %-20s ($%.2f | %d) <%.2f x %.2f x %.2f>\n",
            this.sku, this.nombre, this.precio, this.existencias,
            this.ancho, this.alto, this.largo
        );
    }
    
}
