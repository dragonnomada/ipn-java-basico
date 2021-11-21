package ipn.cic.jbs6arreglos;

public class Cesar {

    public static void main(String[] args) {

        byte[] archivo = {
            (byte) 1, (byte) 5, (byte) 27, (byte) 84,
            (byte) 122, (byte) 255, (byte) 112, (byte) 98,
            (byte) 89, (byte) 194, (byte) 0, (byte) 76,
            (byte) 67, (byte) 206, (byte) 187, (byte) 223,
            (byte) 54, (byte) 175, (byte) 145, (byte) 176,
            (byte) 88, (byte) 176, (byte) 0, (byte) 91,
            (byte) 23, (byte) 53, (byte) 17, (byte) 31,};

        // p0 - 0 1 2
        // p1 - 3 4 5
        // p2 - 6 7 8
        // p3 - 9 10 11
        // pk - 3*k 3*k+1 3*k+2
        // T - Math.ceil(N / 3)
        for (byte b : archivo) {
            System.out.printf("%02x ", b);
        }

        System.out.println();
        System.out.println("------------------------");

        // Partir un arreglo en chunks (trozos)
        int T = (int) Math.ceil(archivo.length / 3.0);

        for (int t = 0; t < T; t++) {
            int i = 3 * t;

            byte[] chunk = new byte[3];

            for (int j = 0; j < 3; j++) {
                if (i + j < archivo.length) {
                    chunk[j] = archivo[i + j]; // i, i + 1, i + 2
                } else {
                    chunk[j] = (byte)0;
                }
            }

            // Transmitir
            System.out.println("Transmitiendo chunk...");
            for (byte b : chunk) {
                System.out.printf("%02x ", b);
            }

            System.out.println();
        }

        Chunk chunks = new Chunk(archivo, 5);
        
        chunks.describe();
        
    }

}
