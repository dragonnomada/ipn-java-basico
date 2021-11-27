package ipn.cic.maquinadispensadoraqr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class DisplayPago {

    private EstadoPago estado;
    private Ticket ticket;

    public DisplayPago() {
        this.estado = EstadoPago.NO_DEFINIDO;
        this.ticket = null;
    }

    public void reiniciar() {
        this.estado = EstadoPago.NO_DEFINIDO;
        this.ticket = null;
    }

    public void generandoPago(Maquina maquina) {
        // TODO: Mostrar el mensaje en display real
        // * Guardar en base datos una notificación para trazabilidad de las operaciones
        System.out.println(String.format("#%s Generando pago...", maquina.getId()));
    }

    public void esperandoPago(Maquina maquina) {
        // TODO: Mostrar el mensaje en display real
        // * Guardar en base datos una notificación para trazabilidad de las operaciones
        System.out.println(String.format("#%s Esperando pago...", maquina.getId()));

        // TODO: Deberíamos mandar llamar algún servicio que realice el pago
        // * Por ejemplo, llamar a Paypal o nuestro servidor para que haga el pago en la máquina
        /*ServicioPago.esperarPago(maquina, new PagoAction() {
            public void pagoAprobado(Ticket ticket) {
                // TODO: Hacer lo necesario con el ticket.
                maquina.despacharProducto(ticket);
            }
            public void pagoRechazo(PagoError error) {
                // TODO: Hacer lo necesario con el ticket.
                maquina.error(error);
            }
        });*/
        // Simulamos que el usuario tarda 10 segundos (10,000 ms) en pagar
        /*Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ticket ticket = new Ticket(
                        maquina.getId(), 
                        maquina.getProductoSeleccionado().getCodigo(),
                        String.format("$%2.2f", maquina.getProductoSeleccionado().getPrecio()),
                        "ABC12345678",
                        new Date().toString()
                );
                
                recibirPago(maquina, ticket);
            }
        });
        
        timer.start();*/
        Ticket ticket = new Ticket(
                maquina.getId(),
                maquina.getProductoSeleccionado().getCodigo(),
                String.format("$%2.2f", maquina.getProductoSeleccionado().getPrecio()),
                "ABC12345678",
                new Date().toString()
        );

        recibirPago(maquina, ticket);
    }

    public void recibirPago(Maquina maquina, Ticket ticket) {
        this.estado = EstadoPago.PAGADO;

        System.out.println(String.format("#%s Pago Recibido", maquina.getId()));

        maquina.despacharProducto(ticket);
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public Ticket getTicket() {
        return ticket;
    }

}
