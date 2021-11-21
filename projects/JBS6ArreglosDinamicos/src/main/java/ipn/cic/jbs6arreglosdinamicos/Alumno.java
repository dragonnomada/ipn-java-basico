package ipn.cic.jbs6arreglosdinamicos;

import java.util.ArrayList;

public class Alumno {

    ArrayList<Calificacion> calificaciones = new ArrayList<>();
    
    boolean agregarNota(Calificacion calificacion) {
        
        for (Calificacion otra : this.calificaciones) {
            if (otra.parcial.equals(calificacion.parcial) && 
                    otra.materia.equals(calificacion.materia)) {
                return false;
            }
        }
        
        this.calificaciones.add(calificacion);
        
        return true;
        
    }
    
    public String toString() {
        String text = "";
        
        for (Calificacion calificacion : this.calificaciones) {
            text += calificacion.toString() + "\n";
        }
        
        return text;
    }
    
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno();
        
        a1.agregarNota(new Calificacion(PARCIAL.PARCIAL_1, MATERIA.MATEMATICAS, 7));
        a1.agregarNota(new Calificacion(PARCIAL.PARCIAL_2, MATERIA.MATEMATICAS, 8));
        a1.agregarNota(new Calificacion(PARCIAL.PARCIAL_1, MATERIA.MATEMATICAS, 9));
        a1.agregarNota(new Calificacion(PARCIAL.EXAMEN_FINAL, MATERIA.MATEMATICAS, 6));
        
        System.out.println(a1);
        
    }
    
}
