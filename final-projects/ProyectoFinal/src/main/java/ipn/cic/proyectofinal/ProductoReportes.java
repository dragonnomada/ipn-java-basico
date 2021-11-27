package ipn.cic.proyectofinal;

import java.util.ArrayList;

public class ProductoReportes {

    ArrayList<Producto> productos;
    ProductoFiltros filtro;
    
    public ProductoReportes(ArrayList<Producto> productos) {
        this.productos = productos;
        
        this.filtro = new ProductoFiltros(productos);
    }
    
    // PROYECTO FINAL: COMPLETA ESTA FUNCIÓN
    public double getMinimoPrecio() {
        double min = productos.get(0).precio;
        
        // TODO: Calcular el mínimo precio de todos los productos
        for (Producto producto : this.productos) {
            if (producto.precio < min) {
                min = producto.precio;
            }
        }
        
        return min;
    }
    
    // PROYECTO FINAL: COMPLETA ESTA FUNCIÓN
    public double getMaximoPrecio() {
        double max = productos.get(0).precio;
        
        // TODO: Calcular el máximo precio de todos los productos
        for (Producto producto : this.productos) {
            if (producto.precio > max) {
                max = producto.precio;
            }
        }
        
        return max;
    }
    
    public void generarReportePrecios() {
        // 1. Determina el precio mínimo de los productos
        double minimoPrecio = this.getMinimoPrecio();
        // 2. Determina el precio máximo de los productos
        double maximoPrecio = this.getMaximoPrecio();
        // 3. Divide en 10 partes del precio mínimo y máximo
        for (int i = 1; i < 10; i++) {
            double precioMin = minimoPrecio + (i - 1) * (maximoPrecio - minimoPrecio) / 9.0;
            double precioMax = minimoPrecio + i * (maximoPrecio - minimoPrecio) / 9.0;
            
            ArrayList<Producto> productosFiltrados = this.filtro.getProductosInPrecio(precioMin, precioMax);
            
            double total = 0;
            
            for (Producto producto : productosFiltrados) {
                total = total + producto.precio;
            }
            
            System.out.printf("Entre $%.2f y $%.2f hay %d productos con un total de $%.2f\n", 
                    precioMin, precioMax, productosFiltrados.size(), total);
        }
        
    }
    
}
