package ipn.cic.maquinadispensadoraqr;

public class QR {
    
    private String cadena;
    private QRTipo tipo;
    
    public QR() {
        this.cadena = "https://miempresa.com/maquina/logo";
        this.tipo = QRTipo.LOGO;
    }
    
    public String fromProductoPago(Maquina maquina, Producto producto) {
        
    }
    
    public boolean showQR(Maquina maquina) {
        
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
    
}
