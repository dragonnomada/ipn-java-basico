package ipn.cic.maquinadispensadoraqr;

public class DisplayPago {

    private EstadoPago estado;
    private Ticket ticket;
    
    public DisplayPago() {
        this.estado = EstadoPago.NO_DEFINIDO;
        this.ticket = null;
    }
    
    public void generandoPago(Maquina maquina) {
        
    }
    
    public void esperandoPago(Maquina maquina) {
        
    }
    
    public void recibirPago(Maquina maquina, Ticket ticket) {
        
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public Ticket getTicket() {
        return ticket;
    }
    
}
