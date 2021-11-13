package ipn.cic.jis5agenda;

import java.util.Scanner;

enum TipoDireccion {
    
    CASA,
    OFICINA,
    TIENDA,
    DESCONOCIDO;
    
    public static TipoDireccion getByName(String name) {
        switch(name.toLowerCase()) {
            case "casa":
                return TipoDireccion.CASA;
            case "oficina":
                return TipoDireccion.OFICINA;
            case "tienda":
                return TipoDireccion.TIENDA;
            default:
                return TipoDireccion.DESCONOCIDO;
        }
    }
    
}

public class Direccion {

    TipoDireccion tipo;
    String calle;
    String num_ext;
    String num_int;
    String colonia;
    String ciudad;
    String estado;
    String pais;
    String codigo_postal;
    
    public void describir() {
        System.out.printf("Dirección [%s]: %s #%s (int %s), Col. %s\n", 
                this.tipo, this.calle, this.num_ext, this.num_int, this.colonia);
        System.out.printf("Ciudad: %s, %s (%s), C.P. %s\n", 
                this.ciudad, this.estado, this.pais, this.codigo_postal);
    }
    
    public void capturar(Scanner scanner) {        
        System.out.println("Capturar Dirección:");
        
        System.out.println("Tipo de Dirección:");
        System.out.println("Casa | Oficina | Tienda");
        String tipoDireccion = scanner.nextLine();
        this.tipo = TipoDireccion.getByName(tipoDireccion);
        
        System.out.println("Calle:");
        this.calle = scanner.nextLine();
        System.out.println("Número Exterior:");
        this.num_ext = scanner.nextLine();
        System.out.println("Número Interior:");
        this.num_int = scanner.nextLine();
        System.out.println("Colonia:");
        this.colonia = scanner.nextLine();
        System.out.println("Ciudad:");
        this.ciudad = scanner.nextLine();
        System.out.println("Estado:");
        this.estado = scanner.nextLine();
        System.out.println("País:");
        this.pais = scanner.nextLine();
        System.out.println("Código Postal:");
        this.codigo_postal = scanner.nextLine();
        
    }
    
}
