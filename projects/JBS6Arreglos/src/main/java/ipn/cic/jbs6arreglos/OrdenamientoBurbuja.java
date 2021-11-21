package ipn.cic.jbs6arreglos;

public class OrdenamientoBurbuja {

    static int[] sort(int[] numeros, boolean asc) {
        // for (<TIPO> <elemento> : <secuencia>) { <BLOQUE> }
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("--------------------");

        for (int i = 0; i < numeros.length; i++) { // Repite N-veces

            // Captura la burbuja
            int capturadoIndex = 0;
            int capturadoValor = numeros[capturadoIndex];

            // Captura las siguientes burbujas
            for (int j = i + 1; j < numeros.length; j++) {

                // Captura la siguiente burbuja
                int siguienteIndex = capturadoIndex + 1;
                int siguienteValor = numeros[siguienteIndex];

                if (asc) {
                    // Compara el tamaño de las burbujas (sus valores)
                    if (capturadoValor > siguienteValor) {
                        // Intercambia las burbujas
                        numeros[siguienteIndex] = capturadoValor;
                        numeros[capturadoIndex] = siguienteValor;
                    }
                } else {
                    if (capturadoValor < siguienteValor) {
                        // Intercambia las burbujas
                        numeros[siguienteIndex] = capturadoValor;
                        numeros[capturadoIndex] = siguienteValor;
                    }
                }

                // Avanza la burbuja
                capturadoIndex++;
                capturadoValor = numeros[capturadoIndex];

            }
        }

        return numeros;
    }

    public static void main(String[] args) {

        int[] numeros = {8, 4, 5, 2, 1, 6, 7, 3}; // 2da Forma - Arreglo Literal

        // for (<TIPO> <elemento> : <secuencia>) { <BLOQUE> }
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("--------------------");

        for (int i = 0; i < numeros.length; i++) { // Repite N-veces

            // Captura la burbuja
            int capturadoIndex = 0;
            int capturadoValor = numeros[capturadoIndex];

            // Captura las siguientes burbujas
            for (int j = i + 1; j < numeros.length; j++) {

                // Captura la siguiente burbuja
                int siguienteIndex = capturadoIndex + 1;
                int siguienteValor = numeros[siguienteIndex];

                // Compara el tamaño de las burbujas (sus valores)
                if (capturadoValor > siguienteValor) {
                    // Intercambia las burbujas
                    numeros[siguienteIndex] = capturadoValor;
                    numeros[capturadoIndex] = siguienteValor;
                }

                // Avanza la burbuja
                capturadoIndex++;
                capturadoValor = numeros[capturadoIndex];

            }
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("------------------------------");

        int[] ordenados = OrdenamientoBurbuja.sort(numeros, false);

        for (int numero : ordenados) {
            System.out.println(numero);
        }

    }

}
