package ipn.cic.maquinadispensadoraqr;

import java.util.ArrayList;

public class ImpresoraTicket {

    private ArrayList<Ticket> tickets;
    
    public ImpresoraTicket() {
        this.tickets = new ArrayList<>();
    }
    
    public boolean imprimir(Maquina maquina, Ticket ticket) {
        // TODO: Mandar a imprimir el ticket en una impresora real
        System.out.println(ticket);
        return true;
    }
    
}
