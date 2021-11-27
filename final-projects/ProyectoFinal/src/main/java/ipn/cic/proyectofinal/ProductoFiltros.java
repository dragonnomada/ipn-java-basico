package ipn.cic.proyectofinal;

import java.util.ArrayList;

public class ProductoFiltros {

    ArrayList<Producto> productos;
    
    public ProductoFiltros(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public Producto getProductoByCodigo(String codigo) {
        for (Producto producto : this.productos) {
            if (producto.codigo.equals(codigo)) {
                return producto;
            }
        }
        return null;
    }
    
    public ArrayList<Producto> getProductosInPrecio(double precioMin, double precioMax) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        
        // Recorrer cada producto de los productos
        // Determinar si el producto está en el rango de precios
        // Agregar el producto a los productos filtrados
        
        return productosFiltrados;
    }
    
    public ArrayList<Producto> getProductosInExistencias(int existenciaMin, int existenciaMax) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        
        // Recorrer cada producto de los productos
        // Determinar si el producto está en el rango de existencias
        // Agregar el producto a los productos filtrados
        
        return productosFiltrados;
    }
    
    public ArrayList<Producto> getProductosActualizadosHoy() {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        
        // Recorrer cada producto de los productos
        // Determinar si el producto tuvo una última actualización el día de hoy
        // Agregar el producto a los productos filtrados
        
        return productosFiltrados;
    }
    
    public ArrayList<Producto> getProductosByNombreOrDescripcion(String search) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        
        // Recorrer cada producto de los productos
        // Determinar si el producto tiene parte de la búsqueda en el nombre o en la descripción
        // Agregar el producto a los productos filtrados
        
        return productosFiltrados;
    }
    
}
