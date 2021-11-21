package ipn.cic.jbs6arreglosmultidimensionales;

public class MultiplicarMatrices {
    
    public static void main(String[] args) {
        int[][] A = { {1, 2, 3}, {4, 5, 6} }; // 2x3
        
        int[][] B = { {4, 3, 2, 1}, {1, 2, 3, 4}, {3, 2, 1, 4} }; // 3x4
        
        int[][] C = { {0, 0, 0, 0}, {0, 0, 0, 0} }; // 2x4
        
        for (int i = 0; i < 2; i++) { // 2 filas de A
            for (int j = 0; j < 4; j++) { // 4 columnas de B
                int suma = 0;
                for (int k = 0; k < 3; k++) { // 3 columna/fila de A/B
                    suma = suma + A[i][k] * B[k][j];
                }
                C[i][j] = suma;
            }
        }
        
        for (int[] row : C) {
            for (int val : row) {
                System.out.printf("%d ", val);
            }
            System.out.println();
        }
    }
    
}
