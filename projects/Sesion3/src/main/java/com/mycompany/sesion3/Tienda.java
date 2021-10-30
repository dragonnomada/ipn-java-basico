package com.mycompany.sesion3;

public class Tienda {

    public static void main(String[] args) {
        
        // Nuevo objeto (instancia de la clase)
        // <Clase> <objeto> = new <Clase>();
        // <Clase>() -> Constructor
        Producto p1 = new Producto();
        
        p1.sku = "072134875";
        p1.nombre = "Coca Cola 600ml";
        
        p1.describir();
        
        // Cada instancia tiene su propia memoria
        // Es decir, sus propios estados/atributos/propiedades/valores
        // Pero con el mismo diseño (de la clase)
        Producto p2 = new Producto();
        
        p2.sku = "091234532";
        p2.nombre = "Gansito Recuerdame";
        p2.precio = 10.5;
        
        p2.describir(); // Ejecutar las acciones/funcionalidades del objeto
        
        Persona p = new Persona();
        
        p.capturaPersona();
        
        p.describir();
        
    }
    
}
