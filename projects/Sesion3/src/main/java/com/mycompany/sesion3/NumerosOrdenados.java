package com.mycompany.sesion3;

import java.util.Scanner;

public class NumerosOrdenados {

    public static void main(String[] args) {
        // 1. Solicita al usuario el valor T para leer T-parejas de números
        // 2. Solicita la pareja de números en cada iteración t-ésima
        // 3. Imprime la pareja de números poniendo el menor, espacio y el mayor

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el número de parejas:");
        int T = scanner.nextInt(); scanner.nextLine();
        
        for (int t = 0; t < T; t++) {
            System.out.println("Dame la pareja (separada por espacio):");    
            int a = scanner.nextInt();
            int b = scanner.nextInt(); scanner.nextLine();
            
            if (a < b) {
                System.out.printf("Pareja: %d %d\n", a, b);
            } else {
                System.out.printf("Pareja: %d %d\n", b, a);
            }
        }
    
        scanner.close();
    }

}
