package com.mycompany.sesion3;

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
        
    
}
