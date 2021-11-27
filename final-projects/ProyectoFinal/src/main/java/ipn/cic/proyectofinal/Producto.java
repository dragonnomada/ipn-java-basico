package ipn.cic.proyectofinal;

import java.util.Date;

public class Producto {
    
    public String codigo;
    public String nombre;
    public String descripcion;
    public double precio;
    public int existencias;
    public Date ultimaActualizacion;
    
    public Producto(double precio) {
        this.precio = precio;
    }
    
}
