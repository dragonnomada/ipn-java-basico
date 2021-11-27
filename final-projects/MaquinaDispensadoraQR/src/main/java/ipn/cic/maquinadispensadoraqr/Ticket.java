package ipn.cic.maquinadispensadoraqr;

public class Ticket {

    private final String idMaquina;
    private final String codigoProducto;
    private final String precioProducto;
    private final String cadenaPago;
    private final String fechaPago;
    
    public Ticket(
            String idMaquina, 
            String codigoProducto, String precioProducto, 
            String cadenaPago, String fechaPago) {
        this.idMaquina = idMaquina;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
        this.cadenaPago = cadenaPago;
        this.fechaPago = fechaPago;
    }
    
    @Override
    public String toString() {
        return String.format("#%s [%s] %s | %s | %s",
                this.idMaquina,
                this.codigoProducto,
                this.precioProducto,
                this.fechaPago,
                this.cadenaPago);
    }

    public String getIdMaquina() {
        return idMaquina;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public String getCadenaPago() {
        return cadenaPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }
    
}
