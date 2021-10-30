package com.mycompany.sesion3;

import java.util.Scanner;

public class EncontrarMinMax {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n;
        
        int min_n = Integer.MAX_VALUE;
        int max_n = Integer.MIN_VALUE;
        
        do {
            System.out.println("Dame N (mayor a cero):");
            n = scanner.nextInt(); scanner.nextLine();
            
            if (n > 0 && n < min_n) {
                min_n = n;
            }
            if (n > 0 && n > max_n) {
                max_n = n;
            }
        } while(n > 0);
        
        System.out.printf("Mínimo: %d | Máximo: %d\n", min_n, max_n);
        
        scanner.close();
        
    }
    
}
