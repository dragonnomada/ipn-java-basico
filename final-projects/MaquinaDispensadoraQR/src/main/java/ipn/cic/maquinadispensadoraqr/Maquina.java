package ipn.cic.maquinadispensadoraqr;

import java.util.ArrayList;

public class Maquina {
    
    private String id;
    private ArrayList<Producto> productos;
    private QR qr;
    private DisplayPago displayPago;
    private ImpresoraTicket impresoraTicket;
    
    public Maquina(String id) {
        this.id = id;
        this.productos = new ArrayList<>();
        this.qr = new QR();
        this.displayPago = new DisplayPago();
        this.impresoraTicket = new ImpresoraTicket();
        
        this.productos.add(new Producto("A", 10));
        this.productos.add(new Producto("B", 15));
        this.productos.add(new Producto("C", 20));
        this.productos.add(new Producto("D", 10));
        this.productos.add(new Producto("E", 5));
        this.productos.add(new Producto("F", 12));
    }
    
    public Producto seleccionarProducto(String codigo) {
        
    }
    
    public boolean mostrarProducto(Producto producto) {
        
    }
    
    public boolean generarPago(Producto producto) {
        
    }
    
    public boolean despacharProducto(Ticket ticket) {
        
    }
    
    public boolean imprimir(Ticket ticket) {
        
    }
}
