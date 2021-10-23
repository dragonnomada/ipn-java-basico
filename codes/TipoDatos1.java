class TipoDatos1 {

    public static void main(String[] args) {

        int edad = 65;

        float peso = 78.3f;

        // printf(<formato : String>, <args ...>)
        // %d - int
        // %f - float | double (%<N>.<M>f | %.2f)
        // %e - float | double (%<N>.<M>e | %.2e) / Notación Científica 10e23
        // %c - char
        // %b - boolean (%B)
        // %x - byte (%<N>X)
        // %s - String
        System.out.printf("La edad es %d años y pesa %.2f kgs.", edad, peso);

    }

}