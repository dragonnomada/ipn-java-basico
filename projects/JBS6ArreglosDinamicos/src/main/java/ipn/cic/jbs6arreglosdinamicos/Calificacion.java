package ipn.cic.jbs6arreglosdinamicos;

enum PARCIAL {
    PARCIAL_1,
    PARCIAL_2,
    EXAMEN_FINAL;
}

enum MATERIA {
    MATEMATICAS,
    FISICA,
    QUIMICA,
    HISTORIA,
    GEOGRAFIA;
}

public class Calificacion {

    PARCIAL parcial;
    MATERIA materia;
    double nota;
    
    Calificacion(PARCIAL parcial, MATERIA materia, double nota) {
        this.parcial = parcial;
        this.materia = materia;
        this.nota = nota;
    }
    
    public String toString() {
        return String.format("%s | %s | NOTA: %.2f", this.parcial, this.materia, this.nota);
    }
    
}
