package ipn.cic.proyectofinal;

import java.util.ArrayList;

public class ReporteTest {
    
    // PROYECTO FINAL: EJECUTA Y ENVIA TUS RESULTADOS A dragonnomada123@gmail.com
    public static void main(String[] args) {
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(new Producto(23.5));
        productos.add(new Producto(17.99));
        productos.add(new Producto(45.88));
        productos.add(new Producto(215.93));
        productos.add(new Producto(470.56));
        productos.add(new Producto(230.88));
        productos.add(new Producto(75.16));
        productos.add(new Producto(99.99));
        
        ProductoReportes reportes = new ProductoReportes(productos);
        
        reportes.generarReportePrecios();
        
    }
    
}
