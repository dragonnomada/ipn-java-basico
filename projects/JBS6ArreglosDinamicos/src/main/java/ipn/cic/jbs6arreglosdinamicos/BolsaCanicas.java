package ipn.cic.jbs6arreglosdinamicos;

import java.util.ArrayList;

public class BolsaCanicas {

    static int contarCanicasPorColor(ArrayList<Canica> canicas, COLORES color) {
        int conteo = 0;
        for (Canica canica : canicas) {
            if (canica.color.equals(color)) {
                conteo++;
            }
        }
        return conteo;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Canica> canicas = new ArrayList<Canica>();
        
        canicas.add(new Canica(TAMAÑO_CANICA.JUMBO));
        canicas.add(new Canica(TAMAÑO_CANICA.MEDIANA, COLORES.ROJO));
        canicas.add(new Canica());
        
        for (Canica canica : canicas) {
            System.out.println(canica);
        }
        
        System.out.printf("Hay %d canicas blancas", 
                BolsaCanicas.contarCanicasPorColor(canicas, COLORES.BLANCO));
        
    }
    
}
