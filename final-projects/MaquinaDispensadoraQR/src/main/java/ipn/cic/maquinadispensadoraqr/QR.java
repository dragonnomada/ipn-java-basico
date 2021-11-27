package ipn.cic.maquinadispensadoraqr;

public class QR {
    
    private String cadena;
    private QRTipo tipo;
    
    public QR() {
        this.cadena = "https://miempresa.com/maquina/logo";
        this.tipo = QRTipo.LOGO;
    }
    
    public void reiniciar() {
        this.cadena = "https://miempresa.com/maquina/logo";
        this.tipo = QRTipo.LOGO;
    }
    
    public String fromProductoPago(Maquina maquina, Producto producto) {
        this.cadena = String.format("https://miempresa.com/maquina/%s/producto/%s/pago",
                maquina.getId(), producto.getCodigo());
        this.tipo = QRTipo.PAGO;
        
        this.showQR(maquina);
        
        return this.cadena;
    }
    
    public boolean showQR(Maquina maquina) {
        // TODO: Mostrar el QR en el display de la máquina
        // * Deberíamos convertir la cadena del QR en imagen
        System.out.println(String.format("#%s %s", maquina.getId(), this.toString()));
        return true;
    }
    
    @Override
    public String toString() {
        return String.format("[%s] %s", this.tipo, this.cadena);
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public QRTipo getTipo() {
        return tipo;
    }

    public void setTipo(QRTipo tipo) {
        this.tipo = tipo;
    }
    
}
