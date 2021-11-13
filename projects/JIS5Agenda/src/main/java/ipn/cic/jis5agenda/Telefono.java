package ipn.cic.jis5agenda;

import java.util.Scanner;

enum TipoTelefono {
    CASA,
    CELULAR,
    TRABAJO,
    OFICINA,
    DESCONOCIDO;
    
    public static TipoTelefono getByName(String name) {
        switch (name.toLowerCase()) {
            case "casa":
                return TipoTelefono.CASA;
            case "cel":
            case "celular":
                return TipoTelefono.CELULAR;
            case "trabajo":
                return TipoTelefono.TRABAJO;
            case "oficina":
                return TipoTelefono.OFICINA;
            default:
                return TipoTelefono.DESCONOCIDO;
        }
    }
}

public class Telefono {
    
    TipoTelefono tipo;
    String numero;
    
    public void describir() {
        System.out.printf("Tel: [%s] %s\n", this.tipo, this.numero);
    }
    
    public void capturar(Scanner scanner) {
        System.out.println("Capturar Teléfono:");
        
        System.out.println("Tipo de Teléfono:");
        System.out.println("Casa | Celular | Trabajo | Oficina");
        String tipoTelefono = scanner.nextLine();
        
        this.tipo = TipoTelefono.getByName(tipoTelefono);
        
        System.out.println("Número de Teléfono:");
        this.numero = scanner.nextLine();
    }
    
}
