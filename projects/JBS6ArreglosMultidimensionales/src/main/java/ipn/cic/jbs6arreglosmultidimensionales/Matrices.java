package ipn.cic.jbs6arreglosmultidimensionales;

public class Matrices {

    public static void main(String[] args) {
        
        int[][] mat2x2 = { {3, 4}, {5, 7} };
        
        for (int[] row : mat2x2) {
            for (int val : row) {
                System.out.printf("%d | ", val);
            }
            System.out.printf("@\n");
        }
        
        int[][] mat3x5 = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} };
        
        for (int[] row : mat3x5) {
            for (int val : row) {
                System.out.printf("%d | ", val);
            }
            System.out.printf("@\n");
        }
        
        int[][] mat4x2 = { {3, 2}, {5, 4}, {6, 7}, {3, 1} };
        
        int[][][] img3x2x5 = {
            { {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0} },
            { {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0} },
            { {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0} }
        };
        
        int[][][][] vid10x3x2x1 = {
            { { {1}, {7} }, { {9999999}, {-5} }, { {32}, {99} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
            { { {0}, {7} }, { {0}, {0} }, { {0}, {0} } },
        };
        
        
    }
    
}
