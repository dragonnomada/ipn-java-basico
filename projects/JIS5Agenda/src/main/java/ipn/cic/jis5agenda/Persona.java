package ipn.cic.jis5agenda;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private String aPaterno;
    private String aMaterno;
    
    Direccion direccion; // null
    Telefono telefono; // null
    
    public void describir() {
        System.out.printf("Persona: %s %s, %s\n", 
                this.aPaterno, this.aMaterno, this.nombre);
        if (this.direccion != null) {
            this.direccion.describir();
        }
        if (this.telefono != null) {
            this.telefono.describir();
        }
    }
    
    public void capturar(Scanner scanner) {
        System.out.println("Capturar Persona:");
        
        System.out.println("Apellido Paterno");
        this.aPaterno = scanner.nextLine();
        System.out.println("Apellido Materno");
        this.aMaterno = scanner.nextLine();
        System.out.println("Nombre");
        this.nombre = scanner.nextLine();
        
        this.direccion = new Direccion();
        
        this.direccion.capturar(scanner);
        
        this.telefono = new Telefono();
        
        this.telefono.capturar(scanner);
    }
}
