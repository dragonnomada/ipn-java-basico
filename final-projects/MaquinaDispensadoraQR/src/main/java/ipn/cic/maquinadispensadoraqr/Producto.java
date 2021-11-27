package ipn.cic.maquinadispensadoraqr;

public class Producto {
    
    private String codigo;
    private double precio;

    public Producto(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return String.format("[%s] $02.2f", 
                this.codigo, 
                this.precio);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
