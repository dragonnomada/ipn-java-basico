package ipn.cic.maquinadispensadoraqr;

import java.util.ArrayList;

public class Maquina {
    
    private final String id;
    private final ArrayList<Producto> productos;
    private final QR qr;
    private final DisplayPago displayPago;
    private final ImpresoraTicket impresoraTicket;
    
    private Producto productoSeleccionado;
    
    public Maquina(String id) {
        this.id = id;
        this.productos = new ArrayList<>();
        this.qr = new QR();
        this.displayPago = new DisplayPago();
        this.impresoraTicket = new ImpresoraTicket();
        
        this.productos.add(new Producto("A", 10));
        this.productos.add(new Producto("B", 15));
        this.productos.add(new Producto("C", 20));this.productos.add(new Producto("B", 15));
        this.productos.add(new Producto("D", 10));
        this.productos.add(new Producto("E", 5));
        this.productos.add(new Producto("F", 12));
    }
    
    public Producto seleccionarProducto(String codigo) {
        // Recorrer cada producto de la lista this.productos
        // Y encontrar el producto con el mismo código
        // O devolver null si no se encuentra el producto
        for (Producto producto : this.productos) {
            if (producto.getCodigo().equals(codigo)) {
                this.productoSeleccionado = producto;
                this.mostrarProducto(producto);
                this.generarPago(producto);
                return producto;
            }
        }
        
        return null;
    }
    
    public boolean mostrarProducto(Producto producto) {
        // TODO: Mostrar el producto en el display del QR y el display de pago
        System.out.println(producto);
        
        return true;
    }
    
    public boolean generarPago(Producto producto) {
        // 1. Actualizar el display de pago
        this.displayPago.generandoPago(this);
        // 2. Generar un QR de pago
        this.qr.fromProductoPago(this, producto);
        // 3. Actualizar el display de pago
        this.displayPago.esperandoPago(this);
        
        return true;
    }
    
    public boolean despacharProducto(Ticket ticket) {
        System.out.println(String.format("#%s Despachando producto: %s", 
                this.getId(), ticket.getCodigoProducto()));
        
        this.imprimir(ticket);
        
        return true;
    }
    
    public boolean imprimir(Ticket ticket) {
        this.impresoraTicket.imprimir(this, ticket);
        
        this.qr.reiniciar();
        this.displayPago.reiniciar();
        
        return true;
    }

    public String getId() {
        return id;
    }
    
    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }
    
}
