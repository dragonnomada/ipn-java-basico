package ipn.cic.jbs6arreglos;

public class Introduccion {

    public static void main(String[] args) {
        
        // Arreglo <=> Un multiplicador de variables
        // Variable cabecera con subvariables indexadas
        // <TIPO>[] <NOMBRE>;
        int[] numeros;
        
        // 1a Forma - Arreglo Indeterminado
        // <TIPO>[] <NOMBRE>;
        
        // 2da Forma - Arreglo Literal
        // <TIPO>[] <NOMBRE> = { <VALOR 1>, <VALOR 2>, ..., <VALOR N> };
        
        // 3ra Forma - Arreglo Fijo
        // <TIPO>[] <NOMBRE> = new <TIPO>[<TAMAÑO>];
        
        // 1ra Forma - Arreglo Indeterminado
        numeros = new int[4]; // Se determina que números tendrá 4 valores
        numeros[0] = 8; // Asignamos el valor asociado al índice 0
        numeros[1] = 4;
        numeros[2] = 6;
        numeros[3] = 5;
        // numeros[4] = 7; // ERROR: Fuera del rango de índices [0, ..., 3] (4)
        
        System.out.println(numeros.length);
        
        // 2da Forma - Arreglo Literal
        String[] palabras = { "hola", "mundo", "mundial" };
        
        System.out.println(palabras[0]); // "hola"
        System.out.println(palabras[1]); // "mundo"
        System.out.println(palabras[2]); // "mundial"
        // System.out.println(palabras[3]); // ERROR: Fuera del rango [0, ..., 2] (3)
        
        // 3ra Forma - Arreglo Fijo
        double[] pesos = new double[100];
        
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = 0.0; // inicializa el índice i (i-ésimo)
            // i está en rango de [0, ..., 99] (100)
        } 
        
        pesos[60] = 48.87; // índice 60 si existe [0, ..., 99]
        
        Fruta[] frutas = new Fruta[10]; // Por defecto cada índice vale null
        
        System.out.println(frutas[0]);
        
        frutas[0] = new Fruta();
        
        System.out.println(frutas[0]);
        
    }
    
}
