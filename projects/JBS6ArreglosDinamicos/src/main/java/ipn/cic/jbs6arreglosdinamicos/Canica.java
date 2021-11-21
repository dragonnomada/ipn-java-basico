package ipn.cic.jbs6arreglosdinamicos;

enum COLORES {
    ROJO,
    AZUL,
    VERDE,
    BLANCO;
}

enum TAMAÑO_CANICA {
    CHICA,
    MEDIANA,
    GRANDE,
    GIGANTE,
    JUMBO;
}

public class Canica {

    TAMAÑO_CANICA tamaño;
    COLORES color;
    
    Canica() {
        this.tamaño = TAMAÑO_CANICA.CHICA;
        this.color = COLORES.BLANCO;
    }
    
    Canica(TAMAÑO_CANICA tamaño) {
        this.tamaño = tamaño;
        this.color = COLORES.BLANCO;
    }
    
    Canica(TAMAÑO_CANICA tamaño, COLORES color) {
        this.tamaño = tamaño;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return String.format("%s | %s", this.tamaño, this.color);
    }
    
}
