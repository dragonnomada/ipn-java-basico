package com.mycompany.sesion3;

import java.util.Scanner;

/**
 * Esta clase para retener los datos de una persona...
 * @author IPN CIC
 */
public class Persona {

    // ATRIBUTOS | ESTADOS | PROPIEDADES
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private float peso;

    // MÉTODOS DE ACCESO | CAMPOS | PROPIEDADES DE ACCESO
    
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
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        if (peso <= 0) return;
        
        this.peso = peso;
    }
    
    // GETTER | ACCESOR | LECTURA DEL ESTADO
    public int getEdad() {
        return edad;
    }
    
    // SETTER | AJUSTADOR | ESCRITURA DEL ESTADO
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad < this.edad) return;
        if (nuevaEdad > 150) return;
        
        this.edad = nuevaEdad;
    }
    
    // MÉTODOS | ACCIONES | FUNCIONALIDADES
        
    public void capturaPersona() {
        // EJERCICIO: 15 min (12:08 -> 12:23 CDMX)
        
        // 1. Crea un escáner de la clase java.util.Scanner
        Scanner scanner = new Scanner(System.in);
        
        // 2. Muestra el mensaje "Dame el nombre"
        System.out.println("Dame el nombre");
        // 3. Captura el nombre = scanner.nextLine()
        String nombre = scanner.nextLine();
        // 4. Llama al médodo ajustador setNombre(nombre)
        this.setNombre(nombre);
        
        // REPETIR (2.), (3.), (4.) para cada atributo
        // tomando en cuante nextInt() | nextFloat() | nextLine()
        
        // 2. Muestra el mensaje "Dame el nombre"
        System.out.println("Dame el apellido parteno");
        // 3. Captura el nombre = scanner.nextLine()
        String apellidoPaterno = scanner.nextLine();
        // 4. Llama al médodo ajustador setNombre(nombre)
        this.setApellidoPaterno(apellidoPaterno);
        
        // 2. Muestra el mensaje "Dame el nombre"
        System.out.println("Dame el apellido marteno");
        // 3. Captura el nombre = scanner.nextLine()
        String apellidoMaterno = scanner.nextLine();
        // 4. Llama al médodo ajustador setNombre(nombre)
        this.setApellidoMaterno(apellidoMaterno);
        
        // 2. Muestra el mensaje "Dame el nombre"
        System.out.println("Dame la edad");
        // 3. Captura el nombre = scanner.nextLine()
        int edad = scanner.nextInt(); scanner.nextLine();
        // 4. Llama al médodo ajustador setNombre(nombre)
        this.setEdad(edad);
        
        // 2. Muestra el mensaje "Dame el nombre"
        System.out.println("Dame el peso");
        // 3. Captura el nombre = scanner.nextLine()
        float peso = scanner.nextFloat(); scanner.nextLine();
        // 4. Llama al médodo ajustador setNombre(nombre)
        this.setPeso(peso);
                
        // X. Cierra el escáner
        scanner.close();
    }
    
    public void describir() {
        System.out.printf(
            "%s %s, %s (%d años | %.2f kg)", 
            this.apellidoPaterno,
            this.apellidoMaterno,
            this.nombre,
            this.edad,
            this.peso
        );
    }
    
}
