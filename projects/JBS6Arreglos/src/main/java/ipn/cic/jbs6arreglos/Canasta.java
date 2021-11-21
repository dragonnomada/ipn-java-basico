package ipn.cic.jbs6arreglos;

// Cuándo creamos un arreglo, este fija las direcciones de memoria
// Entonces, <arreglo>[<índice>] nos referimos a la dirección de memoria
// asociada a ese índice. Sin embargo, a diferencia de C/C++ no podemos
// manipular las direcciones de memoria, pero si sus valores.
// Ejemplo:
// valor = <arreglo>[<índice>]         // Recupera el valor de la dirección
// <arreglo>[<índice>] = nuevoValor    // Actualiza el valor en la dirección

// En el caso de Arreglos de Objetos nosotros podemos asignar
// el objeto, reasignarlo, e incluso modificarlo.
// Esto se conoce como abstracción de arreglo-objeto.

public class Canasta {

    public static void main(String[] args) {
        
        Fruta[] frutas = new Fruta[4];
        
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
        }
        
        for (int i = 0; i < frutas.length; i++) {
            frutas[i] = new Fruta(); // Construir la fruta (nombre, precio, ...)
        }
        
        System.out.println("---------------");
        
        // Recupera cada Objeto (instancia new Fruta()) del arreglo de frutas
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
            System.out.println(fruta.nombre);
        }
        
        System.out.println("---------------");
        
        frutas[2].nombre = "MANZANA"; // frutas[2] -> Instancia @7852e922
        
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
            System.out.println(fruta.nombre);
        }
        
        System.out.println("---------------");
        
    }
    
}
