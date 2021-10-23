class TipoDatos2 {

    public static void main(String[] args) {

        String nombre = "Ana Ming";
        
        boolean esCasada = true; // false

        byte b = 65; // 01000001

        double distancia = 1.7895e12; // 1789500000000

        char c = '\t'; // 'A', '~', '\b'

        System.out.printf("Nombre: %s \n", nombre);

        System.out.printf("Cadada: %B \n", esCasada);
        
        System.out.printf("Distancia: %.5f | ", distancia);

        System.out.printf("Distancia: %.5e \n", distancia);
        
        System.out.printf("Byte: %X | %o \n", b, b);

        System.out.printf("Caracter: '%c' \n", c);

    }

}