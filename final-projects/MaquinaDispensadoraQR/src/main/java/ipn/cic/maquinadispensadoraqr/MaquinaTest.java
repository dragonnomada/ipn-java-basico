package ipn.cic.maquinadispensadoraqr;

public class MaquinaTest {

    public static void main(String[] args) {
        
        Maquina maquina = new Maquina("mark1");
        
        maquina.seleccionarProducto("A");
        maquina.seleccionarProducto("B");
        maquina.seleccionarProducto("F");
        
    }
    
}
